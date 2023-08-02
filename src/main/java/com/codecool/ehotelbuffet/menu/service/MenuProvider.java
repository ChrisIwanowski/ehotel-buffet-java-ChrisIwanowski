package com.codecool.ehotelbuffet.menu.service;

import com.codecool.ehotelbuffet.menu.model.MenuItem;

import java.util.List;

public interface MenuProvider {
    List<MenuItem> getMenuItems();
}
