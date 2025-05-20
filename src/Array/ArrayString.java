package Array;

import java.util.Arrays;

public class ArrayString {
    public static void main (String [] args) {
        String [] cars = {"BMW", "Tesla", "Jeep", "Fiat"};
        //Manipulando Array
        cars[2] = "Ferrari";
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[2]);
    }
}
