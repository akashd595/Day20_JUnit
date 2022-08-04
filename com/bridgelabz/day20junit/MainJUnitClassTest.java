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

    @Test
    public void givenFirstCharacterUpperCase_whenTestedLastName_shouldReturnTrue() {
        MainJUnitClass firstName = new MainJUnitClass();
        boolean result = firstName.checkFirstName("Das");
        assertTrue(result);
    }
    @Test
    public void emailCheck_shouldReturnTrue() {
        MainJUnitClass email = new MainJUnitClass();
        boolean result = email.checkEmail("akash595@gmail.com");
        assertTrue(result);
    }
    @Test
    public void mobileNumberFormatCheck_shouldReturnTrue() {
        MainJUnitClass mobileNumber = new MainJUnitClass();
        boolean result = mobileNumber.checkMobileNumber("91 9910162995");
        assertTrue(result);
    }
}