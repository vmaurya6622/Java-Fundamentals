package org.example.Java8;
/*
    Following date-time classes were included in the new update in java 8:
        - Zoned Date Time
        - Local Date
        - Local Time
        - Instant
        - Duration
        - DateTimeFormatter
        - Local Date Time
        - Period
    After java8 the datetime were become immutable and thread-safe.
    Fluent API: where they introduced method chaining and intuitive naming which improves readability.
    Time Zones: New support for time zones;
    After the update parsing and formatting with dateTimeFormatter made easier. Also, it has simplified date and time calculations.
*/

import java.sql.SQLOutput;
import java.time.*;
import java.util.Set;

public class DateTime {
    static void main() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate randomDay = LocalDate.of(1947,8,15);
        System.out.println(randomDay);
        LocalDate localDate = now.minusMonths(13);
        System.out.println(localDate);
        if(localDate.isLeapYear()) System.out.println("It is a leap year");
        else System.out.println("It is not a leap year");

        //Local Time
        LocalTime current = LocalTime.now();
        System.out.println("Printing using LocalTime: "+current.getHour());
        System.out.println("Printing using LocalTime: "+current.getMinute());
        System.out.println("Printing using LocalTime: "+current.getSecond());

        //Local DateTime
        LocalDateTime L1=LocalDateTime.now();
        System.out.println("Printing using LocalDateTime: "+L1);

        //Zoned DateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Printing using ZonedDateTime: "+zonedDateTime);
        Set<String> availableidsforzone = ZoneId.getAvailableZoneIds();
        System.out.println("Available Zone Ids for Zone: "+availableidsforzone);

        //Instant
        long l=System.currentTimeMillis(); // to get current millisecond
        Instant timeInstant = Instant.now();
        System.out.println("Using Instant "+timeInstant);

        //Time Duration
        Instant start = Instant.now();
        int sum=0;
        for(int i=0;i<10000;i++){sum+=i;}
        Instant end = Instant.now();
        Duration totalDurationBetween =  Duration.between(start, end);
        System.out.println("Total duration of code run is: "+totalDurationBetween.toMillis()+" milliseconds");
    }
}
