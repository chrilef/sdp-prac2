package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

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

// I manually added Anil's task as it wasnt pushed to the repository or completed...
// Also modified it to return something...
public List<String> Task2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.isEmpty()) {
                list.remove(i);
                break;
            }
            list.add(i, s.substring(1));
        }
        return  list;
    }
}

    

    
  


