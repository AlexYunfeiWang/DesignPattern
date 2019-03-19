import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class SingletonPattern {

    private SingletonPattern singletonPattern;
    
    private SingletonPattern() {

    }

    public SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
