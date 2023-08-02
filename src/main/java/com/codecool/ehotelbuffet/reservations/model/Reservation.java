package com.codecool.ehotelbuffet.reservations.model;

import com.codecool.ehotelbuffet.guests.model.Guest;

import java.time.LocalDate;

public record Reservation(LocalDate start, LocalDate end, Guest guest) {
}
