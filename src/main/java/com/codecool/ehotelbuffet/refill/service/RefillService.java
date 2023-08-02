package com.codecool.ehotelbuffet.refill.service;

import com.codecool.ehotelbuffet.menu.model.MenuItem;
import com.codecool.ehotelbuffet.menu.model.Portion;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

public interface RefillService {
    List<Portion> askForRefill(Map<MenuItem, Integer> menuItemToPortions);
}
