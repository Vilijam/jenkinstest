package dtu.example;

import java.util.Stack;

public class StrCalculator {

    public int add(String s) {
        Integer sum = 0;
        String[] list = s.replace("\n", "").split(",");

        for (String a : list) {
            sum += Integer.parseInt(a);
        }
        
        return sum;
    }
}
