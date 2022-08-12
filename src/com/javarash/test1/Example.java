package com.javarash.test1;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Example {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime.format(dateTimeFormatter));
    }
}
