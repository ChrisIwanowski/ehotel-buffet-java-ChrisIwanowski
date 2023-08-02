package com.codecool.ehotelbuffet.menu.model;

import java.time.LocalDateTime;

public record Portion(MenuItem menuItem, LocalDateTime timeStamp) {
}
