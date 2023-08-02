package com.codecool.ehotelbuffet.guests.service;

import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.guests.model.GuestType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGuestGenerator {
    private static final Random random = new Random();

    private static final String[] NAMES = {
            "Georgia", "Savannah", "Phoenix", "Winona", "Carol", "Brooklyn", "Talullah", "Scarlett", "Ruby", "Lola",
            "Cleo", "Beatrix", "Mika", "Everly", "Kiki", "Rae", "Arya", "Elsa", "Lulu", "Zelda",
            "Felix", "Finn", "Theo", "Hugo", "Archie", "Magnus", "Lucian", "Enzo", "Otto", "Nico", "Rhys",
            "Rupert", "Hugh", "Finley", "Ralph", "Lewis", "Wilbur", "Alfie", "Ernest", "Chester", "Ziggy"
    };

    public List<Guest> provide(int quantity) {
        List<Guest> guests = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            guests.add(generateRandomGuest());
        }
        return guests;
    }

    private static Guest generateRandomGuest() {
        return new Guest(getRandomName(), getRandomType());
    }

    private static String getRandomName() {
        return null;
    }

    private static GuestType getRandomType() {
        return null;
    }
}
