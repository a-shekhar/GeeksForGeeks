import java.time.LocalDate;

class Solution {
    static String findDay(int Day, int Month, int Year) {
        LocalDate date = LocalDate.of(Year, Month, Day);
        return date.getDayOfWeek().toString();
    }
}