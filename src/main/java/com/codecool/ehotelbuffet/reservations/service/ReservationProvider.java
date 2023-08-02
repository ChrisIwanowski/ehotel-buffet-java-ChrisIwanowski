package com.codecool.ehotelbuffet.reservations.service;

import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.reservations.model.Reservation;

import java.time.LocalDate;

public interface ReservationProvider {
    Reservation provide(Guest guest, LocalDate seasonStart, LocalDate seasonEnd);
}
