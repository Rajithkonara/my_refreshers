package abstractfactory;

public class XMLDaoFactory implements DaoFactory {

    @Override
    public Dao createDao(String type) {

        Dao dao = null;

        if ("emp".equals(type)) {
            dao = new XMLEmpDao();
        } else if ("dep".equals(type)) {
            dao = new XMLDepartmentDao();
        }
        return dao;
    }
}
