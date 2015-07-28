package com.jakewharton.threetenabp;

import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

import java.util.Date;

/**
 * Helper methods for converting between Android-Java and ThreeTenABP data types
 */
public class ThreeTenUtil {

    public static Date asDate(LocalDate localDate) {
        return new Date(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static LocalDate asLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
