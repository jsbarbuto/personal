package Wear;

public abstract class Clothes {

    String color = "";
    String length = "";

    public  Clothes (String color, String length){
        this.color = color;
        this.length = length;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setLength(String length){
        this.length = length;
    }
    public String getLength(){
        return this.length;
    }

}
