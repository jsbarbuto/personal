package Wear.Accessories;

public class Rings extends Accessory{

    public String material = "";
    public int ringCount;


    public Rings(String material, int count, boolean hat){
        super("Ring", hat);
        this.material = material;
        this.ringCount = count;
    }
}
