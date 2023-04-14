package javacode;

import java.util.stream.IntStream;

public class Multiples35 {
    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static void main(String[] args) {
        int result = Multiples35.sum();
        System.out.println(result);
        System.out.println(sumStream());
    }

    public static int sum(){
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        return sum;
    }

    public static int sumStream(){
        int sum =IntStream.rangeClosed(1,1000)
                .filter(i -> (i%3 == 0) || (i%5 == 0))
                .reduce(0,(a,b)-> a+b); // Integer::sum
        return sum;
    }
}
