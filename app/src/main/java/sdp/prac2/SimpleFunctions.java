package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {

   public static int Task1 (List<Integer> a, List<Integer> b ){
        int ans=0; 
        for (int i = 0 ; i<b.size();i++){
              if(b.get(i)>a.size() || (b.get(i)<0)){
                i+=1;
              }
              else{
              ans+=a.get(b.get(i));
              }

        }
        return ans;
}
    }
    }
  


