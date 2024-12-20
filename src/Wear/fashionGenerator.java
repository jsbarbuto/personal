package Wear;
import Wear.pants.Pants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static Wear.pants.Pants.pantsToString;


public class fashionGenerator {
    //clothes data
    public static ArrayList<String> fabrics = new ArrayList<>(Arrays.asList("denim", "corduroy", "cotton"));
    public static ArrayList<String> lengthsPants = new ArrayList<>(Arrays.asList("Short", "Long"));
    public static ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "blue" , "green"));

    public ArrayList<String> lengthShirts = new ArrayList<>(Arrays.asList("tankTop", "ShortSleeve" , "LongSleeve"));

    public static Pants pantsCreator (ArrayList<String> fabrics, ArrayList<String> colors, ArrayList<String> lengths){
        Random x = new Random(); int aNumber1 = x.nextInt(fabrics.size());
        String aFabric = fabrics.get(aNumber1);

        Random y = new Random(); int aNumber2 = y.nextInt(colors.size());
        String aColor = colors.get(aNumber2);

        Random z = new Random(); int aNumber3 = z.nextInt(lengths.size());
        String aLength = lengths.get(aNumber3);

        return new Pants (aFabric, aLength, aColor);
    }

    Pants jean = pantsCreator (fabrics, colors, lengthsPants);

    ArrayList<Pants> pants = new ArrayList<>(Arrays.asList(jean));//pants that we have
    public int pantsLength = pants.size();

//////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        Pants jean = pantsCreator (fabrics,  colors, lengthsPants);
        System.out.println(pantsToString(jean));
        Pants shorts = pantsCreator (fabrics, colors, lengthsPants);
    }
}