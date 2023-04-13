import java.util.stream.IntStream;

public class Multiples35 {

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
