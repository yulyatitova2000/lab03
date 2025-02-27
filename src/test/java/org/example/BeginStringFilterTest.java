package org.example;

import org.example.filters.BeginStringFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {
    @Test
    void apply() {
        String str = "Мама мыла раму";
        BeginStringFilter filter1 = new BeginStringFilter("Мама");
        BeginStringFilter filter2 = new BeginStringFilter("мыла");

        assertTrue(filter1.apply(str));
        assertFalse(filter2.apply(str));
    }
}