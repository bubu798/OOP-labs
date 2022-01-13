package lab9.dataprocessing;

import lab9.main.Utils;
import lab9.storage.DataRepository;

public class StepCountStrategyFactory {
    String strategyType;

    public StepCountStrategyFactory(String strategyType) {
        this.strategyType = strategyType;
    }

    public StepCountStrategy createStrategy(DataRepository dataRepository) {
        switch (strategyType) {
            case Utils.BASIC_STRATEGY: return new BasicStepCountStrategy(dataRepository);
            case Utils.FILTERED_STRATEGY: return new FilteredStepCountStrategy(dataRepository);
        }

        throw new IllegalArgumentException("The strategy type " + strategyType + " is not recognized.");
    }
}
