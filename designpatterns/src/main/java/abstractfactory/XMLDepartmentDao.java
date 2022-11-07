package abstractfactory;

public class XMLDepartmentDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving department to xml");
    }
}
