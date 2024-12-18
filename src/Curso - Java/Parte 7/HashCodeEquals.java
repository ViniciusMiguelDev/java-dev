
public class HashCodeEquals {
    public static void main(String[] args) {
        HashEqualsClient c1 = new HashEqualsClient("Maria", "Maria@");
        HashEqualsClient c2 = new HashEqualsClient("Maria", "Maria2@");

        String s1 = new String("Teste");
        String s2 = new String("Teste");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(s1 == s2);

    }
}
