package abstractfactory;

public class DBDaoFactory implements DaoFactory {

    @Override
    public Dao createDao(String type) {

        Dao dao = null;

        if ("emp".equals(type)) {
            dao = new DBEmpDao();
        } else if ("dep".equals(type)) {
            dao = new DBDepartmentDao();
        }
        return dao;
    }
}
