package Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.add("pink");
        colors.add("white");
        colors.add("black");
        colors.add("orange");
        colors.add("green");
        colors.add("brown");
        colors.add("violet");

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
            String tmp = iterator.next();
        }

        System.out.println(colors);

    }
}
