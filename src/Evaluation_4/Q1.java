package Evaluation_4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        CountToken countToken =new CountToken();
        CountVowel countVowel = new CountVowel();
        IfNotVowel ifNotVowel = new IfNotVowel();

        Scanner sc = new Scanner(System.in);

       // int input = sc.nextInt();
        boolean flag=true;


        while(flag){
            System.out.println("Enter choice:");
            System.out.println("1.Count token");
            System.out.println("2.Count Vowel");
            System.out.println("3.If not Vowel");
            System.out.println("4 for exit");

            int input = sc.nextInt();

            switch (input){
                case 1: countToken.Count();
                        break;

                case 2: countVowel.Calculate();
                        break;

                case 3: ifNotVowel.Calculate();
                        break;
                case 4: flag=false;
                default:
                    System.out.println("Not valid choice");
                    break;
            }

        }


    }
}
