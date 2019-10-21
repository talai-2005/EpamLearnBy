package javaClassesTaskA;

/**
 * @author Nikolai
 */

public class Customer {

    {
        idGenerator++;
    }

    private static int idGenerator = 0;
    private int id = idGenerator;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private int customerCreditCardId;
    private int customerBankCardNumber;

    Customer(String customerFirstName, String customerLastName, String customerAddress,
             int customerCreditCardId, int customerBankCardNumber) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerAddress = customerAddress;
        this.customerCreditCardId = customerCreditCardId;
        this.customerBankCardNumber = customerBankCardNumber;
    }

    public static int getIdGenerator() {
        return idGenerator;
    }

    public int getId() {
        return id;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerCreditCardId() {
        return customerCreditCardId;
    }

    public int getCustomerBankCardNumber() {
        return customerBankCardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerCreditCardId=" + customerCreditCardId +
                ", customerBankCardNumber=" + customerBankCardNumber +
                '}';
    }
}
