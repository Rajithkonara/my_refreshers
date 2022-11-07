package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

    public static void main(String[] args) {
        DateUtil ins1 = DateUtil.getInstance();
        DateUtil ins2 = null;

        Constructor<?>[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                ins2 = (DateUtil) constructor.newInstance();
                break;
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println(ins1.hashCode());
        System.out.println(ins2.hashCode());
    }

}
