package ru.stqa.pft.sandbox;

public class MyFirstProgram {
   public static void main(String[] args){

     hello("World");
     hello("User");
     hello("Andrey");


     double len = 5;
     double len1 = 6;
     double width = 10;
     System.out.println(area(len));
     System.out.println(area(len1,width));
    }
    public static void hello(String somebody){



        System.out.println("Hello "+ somebody+"!");
    }
    public static double area(double l){
        return l*l;
    }
    public static double area(double a, double b){
       return a*b;
    }
}