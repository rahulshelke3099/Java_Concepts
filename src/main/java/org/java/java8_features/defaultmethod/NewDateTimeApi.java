package org.java.java8_features.defaultmethod;

//The existing java.util.Date and java.util.Calendar had several issues:
//
//        Immutability Issues:
//
//        Date and Calendar were mutable, making them thread-unsafe.
//        The new API provides immutable and thread-safe classes.
//        Poor Naming and Design:
//
//        Date represents both date and time, causing confusion.
//        Calendar was unnecessarily complex with an awkward API.
//        The new API follows ISO 8601 standards and is well-structured.
//        Time Zone Handling Issues:
//
//        Date didn’t have time zone support, requiring external libraries.
//        Java 8 introduced ZonedDateTime for better time zone management.
//        Manipulation Complexity:
//
//        Adding or subtracting days required manual calculation with Calendar.
//        The new API offers fluent methods like .plusDays() and .minusDays().

//Benefits of Java 8 Date & Time API
//        ✅ Immutable & Thread-Safe: Unlike Date and Calendar, these classes are immutable and thread-safe.
//        ✅ Better Readability & Simplicity: No more confusing Calendar or Date methods.
//        ✅ Time Zone Support: ZonedDateTime handles time zones effectively.
//        ✅ Fluent API for Date Manipulation: Methods like .plusDays(), .minusMonths() make it easy to work with dates.
//        ✅ Supports Period and Duration Calculation: Period for dates, Duration for times.
//        ✅ Follows ISO 8601 Standard: The format is more consistent and widely accepted.


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NewDateTimeApi {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(ZoneId.getAvailableZoneIds());
    }

}
