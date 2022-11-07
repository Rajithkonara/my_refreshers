package abstractfactory;

public class FactoryTest {

    public static void main(String[] args) {

        DaoFactory xml = DaoFactoryProducer.produce("xml");
        Dao emp = xml.createDao("emp");
        emp.save();

        DaoFactory db = DaoFactoryProducer.produce("db");
        Dao dep = db.createDao("dep");
        dep.save();
    }

}
