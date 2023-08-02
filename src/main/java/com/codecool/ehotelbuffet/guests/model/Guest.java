package com.codecool.ehotelbuffet.guests.model;

import com.codecool.ehotelbuffet.menu.model.MealType;

public record Guest(String name, GuestType guestType) {
    public MealType[] getMealPreferences(){
        return null;
    }
}