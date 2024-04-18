class Leap {

    boolean isLeapYear(int year) {
        boolean ans = false;

        if (year % 400 == 0)
            ans = true;

        else if (year % 4 == 0 && year % 100 != 0)
            ans = true;

        return ans;
    }

}
