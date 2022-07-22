package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

   public static int Task1 (List<Integer> a, List<Integer> b ){
        int ans=0; 
        for (int i = 0 ; i<=b.size();i++){
              if(b.get(i)>a.size()-1 || (b.get(i)<0)){
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
        public List<Integer> Task6(List<Integer> in) {
        List<Integer> out = new ArrayList<Integer>();
        double temp = 0;
        int ret = 0;

        for(int i = 0; in.size() > i; i++){
            temp = in.get(i);
            if(temp%100==0){
                ret = (int)temp;
                out.add(ret);
            }
            else{
                temp = Math.ceil(temp/100)*100;
                ret = (int)temp;
                out.add(ret);
            }
        }
        return out; 
    }

}


    

    
  


