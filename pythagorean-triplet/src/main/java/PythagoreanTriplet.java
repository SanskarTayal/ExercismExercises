import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PythagoreanTriplet {
    int[] res = new int[3];

    PythagoreanTriplet(int a, int b, int c) {
        res[0] = a;
        res[1] = b;
        res[2] = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return Arrays.equals(res, that.res);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(res);
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();

    }

    static class TripletListBuilder {
        private static int sumOfTriplets;
        private static int maxOfEachTriplet = -1;

        boolean isPythagoreanTriplet(int a, int b, int c) {
            if (a > b || b > c)
                return false;
            if (a < 1 || b < 1 || c < 1)
                return false;
            return a * a + b * b == c * c;

        }

        TripletListBuilder thatSumTo(int sum) {
            sumOfTriplets = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            maxOfEachTriplet = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            if (maxOfEachTriplet < 0)
                maxOfEachTriplet = sumOfTriplets / 2;
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a <= maxOfEachTriplet; a++) {
                for (int b = a + 1; b <= maxOfEachTriplet; b++) {
                    int c = sumOfTriplets - b - a;
                    if (c <= maxOfEachTriplet && isPythagoreanTriplet(a, b, c)) {
                        triplets.add(new PythagoreanTriplet(a, b, c));
                        //System.out.println(a+" "+b+" "+c);
                    }
                }
            }
            return triplets;
        }

    }

}