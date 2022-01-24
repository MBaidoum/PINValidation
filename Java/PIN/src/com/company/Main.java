package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pin1 = "1747";
        String pin2 = "471747";
        String pin3 = "1a47";
        String pin4 = "4 1747";
        String pin5 = "";
        String pin6 = "a24576";

        pinCheck(pin1);
        pinCheck(pin2);
        pinCheck(pin3);
        pinCheck(pin4);
        pinCheck(pin5);
        pinCheck(pin6);
    }

    public static void pinCheck(String pin) {
        Pattern pattern = Pattern.compile("^[0-9][0-9][0-9][0-9]$");
        Matcher matcher = pattern.matcher(pin);
        if(matcher.find()) {
            System.out.println("True");
        } else {
            Pattern pattern2 = Pattern.compile("^[0-9][0-9][0-9][0-9][0-9][0-9]$");
            Matcher matcher2 = pattern2.matcher(pin);
            if(matcher2.find()) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
