package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    public static int Task1 (ArrayList<Integer> a, ArrayList<Integer> b ){
        int ans; 
        for (int i = 0 ; i<a.size();i++){
           if(b.contains(a[i])){
               ans+=a[i];
           }
        }
    }
    return ans; 
    }
}
