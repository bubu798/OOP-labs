package lab9.dataprocessing;

import lab9.dataprocessing.StepCountStrategy;
import lab9.main.Utils;
import lab9.storage.DataRepository;

public class BasicStepCountStrategy implements StepCountStrategy {
    DataRepository dataRepository;

    public BasicStepCountStrategy(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public int getTotalSteps() {
        int suma = 0;

        for (int i = 0; i < dataRepository.getData().size(); i++) {
            suma += dataRepository.getData().get(i).getStepsCount();
        }

        return suma;
    }

    @Override
    public String getStrategyDescription() {
        return Utils.BASIC_STRATEGY;
    }
}
