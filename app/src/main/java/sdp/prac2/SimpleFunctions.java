package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

    public void Task2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.isEmpty()) {
                list.remove(i);
                break;
            }
            list.add(i, s.substring(1));
        }
    }

}
