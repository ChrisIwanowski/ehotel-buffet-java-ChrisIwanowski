package com.codecool.ehotelbuffet.reservations.service;

import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.reservations.model.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationManager {
    void addReservation(Reservation reservation);
    List<Guest> getGuestsForDate(LocalDate date);
    List<Reservation> getAll();
}
