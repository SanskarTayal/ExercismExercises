import java.util.Arrays;

class ResistorColor {

    private static final String[] colorCode = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int i = 0; i < colorCode.length; i++) {
            if (color.equals(colorCode[i])) {
                return i;
            }
            //return Arrays.asList(colorCode).indexOf(color);
        }
        return -1;
    }

    String[] colors() {
        return colorCode;
    }
}
