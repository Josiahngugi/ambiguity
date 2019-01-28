//public class Test2 {
//    public void testMethod() {
//        this.testMethod2();
//    }
//
//    // ...
//}

public class memorize {
    public void testMethod() {
        this.testMethod2();
    }

    public int testMethod2() {
        System.out.println("Here");
        return 4+4;
    }

    public static void main(String[] args) {
        memorize t = new memorize();
        t.testMethod();
    }
}