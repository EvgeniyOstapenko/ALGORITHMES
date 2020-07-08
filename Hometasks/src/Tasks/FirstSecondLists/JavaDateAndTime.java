package Tasks.FirstSecondLists;



import java.time.LocalDate;

import java.io.*;

public class JavaDateAndTime {
    public static void main(String[] args) {
        System.out.println(findDay(5, 4, 1991));

    }

        public static String findDay(int month, int day, int year) {
            LocalDate ld = LocalDate.of(year, month, day);
            return ld.getDayOfWeek().name();
        }
    }



