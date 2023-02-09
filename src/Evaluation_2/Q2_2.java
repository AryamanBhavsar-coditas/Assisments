package Evaluation_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q2_2 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();

        String doow = dow.toString();

        String array[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};

        for(int i=0;i<=array.length-1;i++){
            if(doow == array[i]){
                continue;
            }

            else
                System.out.println(array[i]);
        }

    }
}
//Output-
//
//        MONDAY
//        TUESDAY
//        WEDNESDAY
//        FRIDAY
//        SATURDAY
//        SUNDAY