import java.util.Objects;

public class Twofer {
    public String twofer(String name) {
        String greetingName= Objects.isNull(name)?"you":name;
        return ("One for " + greetingName + ", one for me.");
    }
}
