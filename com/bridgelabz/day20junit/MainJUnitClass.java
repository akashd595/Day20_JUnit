package com.bridgelabz.day20junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainJUnitClass {
    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^([a-zA-Z\\.]+)([a-zA-Z0-9\\.]+)@([a-zA-Z0-9\\._]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public boolean checkMobileNumber(String number) {
        Pattern pattern = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
