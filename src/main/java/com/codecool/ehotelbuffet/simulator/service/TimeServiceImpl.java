package com.codecool.ehotelbuffet.simulator.service;

import com.codecool.ehotelbuffet.simulator.service.TimeService;

import java.time.LocalDateTime;

public class TimeServiceImpl implements TimeService {
    private LocalDateTime currentTime;

    @Override
    public LocalDateTime getCurrentTime() {
        return currentTime;
    }

    @Override
    public LocalDateTime setCurrentTime(LocalDateTime time) {
        currentTime = time;
        return currentTime;
    }

    @Override
    public LocalDateTime increaseCurrentTime(int minutes) {
        currentTime = currentTime.plusMinutes(minutes);
        return currentTime;
    }
}
