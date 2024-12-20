package Wear;
import Wear.pants.Pants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class fashionGenerator {
    //clothes data
    public ArrayList<String> fabrics = new ArrayList<>(Arrays.asList("denim", "corduroy", "cotton"));
    public ArrayList<String> lengthsPants = new ArrayList<>(Arrays.asList("Short", "Long"));
    public ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "blue" , "green"));

    public ArrayList<String> lengthShirts = new ArrayList<>(Arrays.asList("tankTop", "ShortSleeve" , "LongSleeve"));


    Pants jean = new Pants("cotton","short","short");

    ArrayList<Pants> pants = new ArrayList<>(Arrays.asList(jean));//pants that we have
    public int pantsLength = pants.size();


    static public Random randomForShirt = new Random();//random number
    static public Random randomForAccessory = new Random();//random number

    static public Random randomForPants = new Random();//random number
    public int randomNumber = randomForPants.nextInt(pantsLength)+1;//random jean index//maybe need +1?
    public Boolean randomTorF = randomForPants.nextBoolean();//true or false?








    public static void main(String[] args) {


        System.out.println("Hello world!");
    }
}