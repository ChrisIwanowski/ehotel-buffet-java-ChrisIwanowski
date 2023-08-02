package com.codecool.ehotelbuffet.menu.service;

import com.codecool.ehotelbuffet.menu.model.MealDurability;
import com.codecool.ehotelbuffet.menu.model.MealType;
import com.codecool.ehotelbuffet.menu.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuProviderImpl implements MenuProvider {
    private final List<MenuItem> menuItems = getMenuItems();

    private static List<MenuItem> generateMenuItems() {
        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem(MealType.SCRAMBLED_EGGS, 70, MealDurability.SHORT));
        items.add(new MenuItem(MealType.SUNNY_SIDE_UP, 70, MealDurability.SHORT));
        items.add(new MenuItem(MealType.FRIED_SAUSAGE, 100, MealDurability.SHORT));
        items.add(new MenuItem(MealType.FRIED_BACON, 70, MealDurability.SHORT));
        items.add(new MenuItem(MealType.PANCAKE, 40, MealDurability.SHORT));
        items.add(new MenuItem(MealType.CROISSANT, 40, MealDurability.SHORT));
        items.add(new MenuItem(MealType.MASHED_POTATO, 20, MealDurability.MEDIUM));
        items.add(new MenuItem(MealType.MUFFIN, 20, MealDurability.MEDIUM));
        items.add(new MenuItem(MealType.BUN, 10, MealDurability.MEDIUM));
        items.add(new MenuItem(MealType.CEREAL, 30, MealDurability.LONG));
        items.add(new MenuItem(MealType.MILK, 10, MealDurability.LONG));
        return items;
    }

    @Override
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
