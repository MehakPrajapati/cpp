import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekdayCounter {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2025, 6, 16);
        LocalDate endDate = LocalDate.of(2025, 8, 16);

        int mondayCount = 0;
        int tuesdayCount = 0;
        int fridayCount = 0;

        // Loop through each date
        while (!startDate.isAfter(endDate)) {
            DayOfWeek day = startDate.getDayOfWeek();

            switch (day) {
                case MONDAY:
                    mondayCount++;
                    break;
                case TUESDAY:
                    tuesdayCount++;
                    break;
                case FRIDAY:
                    fridayCount++;
                    break;
            }

            // Move to next day
            startDate = startDate.plusDays(1);
        }

        // Print the result
        System.out.println("Number of Mondays: " + mondayCount);
        System.out.println("Number of Tuesdays: " + tuesdayCount);
        System.out.println("Number of Fridays: " + fridayCount);
    }
}

