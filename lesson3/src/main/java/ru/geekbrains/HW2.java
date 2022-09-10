package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public final class HW2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,2,5,4,2,6));
        int min= list.get(0);
        int max= list.get(0);
        double avg = list.get(0);

        System.out.println(list);
        for(int i =1; i< list.size()-1;i++){
            if(min>list.get(i))
                min = list.get(i);
            if(max<list.get(i))
                max = list.get(i);
            avg += list.get(i);
        }
        avg = avg/list.size();
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        int i = 1;
        int buf = list.get(0);
        while(i<list.size()-1){
            if(list.get(i).equals(buf)){
                list.remove(i);
            }
            else
                i++;
        }
        System.out.println(list);
        System.out.printf("Минимум - %d\n",min);
        System.out.printf("Максимум - %d\n",max);
        System.out.printf("Среднее арифметическое - %.2f\n",avg);
        System.out.printf("Среднее по значению - %d\n",list.get(list.size()/2));
    }
}
