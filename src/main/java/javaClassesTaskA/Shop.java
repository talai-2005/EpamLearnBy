package javaClassesTaskA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Nikolai
 */

public class Shop {
    private String shopName;
    private ArrayList<Customer> customersList = new ArrayList<Customer>();

    Shop(String shopName) {
        this.shopName = shopName;
    }

    void addCustomerToShopList(Customer customer) {
        customersList.add(customer);
    }

    List<Customer> getListByFirstName() {
        List<Customer> list = new ArrayList<Customer>(customersList);
        Collections.sort(list, new Comparator<Customer>() {

            public int compare(Customer o1, Customer o2) {
                return o1.getCustomerFirstName().compareToIgnoreCase(o2.getCustomerFirstName());
            }
        });
        return list;
    }

    List<Customer> getListByLastName() {
        List<Customer> list = new ArrayList<Customer>(customersList);
        Collections.sort(list, new Comparator<Customer>() {

            public int compare(Customer o1, Customer o2) {
                return o1.getCustomerLastName().compareToIgnoreCase(o2.getCustomerLastName());
            }
        });
        return list;
    }

    List<Customer> getListByDiapasonCreaditCard(int rangeStart, int rangeEnd) {
        List<Customer> list = new ArrayList<Customer>();
        for (Customer customer : customersList) {
            if (customer.getCustomerCreditCardId() >= rangeStart && customer.getCustomerCreditCardId() <= rangeEnd) {
                list.add(customer);
            }
        }

        return list;
    }



}