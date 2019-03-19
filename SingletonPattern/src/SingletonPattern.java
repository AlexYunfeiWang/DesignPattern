import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;
    private static int counter = 0;
    private SingletonPattern() {
        counter++;
    }

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    public void printMessage() {
        System.out.println("Singleton speaking");
    }

    public int getCounter() {
        return counter;
    }
}
