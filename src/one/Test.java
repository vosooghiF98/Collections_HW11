package one;

public class Test {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        permutation.add("1234");
        System.out.println(permutation.get("1234"));
        permutation.contains("1234","3214");
    }
}
