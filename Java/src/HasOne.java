/**
 * Created by Natasha Rao on 7/22/18.
 */
public class HasOne {

    public static boolean hasOne(int n) {
        while (n!=0){
            if(n%10 == 1){
                return true;
            }
            n/=10;
        }
        return false;
    }

    public static void main (String [] args){

        //Test Cases
        System.out.println(true == hasOne(120));
        System.out.println(false == hasOne(0));
        System.out.println(true == hasOne(9011));
        System.out.println(false == hasOne(2002));
    }

}
