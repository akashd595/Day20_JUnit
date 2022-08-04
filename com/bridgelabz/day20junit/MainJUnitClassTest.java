package com.bridgelabz.day20junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainJUnitClassTest {
    
    @Test
    public void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue() {
        MainJUnitClass firstName = new MainJUnitClass();
        boolean result = firstName.checkFirstName("Akash");
        assertTrue(result);
    }

}