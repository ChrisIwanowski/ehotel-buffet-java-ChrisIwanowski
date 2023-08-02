package com.codecool.ehotelbuffet.guests.model;

public record GuestGroup(int id, Iterable<Guest> guests) {}