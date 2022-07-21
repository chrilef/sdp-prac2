package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public static List<Integer> Task4 (List<Integer> a, List<Integer> b) {
        int sizea = a.size()-1;
        int sizeb = a.size()-1;
        
        if(sizea!=sizeb)
        {
            return null;
        }
        else
        {
           List<Integer> c = new ArrayList<Integer>();
                for(int i = 0; i <= sizea; i++){
                  c.add(a.get(i)*b.get(sizeb));
                  sizeb--;
                }
            return c;
        }
        }


}
