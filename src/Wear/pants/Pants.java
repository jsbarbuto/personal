package Wear.pants;

import Wear.Clothes;

public class Pants extends Clothes {
    String fabric = "";

    public Pants(String fabric, String color, String length){
        super(color,length);
        this.fabric = fabric;
    }
}
