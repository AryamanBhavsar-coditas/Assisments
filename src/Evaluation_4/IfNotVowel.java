package Evaluation_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class IfNotVowel {
    public void Calculate(){

        String str = "Aryaman";
        String result="";

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' ||
                    str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' ||
                    str.charAt(i)=='u' || str.charAt(i)=='U' )){
                c++;
            }
            result = result+c;
        }


        System.out.println(result);
    }

}
