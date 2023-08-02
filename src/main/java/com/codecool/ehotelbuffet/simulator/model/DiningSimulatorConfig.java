package com.codecool.ehotelbuffet.simulator.model;

import java.time.temporal.ChronoUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DiningSimulatorConfig {
    public final int cycles;
    public final LocalDateTime start;
    public final LocalDateTime end;
    public final int cycleLengthInMinutes;
    public final int minimumGroupCount;

    public DiningSimulatorConfig(LocalDateTime start, LocalDateTime end, int cycleLengthInMinutes, int minimumGroupCount) {
        this.start = start;
        this.end = end;
        this.cycleLengthInMinutes = cycleLengthInMinutes;
        this.minimumGroupCount = minimumGroupCount;

        long diffInMinutes = ChronoUnit.MINUTES.between(start, end);
        this.cycles = (int) (diffInMinutes / cycleLengthInMinutes);
    }
}

