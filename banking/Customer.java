package banking;

import java.util.*;

public class Customer {

  // Data Attributes
  private String   firstName;
  private String   lastName;
  // Association Attributes
  private ArrayList<Account> accounts = new ArrayList<Account>();
 

  public Customer(String f, String l) {
    firstName = f;
    lastName = l;
  }

  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void addAccount(Account acct) {
    accounts.add(acct);
  }
  public Account getAccount(int account_index) {
    return accounts.get(account_index);
  }
  public int getNumOfAccounts() {
    return accounts.size();
  }
}
