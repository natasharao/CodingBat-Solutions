/**
 * Created by angna on 7/22/18.
 */
public class LoneSum {

    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a == b && b == c)
            return 0;

        if ( a == b )
            return c;

        if ( a == c )
            return b;

        if ( b == c )
            return a;

        return sum = a + b + c;
    }

    public static void main (String [] args){

        //Test Cases
        System.out.println(6 == loneSum(1,2,3));
        System.out.println(0 == loneSum(3,3,3));
        System.out.println(14 == loneSum(2,9,3));
        System.out.println(3 == loneSum(1,3,1));
    }

}
