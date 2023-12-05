package org.ot5usk.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DateBuilder {

    public static String buildRandomDate() {
        long from =  LocalDate.of(1000, 1, 1).toEpochDay();
        long to = LocalDate.now().toEpochDay();
        long random = ThreadLocalRandom.current().longs(from, to).findAny().orElse(1000);
        return LocalDate.ofEpochDay(random).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static LocalDate convertToLocalDateViaMillisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}
