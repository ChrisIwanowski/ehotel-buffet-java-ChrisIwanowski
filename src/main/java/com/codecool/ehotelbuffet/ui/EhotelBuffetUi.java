package com.codecool.ehotelbuffet.ui;

import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.reservations.service.ReservationManager;
import com.codecool.ehotelbuffet.reservations.service.ReservationProvider;
import com.codecool.ehotelbuffet.simulator.model.DiningSimulationResults;
import com.codecool.ehotelbuffet.simulator.model.DiningSimulatorConfig;
import com.codecool.ehotelbuffet.simulator.service.DiningSimulator;

import java.time.LocalDateTime;
import java.util.List;

public class EhotelBuffetUi {
    private final ReservationManager reservationManager;
    private final DiningSimulator diningSimulator;
    private final ReservationProvider reservationProvider;

    public EhotelBuffetUi(ReservationProvider reservationProvider, ReservationManager reservationManager,
                          DiningSimulator diningSimulator) {
        this.reservationProvider = reservationProvider;
        this.reservationManager = reservationManager;
        this.diningSimulator = diningSimulator;
    }

    public void run() {
        int guestCount = 20;
        LocalDateTime seasonStart = LocalDateTime.now();
        LocalDateTime seasonEnd = LocalDateTime.now().plusDays(3);

        List<Guest> guests = getGuests();
        createReservations(guests, seasonStart, seasonEnd);

        printGuestsWithReservations();

        LocalDateTime currentDate = seasonStart;

        while (currentDate.isBefore(seasonEnd)) {
            DiningSimulatorConfig simulatorConfig = new DiningSimulatorConfig(
                    currentDate.plusHours(6),
                    currentDate.plusHours(10),
                    30,
                    3);

            DiningSimulationResults results = diningSimulator.run(simulatorConfig);
            printSimulationResults(results);
            currentDate = currentDate.plusDays(1);
        }
    }

    private List<Guest> getGuests() {
        return null;
    }

    private void createReservations(List<Guest> guests, LocalDateTime seasonStart, LocalDateTime seasonEnd) {
    }

    private void printGuestsWithReservations() {
    }

    private static void printSimulationResults(DiningSimulationResults results) {
    }
}
