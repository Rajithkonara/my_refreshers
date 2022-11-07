package singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("/home/rajith/dateUtil.ser")));
        objectOutputStream.writeObject(dateUtil1);

        DateUtil dateUtil2 = DateUtil.getInstance();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("/home/rajith/dateUtil.ser")));
        dateUtil2  = (DateUtil) objectInputStream.readObject();

        objectOutputStream.close();
        objectInputStream.close();


        Logger.getInstance().log("test");

        System.out.println(dateUtil1 == dateUtil2);
        dateUtil2.clone();

    }

}
