package Evaluation_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q2_1 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();

        switch (dow){
            case MONDAY:
                System.out.println("Its a start of week");
                break;

            case TUESDAY:
                System.out.println("Its a second day of week");
                break;

            case WEDNESDAY:
                System.out.println("Its a third day of week");
                break;

            case THURSDAY:
                System.out.println("Its a fourth day of week");
                break;

            case FRIDAY:
                System.out.println("Yayy!! Its a last day of week......enjoy your weekend");
                break;

            case SATURDAY:
                System.out.println("Its a weekend!!! majjani life");
                break;

            case SUNDAY:
                System.out.println("Last day of weekend:(");
                break;
        }
    }
}
//Output-
//        Its a fourth day of week
