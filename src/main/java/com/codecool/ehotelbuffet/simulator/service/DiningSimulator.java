package com.codecool.ehotelbuffet.simulator.service;

import com.codecool.ehotelbuffet.simulator.model.DiningSimulationResults;
import com.codecool.ehotelbuffet.simulator.model.DiningSimulatorConfig;

public interface DiningSimulator {
    DiningSimulationResults run(DiningSimulatorConfig config);
}
