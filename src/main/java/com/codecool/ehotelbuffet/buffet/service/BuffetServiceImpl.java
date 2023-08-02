package com.codecool.ehotelbuffet.buffet.service;

import com.codecool.ehotelbuffet.menu.model.MealDurability;
import com.codecool.ehotelbuffet.menu.model.MealType;
import com.codecool.ehotelbuffet.menu.model.Portion;
import com.codecool.ehotelbuffet.menu.service.MenuProvider;
import com.codecool.ehotelbuffet.refill.service.RefillService;
import com.codecool.ehotelbuffet.refill.service.RefillStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BuffetServiceImpl implements BuffetService {
    private final MenuProvider menuProvider;
    private final RefillService refillService;
    private final List<Portion> currentPortions = new ArrayList<>();

    private boolean isInitialized;

    public BuffetServiceImpl(MenuProvider menuProvider, RefillService refillService) {
        this.menuProvider = menuProvider;
        this.refillService = refillService;
    }

    public void refill(RefillStrategy refillStrategy) {
    }

    public void reset() {
    }

    public boolean consume(MealType mealType) {
        return false;
    }

    public int collectWaste(MealDurability mealDurability, LocalDateTime currentDate) {
        return 0;
    }
}
