/**
 * Created by Natasha on 7/22/18.
 */
public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String [] args){
        // Test Cases
        System.out.println(55==fibonacci(10));
        System.out.println(0==fibonacci(0));
        System.out.println(1==fibonacci(1));
        System.out.println(13==fibonacci(7));
    }

}
