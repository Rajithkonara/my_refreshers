package memory.escapingRef;

public class Customer implements CustomerReadOnly {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    //return new customer object
    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
