/**
 * Created by Natasha Rao on 7/24/18.
 */
public class WordsFront {

    public static String[] wordsFront(String[] words, int n) {
        String [] nwords = new String [n];
        for (int i = 0; i < nwords.length; i++){
            nwords[i] = words[i];
        }
        return nwords;
    }

    public static void isEqual (String [] a, String [] b, int n){
        boolean issame = false;
        for (int i = 0; i < n; i++){
            if (a[i] == b[i]) {
                issame = true;
            }
        }
        System.out.println(issame);
    }

    public static void main (String [] args){
        //Test 1
        String [] test1 = new String[] {"a", "b", "c","d"};
        String [] compare1 = new String[] {"a"};
        isEqual(test1,compare1,1);

        //Test 2
        String [] test2 = new String[] {"Hello", "User"};
        String [] compare2 = new String[] {"Hello", "User"};
        isEqual(test2,compare2,2);

        //Test 3
        String [] test3 = new String[] {"", "Empty"};
        String [] compare3 = new String[] {""};
        isEqual(test3,compare3,1);

    }

}
