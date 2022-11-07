package singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    //eager init
    //private static final DateUtil instance = new DateUtil();

    private static volatile DateUtil instance;

    // eager init
    // static {instance = new DateUtil();}

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    // solve serialization issue.  Return the same instance
    protected Object readResolve() {
        return instance;
    }

    // prevent cloning the object

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("");
    }
}
