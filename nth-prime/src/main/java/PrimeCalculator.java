class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1)
            throw new IllegalArgumentException();

        int currentPrimePosition = 0;
        int currentNumberToCheck = 2;
        int currentPrimeNumber = 0;

        //Checking prime numbers till we find nth position prime number
        while (currentPrimePosition != nth) {
            if (isPrime(currentNumberToCheck)) {
                currentPrimePosition++;
                currentPrimeNumber=currentNumberToCheck;
            }
            currentNumberToCheck++;
        }
        return currentPrimeNumber;
    }

    boolean isPrime(int num) {
        if (num == 2)
            return true;
        //Checking if number is divisible by any number till number/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
