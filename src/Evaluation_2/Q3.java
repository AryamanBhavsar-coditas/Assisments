package Evaluation_2;

public class Q3 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int sum2=0;

        System.out.println("Array is:");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]);
        }


        System.out.println();
        for(int i=0;i< array.length;i=i+2){
            sum=sum+array[i];
        }

        System.out.println();
        for(int i=1;i< array.length;i=i+2){
            sum2=sum2+array[i];
        }

        System.out.println("Sum of even terms is: "+sum);

        System.out.println("Sum of odd terms is: "+sum2);
    }
}
//Output-
//        Array is:
//        12345678910
//
//        Sum of even terms is: 25
//        Sum of odd terms is: 30