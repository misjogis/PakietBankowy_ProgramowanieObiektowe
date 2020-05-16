package banking;

import java.util.*;

public class Bank {
  
  private ArrayList<Customer> customers;
  
  public Bank() {
    customers = new ArrayList<Customer>();
  }

  public void addCustomer(String f, String l) {
    customers.add(new Customer(f, l));
  }
  public Customer getCustomer(int customer_index) {
    return customers.get(customer_index);
  }
  public int getNumOfCustomers() {
    return customers.size();
  }
}

