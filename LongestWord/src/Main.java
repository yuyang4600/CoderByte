import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static String LongestWord(String sen) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        String[] strings = sen.split("[^a-zA-Z]");
        TreeSet ts = new TreeSet(new ComparatorByLength());
        List<String> list = new ArrayList<>();
        for(String str:strings) {
            if(str != null && !str.equals("")) {
                ts.add(str);
            }
        }
        sen = ts.first().toString();
        return sen;

    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
/**
 * 定义比较器
 * @author yangyu
 *
 */
class ComparatorByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        int temp = s1.length()-s2.length();
        return temp==0? temp:s1.compareTo(s2);
    }

}

