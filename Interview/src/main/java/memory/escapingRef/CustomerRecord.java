package memory.escapingRef;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecord implements Iterable<Customer> {

    private Map<String, Customer> records;

    public CustomerRecord() {
        this.records = new HashMap<>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    //escaping reference
    public Map<String, Customer> getCustomers() {
        //create new collection  return a copy of hashmap
        //return new HashMap<>(this.records);
        return Collections.unmodifiableMap(this.records);  //this copy cannot be edit
    }

    @NotNull
    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }


    //return readonly
    public CustomerReadOnly getCustomerByName(String name) {
        //return this.records.get(name);
        return this.records.get(name);
    }



}
