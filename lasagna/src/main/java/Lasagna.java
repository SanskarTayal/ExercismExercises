public class Lasagna {
    private final int expectedMinutes = 40;

    public int expectedMinutesInOven(){
        return expectedMinutes;
    }
    public int remainingMinutesInOven(int timeBeenInOven){
        return expectedMinutesInOven() - timeBeenInOven;
    }

    public int preparationTimeInMinutes(int layers){
        int timeRequiredPerLayer = 2;
        return timeRequiredPerLayer * layers;
    }

    public int totalTimeInMinutes(int layers, int timePassedInOven){
        return preparationTimeInMinutes(layers)+timePassedInOven;
    }
}
