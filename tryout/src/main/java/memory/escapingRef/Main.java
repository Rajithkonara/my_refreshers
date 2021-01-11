package memory.escapingRef;

public class Main {

    public static void main(String[] args) {
        CustomerRecord record = new CustomerRecord();

        record.addCustomer(new Customer("Rajith"));
        record.addCustomer(new Customer("konara"));

        //now the this returns a copy of the original hashmap we clear the copy
        //record.getCustomers().clear();

        //we are getting another new hashmap here
        for (Customer next : record.getCustomers().values()) {
            System.out.println(next);
        }

        //get a referercnce
        CustomerReadOnly rajith = record.getCustomerByName("Rajith");
        System.out.println(rajith.getName());  //copy of exisiting custome

        System.out.println("Original collection");

        for (Customer next : record.getCustomers().values()) {
            System.out.println(next);
        }

        //still mutatable
        //record.iterator().remove();
    }
}
