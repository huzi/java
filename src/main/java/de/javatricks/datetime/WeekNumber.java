/*
 * Copyright (c) CompuGroup Medical Software GmbH,
 * This software is the confidential and proprietary information of
 * CompuGroup Medical Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGroup Medical Software GmbH.
 */
package de.javatricks.datetime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by thomas18 on 05.07.2016.
 */
public class WeekNumber {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM. yyyy");
        Date date = getDateFromWeekNumber(2015, 53);
        System.out.println(sdf.format(getDateFromWeekNumber(2015, 53)));

        int weekNumber = getWeekNumberFromDate(date);
        System.out.println(weekNumber);

        LocalDate localDate = LocalDate.of(2016, Month.JANUARY, 3);
        weekNumber = getWeekNumberForDateJava8(localDate);
        System.out.println(weekNumber);
        System.out.println(localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));

        getLocalDateForWeek();

    }

    private static void getLocalDateForWeek() {
        int year = 2015;
        int weekNumber = 53;
        LocalDate date = LocalDate.of(year, Month.JANUARY, 10);
        LocalDate dayInWeek = date.with(IsoFields.WEEK_OF_WEEK_BASED_YEAR, weekNumber);
        LocalDate start = dayInWeek.with(DayOfWeek.MONDAY);
        System.out.println(start);
    }

    public static int getWeekNumberFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public static Date getDateFromWeekNumber(int year, int weekNumber) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.WEEK_OF_YEAR, weekNumber);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return cal.getTime();
    }

    private static int getWeekNumberForDateJava8(LocalDate date) {
        TemporalField woy = WeekFields.of(Locale.CANADA).weekOfWeekBasedYear();
        return date.get(woy);
    }
}
