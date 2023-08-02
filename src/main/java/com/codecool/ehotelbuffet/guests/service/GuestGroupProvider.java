package com.codecool.ehotelbuffet.guests.service;

import com.codecool.ehotelbuffet.guests.model.Guest;
import com.codecool.ehotelbuffet.guests.model.GuestGroup;

import java.util.List;

public interface GuestGroupProvider {
    List<GuestGroup> splitGuestsIntoGroups(List<Guest> guests, int groupCount, int maxGuestPerGroup);
}
