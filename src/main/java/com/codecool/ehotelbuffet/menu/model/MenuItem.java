package com.codecool.ehotelbuffet.menu.model;

public record MenuItem(MealType MealType, int Cost, MealDurability MealDurability) {
    public int getMealDurabilityInMinutes() {
        return switch (MealDurability) {
            case SHORT -> 30;
            case MEDIUM -> 120;
            case LONG -> 360;
            default -> 0;
        };
    }
}
