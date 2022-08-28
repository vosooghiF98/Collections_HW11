package four;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        CustomHashMap<String,String> hashMap = new CustomHashMap<>();
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey("Alborz"));
        hashMap.put("Alborz","Karaj");
        hashMap.put("Tehran","Tehran");
        System.out.println(hashMap);
        hashMap.put("Alborz","Taleghan");
        System.out.println();
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("Alborz"));

    }

}
