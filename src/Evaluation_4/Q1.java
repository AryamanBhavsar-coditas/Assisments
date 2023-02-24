package Evaluation_4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        CountToken countToken =new CountToken();
        CountVowel countVowel = new CountVowel();
        IfNotVowel ifNotVowel = new IfNotVowel();
        System.out.println();
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter -1 to terminate");
        System.out.println();
        System.out.println("Enter choice:");
        System.out.println("1.Count token");
        System.out.println("2.Count Vowel");
        System.out.println("3.If not Vowel");
        int input = sc.nextInt();


        if(input>0){

            //int input = sc.nextInt();

            switch (input){
                case 1: countToken.Count();
                        break;

                case 2: countVowel.Calculate();
                        break;

                case 3: ifNotVowel.Calculate();
                        break;

                default:
                    System.out.println("Not valid choice");
                    break;
            }

        }

        else
            System.out.println("Thaank-You");


    }
}
