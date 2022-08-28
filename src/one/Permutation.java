package one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Permutation {
    private HashMap<String, HashSet<String>> hashMap = new HashMap<>();
    private HashSet<String> arrayList = new HashSet<>();

    public HashSet<String> getPermutation(String str) {
        return getPermutation("", str);
    }

    public HashSet<String> getPermutation(String prefix, String str) {

        int length = str.length();
        if (length == 0) {
            arrayList.add(prefix);
        } else {
            for (int i = 0; i < length; i++)
                getPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, length));
        }
        return arrayList;
    }

    public void add(String word) {
        hashMap.put(word, getPermutation(word));
    }

    public void contains(String word1, String word2) {
        if (arrayList.contains(word2)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }

    public HashSet<String> get(String word) {
        return hashMap.get(word);
    }

}
