package learn.java.day14.object_oriented_programming.interface_abstraction;

public interface MobilePhone {
    void makeACall(Long number, Integer countryCode);
    boolean sendSMS(String message);
}

/**
 * @author
 * MobileInterface defines the contract which all types of mobile phones
 * in the example have to adhere to
 */