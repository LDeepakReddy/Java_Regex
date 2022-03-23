package com.blz.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pincode pattern validation program");
        String pinCode = "502303D";
        String regex = "^[1-9]{1}[0-9]{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        if (matcher.matches())
            System.out.println("PinCode is Valid");
        else
            System.out.println("PinCode is Invalid");
    }
}

