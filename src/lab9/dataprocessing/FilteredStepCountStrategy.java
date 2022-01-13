package lab9.dataprocessing;

import lab9.dataprocessing.StepCountStrategy;
import lab9.main.Utils;
import lab9.storage.DataRepository;

import java.util.concurrent.TimeUnit;

public class FilteredStepCountStrategy implements StepCountStrategy {
    DataRepository dataRepository;

    private static final int MAX_DIFF_STEPS_CONSECUTIVE_RECORDS = 1000;
    private static final long TIME_FOR_MAX_DIFF = TimeUnit.SECONDS.toMillis(1);

    public FilteredStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int suma = 0;

        // pentru primul
        if (dataRepository.getData().get(0).getStepsCount() > 0) {
            suma += dataRepository.getData().get(0).getStepsCount();
        }

        for (int i = 1; i < dataRepository.getData().size(); i++) {
            if (dataRepository.getData().get(i).getStepsCount() > 0) {
                if (dataRepository.getData().get(i).getStepsCount() < MAX_DIFF_STEPS_CONSECUTIVE_RECORDS) {
                    suma += dataRepository.getData().get(i).getStepsCount();
                } else {
                    if (dataRepository.getData().get(i).getTimestamp()
                            - dataRepository.getData().get(i - 1).getTimestamp() > TIME_FOR_MAX_DIFF) {
                        suma += dataRepository.getData().get(i).getStepsCount();
                    }
                }
            }
        }

        return suma;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.FILTERED_STRATEGY;
    }
}
