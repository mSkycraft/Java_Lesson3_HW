package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public final class HW1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,5,4,6));
        int i = 0;
        System.out.println(list);
        while(i<list.size()) {
            if(list.get(i)%2==0){
                list.remove(i);
            }
            else
                i++;
        }
        System.out.println(list);
    }
}
