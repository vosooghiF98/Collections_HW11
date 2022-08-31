package four;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        CustomHashMap<Integer, ArrayList<String>> hashMap = new CustomHashMap<>();
        ArrayList<String> tehran = new ArrayList<>();
        ArrayList<String> alborz = new ArrayList<>();
        tehran.add("Tehran");
        tehran.add("Varamin");
        tehran.add("Pakdasht");
        tehran.add("Safadasht");
        alborz.add("Karaj");
        alborz.add("Vardavard");
        alborz.add("Mehrshahr");
        alborz.add("Taleghan");
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey(1));
        hashMap.put(1,alborz);
        hashMap.put(2,tehran);
        System.out.println(hashMap);
        hashMap.put(1,tehran);
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey(3));

    }

}
