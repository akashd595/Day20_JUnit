package com.bridgelabz.day20junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJUnitClass {
    public boolean checkFirstName(String name) {
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
