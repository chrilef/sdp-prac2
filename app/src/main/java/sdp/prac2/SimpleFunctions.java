package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
<<<<<<< HEAD
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


=======
    public SimpleFunctions() {
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

>>>>>>> c3d3dacd334a5a47c3e6307e5443d2b70547860f
}
