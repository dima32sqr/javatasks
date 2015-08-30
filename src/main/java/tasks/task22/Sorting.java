package tasks.task22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dmytro on 8/9/2015.
 */
public class Sorting {
    List<String> sortList(String st) {
        String clearedSt = st.replaceAll("\"", "").toLowerCase();
        List<String> names = new ArrayList<String>(Arrays.asList(clearedSt.split(",")));
        Collections.sort(names);
        return names;
    }

    public static void main(String[] args) {
        Sorting s = new Sorting();
        FileReader fr = new FileReader();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            char[] ch  = s.sortList(fr.readFile()).get(i).toCharArray();
            for(char c : ch) {
                int temp = (int) c;
                sum += temp;
            }
        }
        System.out.println(sum);
        System.out.println("--------------------------------");
        s.doSmth();
    }

    private void doSmth() {
        String s = "colin";
        char[] ch  = s.toCharArray();
        for(char c : ch)
        {
            int temp = (int)c;
            int temp_integer = 96; //for lower case
            if(temp<=122 & temp>=97)
                System.out.print(temp-temp_integer);
        }
    }
}
