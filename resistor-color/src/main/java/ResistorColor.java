import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

class ResistorColor {

    private static final Map<String,Integer> colorCode = Map.ofEntries(entry("black",0),entry("brown",1), entry("red",2), entry("orange",3),entry("yellow",4),entry("green",5),entry("blue",6),entry("violet",7),entry("grey",8),entry("white",9) );
    private static final String[] allColors= {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
            if (colorCode.containsKey(color)) {
                return colorCode.get(color);
            }
            else
        throw new IllegalArgumentException("Invalid color: " + color);
    }

    String[] colors() {
        return allColors;
    }
}
