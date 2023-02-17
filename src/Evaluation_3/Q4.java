package Evaluation_3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

class Vehicle{
    String Company="Force";
    int price;
}

class LightMotorVehicle extends Vehicle{
    int Mileage=20;
    @Override
    public String toString() {
        super.price=20000;
        return "LightMotorVehicle{" +
                "Mileage=" + Mileage +
                ", Company='" + Company + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}

class HeavyMotorVehicle extends Vehicle{
    int CapacityInTons=100;

    @Override
    public String toString() {

        super.price=80000;
        return "HeavyMotorVehicle{" +
                "CapacityInTons=" + CapacityInTons +
                ", Company='" + Company + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LightMotorVehicle lightMotorVehicle = new LightMotorVehicle();
        HeavyMotorVehicle heavyMotorVehicle = new HeavyMotorVehicle();

        System.out.println("CHOOSE YOUR VEHICLE TYPE");
        System.out.println("1.Light Motor Vehicle");
        System.out.println("2.Heavy Motor Vehicle");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(lightMotorVehicle);
                break;

            case 2:
                System.out.println(heavyMotorVehicle);
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }
}
//Output-
//        CHOOSE YOUR VEHICLE TYPE
//        1.Light Motor Vehicle
//        2.Heavy Motor Vehicle
//        Enter your choice:
//        2
//        HeavyMotorVehicle{CapacityInTons=100, Company='Force', price=80000}
