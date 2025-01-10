public class Main {

    public static void main(String[] args) {
        String s1 = "This is a Literal String test"; // Literal
        String s2 = "This is a Literal String test"; // Literal

        System.out.println("s1 == s2: " + s1 == s2); // false
        System.out.println("s1 == s2: " + (s1 == s2)); // s1 == s2: true
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // s1.equals(s2): true
        System.out.println(s1.getClass().getName() + "@"
                + Integer.toHexString(s1.hashCode()));// java.lang.String@544771c5
        System.out.println(s2.getClass().getName() + "@"
                + Integer.toHexString(s2.hashCode()));// java.lang.String@544771c5
        System.out.println(System.identityHashCode(s1)); // 51228289
        System.out.println(System.identityHashCode(s2)); // 51228289


        String s3 = new String("This is a Object String test"); // new String()
        String s4 = new String("This is a Object String test"); // new String()

        System.out.println("s3 == s4: " + s3 == s4); // false
        System.out.println("s3 == s4: " + (s3 == s4)); // s3 == s4: false
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // s3.equals(s4): true
        System.out.println(s3.getClass().getName() + "@"
                + Integer.toHexString(s3.hashCode())); // java.lang.String@a6fb9bd3
        System.out.println(s4.getClass().getName() + "@"
                + Integer.toHexString(s4.hashCode())); // java.lang.String@a6fb9bd3
        System.out.println(System.identityHashCode(s3)); // 455896770
        System.out.println(System.identityHashCode(s4)); // 1323165413

        String s5 = "This is a test";
        String s6 = new String("This is a test");

        System.out.println("s5 == s6: " + (s5 == s6)); // s5 == s6: false
        System.out.println("s5 == s6: " + s5.equals(s6)); // s5 == s6: true
        System.out.println(s5.getClass().getName() + "@"
                + Integer.toHexString(s5.hashCode())); // java.lang.String@544771c5
        System.out.println(s6.getClass().getName() + "@"
                + Integer.toHexString(s6.hashCode())); // java.lang.String@544771c5
        System.out.println(System.identityHashCode(s5)); // 511754216
        System.out.println(System.identityHashCode(s6)); // 1721931908

        Object a = new Object();
        a.hashCode();
    }
}