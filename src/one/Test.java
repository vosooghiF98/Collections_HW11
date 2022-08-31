package one;

public class Test {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String word = "CAT";
        permutation.add(word);
        System.out.println(permutation.get(word));
        permutation.contains(word,"ACT");
    }
}
