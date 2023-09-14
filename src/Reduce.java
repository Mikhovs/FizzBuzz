public class Reduce {
    public static void main(String[] args) {

        int n = 100;
        int counter = 0;
        boolean even = n % 2 == 0;
        boolean odd = n % 2 > 0;

        while (n > 0) {
            if (even){
                n = n/2;
            } else if (odd) {
                n = n - 1;
            }
            counter++;
        }
        System.out.println(counter);

    }
}
