package org.courses.ex2_2;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        String color = "Grey";

        Car car1 = new Car();

        Car car2 = new Car(year);

        Car car3 = new Car(color, year);

        System.out.println(car1.getYear() + " " + car1.getColor());
        System.out.println(car2.getYear() + " " + car2.getColor());
        System.out.println(car3.getYear() + " " + car3.getColor());

    }
}
