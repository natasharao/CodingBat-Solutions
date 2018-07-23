/**
 * Created by Natasha Rao on 7/23/18.
 */
public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep = false;
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main (String [] args){
        //Test Cases
        System.out.println(true == sleepIn(false, true));
        System.out.println(true == sleepIn(true, true));
        System.out.println(false == sleepIn(true, false));
        System.out.println(true == sleepIn(false, false));
    }

}
