package Evaluation_4;

import java.util.StringTokenizer;

public class CountToken {
    public void Count(){
        StringTokenizer stringTokenizer = new StringTokenizer("Hello everyone, How are you?"," ");

        int count=0;

        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            count++;
        }

        System.out.println("There are "+count+" tokens");
    }
}
