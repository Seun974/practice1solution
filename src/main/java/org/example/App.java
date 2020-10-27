package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /**String with my names**/

        String myFirstName = "Samuel";
        System.out.println(myFirstName);
        String myLastName = "Adetoye";
        System.out.println(myFirstName + " " + myLastName);

        /**Sum of variables below; **/

        double var1 = 10.50;
        double var2 = 5.55;
        double result = var1 + var2;
        System.out.println(result);

        //objects to be assigned to class Car

        Car toyota = new Car();
        //For another car just repeat top line below and so on...
        toyota.carBrand = "Camry";
        toyota.registrationNumber = "PAX";
        toyota.maxSpeed = 200;
        toyota.ownerName = "Samuel"+" Adetoye";
        System.out.println(toyota.getInformation());

       int score = 50;
       if(score >= 65) {
           System.out.println("you passed");
       }else if(score <= 65) {
           System.out.println("you did not pass");
       }

        Scanner in = new Scanner(System.in);
        System.out.println("What city are you in?");
        String name = in.nextLine();
        System.out.println("The name of your city is " + name);

    }
}

/**Assigning of class car; **/
class Car {
    String carBrand;                //name of car maker
    String registrationNumber;      //car registration details
    int maxSpeed;                   //how many kms per hour
    String ownerName;               //name of car owner

    public String getInformation() {
        return "The " + carBrand + " vehicle" + ","+ " with reg number " + registrationNumber + " is running at a speed of " + maxSpeed + " km/hr and it is owned by " + ownerName + ".";
    }

}


