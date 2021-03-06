package learn.java.day14.object_oriented_programming.interface_abstraction.abstraction;
//import com.jcg.java7.interfaces.MobilePhone;
//import com.jcg.java7.interfaces.MobilePhone;
abstract class AndroidPhone implements MobilePhone_01{
    /**
     * Concrete method in the abstract class
     */
    public final void displayPhoneOSType() {
        System.out.println("I run on Android OS");
    }

    /**
     * An abstract method. Inheriting class should provide the definition
     */
    public abstract void capturePhoto();
}
/**
 * @author Santosh Balgar Sachchidananda
 * AndroidPhone is an abstract class. This defines the construct for any android phone in the example.
 * Basic phone contract is implemented from MobilePhone interface. However the definitions of those
 * methods have to be provided in the class extended from the AndroidPhone
 */