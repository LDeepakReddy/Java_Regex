package com.blz.java.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static void main(String[] args) {
        System.out.println("Welcome to the Email Validation program");
        String email="abc.xyz@bridgelabz.co.in";
        String regex="^[a-z0-9]+[.+_-]([a-z]+)*@[a-z]+.[a-z]{2,3}[._+-][a-z]{2}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            System.out.println("email is valid");
        else
            System.out.println("email is invalid");
    }
}
