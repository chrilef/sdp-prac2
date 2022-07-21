package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public SimpleFunctions() {
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
