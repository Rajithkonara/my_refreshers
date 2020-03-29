package singleton;

public class Singleton {

    //ensure multi threads handle the variable correctly
    private static volatile Singleton instance;

    //only singleton can init
    private Singleton() {
    }

    // using double check locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
