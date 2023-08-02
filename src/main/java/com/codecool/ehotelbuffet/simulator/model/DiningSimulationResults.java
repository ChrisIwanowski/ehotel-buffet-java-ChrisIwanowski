package com.codecool.ehotelbuffet.simulator.model;

import com.codecool.ehotelbuffet.guests.model.Guest;

import java.time.LocalDateTime;
import java.util.List;

public record DiningSimulationResults(
        LocalDateTime date,
        int totalGuests,
        int foodWasteCost,
        List<Guest> happyGuests,
        List<Guest> unhappyGuests) {}
