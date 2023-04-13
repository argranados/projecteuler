public class Multiples35 {

    public static void main(String[] args) {
        int result = Multiples35.sum();
        System.out.println(result);
    }

    public static int sum(){
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum += i;
        }
        return sum;
    }
}
