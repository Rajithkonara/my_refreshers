package abstractfactory;

public interface DaoFactory {

    Dao createDao(String type);

}
