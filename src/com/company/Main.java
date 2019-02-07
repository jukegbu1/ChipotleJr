package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

     Random rand = new Random();

//Array of food options
//      String[] type = {"bowl", "tacos", "buritto"};
        String[] rice = {"white rice", "brown rice", "no rice"};
        String[] meat = {"chicken meat" , "steak meat" ,"carnidas meat" ,"chorizo meat" ,"sofritas meat" ,"just veggies"};
        String[] beans = {"pinto beans" ,"black beans" ,"no beans"};
        String[] veggies = {"lettuce" ,"fajita veggies" , "no veggies"};
        String[] salsa = {"mild salsa" ,"medium salsa" , "hot salsa" , "no salsa"};

//Welcome user
System.out.println("Welcome to Chipotle! Let's make yummy food now!");

for (int i=1; i<=10; i++){
//    int t = rand.nextInt(3);
    int r = rand.nextInt(3);
    int m = rand.nextInt(6);
    int b = rand.nextInt(3);
    int v = rand.nextInt(3);
    int s = rand.nextInt(4);
    System.out.println("Your Chipotle is done as has the following yummy items" +" " + ":"+ " "+ i + " " +  rice[r]+ "," +"" +
            " "+meat[m]+","+" "+beans[b]+","+" "+salsa[s]+","+" " + ""+veggies[v]);
        }
    }
}
