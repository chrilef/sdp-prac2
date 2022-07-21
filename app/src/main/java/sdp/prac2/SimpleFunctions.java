package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    public static int Task1 (ArrayList<Integer> a, ArrayList<Integer> b ){
        for (int i = 0 ; i<a.size();i++){
              if (i>=b.size()){
                  return a;
              }
               a+=b[i];
        }
    }
    return a; 
    }
            }
    public boolean Task3(String str) {
            if(str.length() == 0)
                return true;
                int count = 0;
            for(int j =0; j < str.length(); j++) {
                if(str.charAt(j) == '(') {
                    count += 1;
                }
                else if(str.charAt(j) == ')') {
                    count -= 1;
                    if(count < 0)
                        return false;
                }
            }
            return count == 0 ? true : false;
        }

}
