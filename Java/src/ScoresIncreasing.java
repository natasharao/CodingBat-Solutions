/**
 * Created by Natasha Rao on 7/23/18.
 */
public class ScoresIncreasing {

    public static boolean scoresIncreasing(int[] scores) {
        boolean increasing = true;

        for (int i = 0; i < scores.length-1; i++){
            if (scores[i] > scores [i+1]) increasing = false;
        }
        return increasing;
    }

    public static void main (String [] args){
        //Test Cases
        System.out.println(true == scoresIncreasing(new int[]{1,3,4}));
        System.out.println(true == scoresIncreasing(new int[]{-5,4,11}));
        System.out.println(true == scoresIncreasing(new int[]{1,1,2,2,4,7}));
        System.out.println(false == scoresIncreasing(new int[]{3,2,4}));
        System.out.println(false == scoresIncreasing(new int[]{5,-2,30,1}));
    }
}
