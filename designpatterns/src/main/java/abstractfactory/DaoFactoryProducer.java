package abstractfactory;

public class DaoFactoryProducer {

    private DaoFactoryProducer() {
    }

    public static DaoFactory produce(String factoryType) {

        DaoFactory daoFactory = null;

        if ("xml".equals(factoryType)) {
            daoFactory = new XMLDaoFactory();
        } else if ("db".equals(factoryType)) {
            daoFactory = new DBDaoFactory();
        }

        return daoFactory;
    }

}
