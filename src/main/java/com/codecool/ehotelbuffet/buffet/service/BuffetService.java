package com.codecool.ehotelbuffet.buffet.service;

import com.codecool.ehotelbuffet.menu.model.MealDurability;
import com.codecool.ehotelbuffet.menu.model.MealType;
import com.codecool.ehotelbuffet.refill.service.RefillStrategy;

import java.time.LocalDateTime;

public interface BuffetService {
    void refill(RefillStrategy refillStrategy);

    boolean consume(MealType mealType);

    int collectWaste(MealDurability mealDurability, LocalDateTime currentDate);

    void reset();
}
