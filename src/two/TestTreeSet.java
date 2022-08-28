package two;

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
        characters1.add('a');
        characters1.add('c');
        characters1.add('d');
        characters1.add('h');
        characters1.add('j');
        characters1.add('l');
        characters1.add('t');
        characters1.add('n');
        characters1.add('m');
        characters1.add('z');

        characters2.add('a');
        characters2.add('v');
        characters2.add('m');
        characters2.add('q');
        characters2.add('p');
        characters2.add('y');
        characters2.add('u');
        characters2.add('b');
        characters2.add('c');
        characters2.add('k');

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
