package Wear.pants;

import Wear.Clothes;

public class Pants extends Clothes {
    public String fabric = "";
//    public String color = "";
//    public String length = "";

    public void setFabric(String fabric){
        this.fabric = fabric;
    }
    public String getFabric(){
        return this.fabric;
    }


    public Pants(String fabric, String color, String length){
        super(color,length);
        setFabric(fabric);
    }

    public static String pantsToString( Pants aPants){
        String a = ("pants : ");
        String b = (aPants.getFabric()+ ", ");
        String c = (aPants.getColor() + ", ");
        String d = (aPants.getLength() + ".");
        return a+b+c+d;
    }
}
