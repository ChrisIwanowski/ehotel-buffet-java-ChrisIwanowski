package com.codecool.ehotelbuffet.simulator.service;

import java.time.LocalDateTime;

public interface TimeService {
    LocalDateTime getCurrentTime();
    LocalDateTime setCurrentTime(LocalDateTime time);
    LocalDateTime increaseCurrentTime(int minutes);
}
