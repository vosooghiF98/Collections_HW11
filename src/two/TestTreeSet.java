package two;

import java.util.Random;
import java.util.TreeSet;

public class TestTreeSet {
    public static void unionMethod(TreeSet<Character> union, TreeSet<Character> characters2){
        union.addAll(characters2);
    }

    public static void intersectionMethod(TreeSet<Character> intersection, TreeSet<Character> characters2){
        intersection.retainAll(characters2);
    }
    public static void main(String[] args) {
        TreeSet<Character> characters1 = new TreeSet<>();
        TreeSet<Character> characters2 = new TreeSet<>();
        TreeSet<Character> union = new TreeSet<>();
        TreeSet<Character> intersection = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (!characters1.add((char)random.nextInt(97,123))){
                i--;
            }
        }
        while (characters2.size() < 10){
            characters2.add((char)random.nextInt(97,123));
        }

        union.addAll(characters1);
        intersection.addAll(characters1);
        unionMethod(union,characters2);
        intersectionMethod(intersection,characters2);
        System.out.println(characters1);
        System.out.println(characters2);
        System.out.println(union);
        System.out.println(intersection);


    }

}
