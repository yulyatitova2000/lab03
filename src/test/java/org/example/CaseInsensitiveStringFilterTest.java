package org.example;

import org.example.filters.CaseInsensitiveStringFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseInsensitiveStringFilterTest {

    @Test
    void apply() {
        String str = "Мама мыла раму";
        CaseInsensitiveStringFilter filter1 = new CaseInsensitiveStringFilter("МаМа");
        CaseInsensitiveStringFilter filter2 = new CaseInsensitiveStringFilter("РАМУ");
        CaseInsensitiveStringFilter filter3 = new CaseInsensitiveStringFilter("мала");

        assertTrue(filter1.apply(str));
        assertTrue(filter2.apply(str));
        assertFalse(filter3.apply(str));
    }
}