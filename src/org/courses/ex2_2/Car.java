package org.courses.ex2_2;

public class Car {

   private  int year;
   private String color;

   public Car(){
      this.year = 2021;
      this.color = "Black";
   }

   public Car(int year){
      this.year = year;
      this.color = "Black";
   }

   public Car(String color,int year){
      this.color = color;
      this.year = year;
   }

   public int getYear() {
      return year;
   }

   public String getColor(){
      return color;
   }
}
