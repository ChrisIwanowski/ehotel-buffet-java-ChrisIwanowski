package com.codecool.ehotelbuffet.simulator.service;

import com.codecool.ehotelbuffet.buffet.service.BuffetService;
import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.guests.service.GuestGroupProvider;
import com.codecool.ehotelbuffet.reservations.service.ReservationManager;
import com.codecool.ehotelbuffet.simulator.model.DiningSimulationResults;
import com.codecool.ehotelbuffet.simulator.model.DiningSimulatorConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BreakfastSimulator implements DiningSimulator {
    private static final Random random = new Random();

    private final BuffetService buffetService;
    private final ReservationManager reservationManager;
    private final GuestGroupProvider guestGroupProvider;
    private final TimeService timeService;

    private final List<Guest> happyGuests = new ArrayList<>();
    private final List<Guest> unhappyGuests = new ArrayList<>();

    private int foodWasteCost;

    public BreakfastSimulator(BuffetService buffetService, ReservationManager reservationManager,
                              GuestGroupProvider guestGroupProvider, TimeService timeService) {
        this.buffetService = buffetService;
        this.reservationManager = reservationManager;
        this.guestGroupProvider = guestGroupProvider;
        this.timeService = timeService;
    }

    public DiningSimulationResults run(DiningSimulatorConfig config) {
        return null;
    }

    private void resetState() {
        foodWasteCost = 0;
        happyGuests.clear();
        unhappyGuests.clear();
        buffetService.reset();
    }
}
