package com.codecool.ehotelbuffet.refill.service;

import com.codecool.ehotelbuffet.menu.model.MenuItem;
import com.codecool.ehotelbuffet.menu.model.Portion;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicRefillStrategy implements RefillStrategy {
    private final int optimalPortionCount = 3;

    @Override
    public Map<MenuItem, Integer> getInitialQuantities(List<MenuItem> menuItems) {
        Map<MenuItem, Integer> ret = new HashMap<>();
        for (MenuItem menuItem : menuItems) {
            ret.put(menuItem, optimalPortionCount);
        }
        return ret;
    }

    @Override
    public Map<MenuItem, Integer> getRefillQuantities(List<Portion> currentPortions) {
        return null;
    }
}
