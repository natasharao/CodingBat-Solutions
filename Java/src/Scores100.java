/**
 * Created by Natasha on 7/22/18.
 */
public class Scores100 {

    public static boolean scores100(int[] scores) {
        boolean adjhundred = false;
        for (int i = 0; i < scores.length-1; i++){
            if (scores[i] == 100 && scores [i+1] == 100){
                return true;
            }
        }
        return false;
    }

    public static void main (String [] args) {

        //Test Cases
        System.out.println(true == scores100(new int[]{1,100,100}));
        System.out.println(true == scores100(new int[]{100,1,100,100}));
        System.out.println(false == scores100(new int[]{1,100,99,100}));
        System.out.println(false == scores100(new int[]{756,2,25,32}));
    }
}
