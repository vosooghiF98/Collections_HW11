package three;

import java.util.ArrayList;

public class TestArraylist {
    public static void delete(ArrayList<Integer> integers){
        if (!integers.isEmpty()){
            if (integers.size() % 2 != 0){
                integers.remove(integers.size()-1);
            }
            int i = 0;
            while (i < integers.size() - 2){
                int first = integers.get(i);
                int second = integers.get(i+1);
                if (first>second){
                    integers.remove(i);
                    integers.remove(i);
                }else {
                    i+=2;
                }
            }
            if (integers.get(integers.size()-2) > integers.get(integers.size() -1)){
                integers.remove(integers.size()-2);
                integers.remove(integers.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(7);
        integers.add(9);
        integers.add(2);
        integers.add(5);
        integers.add(5);
        integers.add(8);
        integers.add(5);
        integers.add(6);
        integers.add(3);
        integers.add(4);
        integers.add(7);
        integers.add(3);
        integers.add(1);
        delete(integers);
        System.out.println(integers);
    }
}
