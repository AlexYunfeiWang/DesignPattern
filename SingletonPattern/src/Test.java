public class Test {
    public static void main(String[] args) {
        SingletonPattern s = SingletonPattern.getInstance();
        s.printMessage();
        SingletonPattern s1 = SingletonPattern.getInstance();
        SingletonPattern s2 = SingletonPattern.getInstance();
        SingletonPattern s3 = SingletonPattern.getInstance();
        SingletonPattern s4 = SingletonPattern.getInstance();
        SingletonPattern s5 = SingletonPattern.getInstance();
        System.out.println(s.getCounter());

        System.out.println(s.equals(s5));
    }
}
