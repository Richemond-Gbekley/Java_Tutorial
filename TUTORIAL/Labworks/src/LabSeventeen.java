public class LabSeventeen {
    //MorePrimes
        public static void main(String[] args) {

            long[] primes = new long[20]; // Array to store

            primes[0] = 2; // Seed the first prime

            primes[1] = 3;// and the second

            int count = 2;//count of prime found - up to rows

// which is also the array index

            long number = 5; // Next integer to be tested

            outer:
            for (; count < primes.length; number += 2) { // The maximum divisor we need to try is square root of number
                long limit = (long) Math.ceil(Math.sqrt((double) number));

                // Divide by all the primes we have to limit

                for (int i = 1; i < count && primes[i] <= limit; i++) {

                    if (number % primes[i] == 0) {

                        // Is it an exact divisor?
                        continue outer;
                        // Yes, try the next number
                    }
                }
                primes[count++] = number;
                // We got one!
            }
            for (int i = 0; i < primes.length; i++)
                System.out.println(primes[i]); // Output all the primes
        }

}
