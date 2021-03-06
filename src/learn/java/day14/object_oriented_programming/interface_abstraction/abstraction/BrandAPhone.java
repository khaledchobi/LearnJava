package learn.java.day14.object_oriented_programming.interface_abstraction.abstraction;
//import com.sun.deploy.util.StringUtils;
//import com.sun.deploy.util.StringUtils;
class BrandAPhone extends AndroidPhone{
    @Override
    //Overridden from AndroidPhone abstract class
    public void capturePhoto() {
        System.out.println("BrandAPhone can capture photo");
    }

    @Override
    //Method contract from the MobilePhone interface
    public void makeACall(Long number, Integer countryCode) {
        System.out.println(String.format("BrandAPhone can make audio and video calls to 0%d-%d", countryCode, number));
    }

    @Override
    //Method contract from MobilePhone interface
    public boolean sendSMS(String message) {
        System.out.println(String.format("BrandAPhone can send text message - %s", message));
        return true;
    }
}
/**
 * @author Santosh Balgar Sachchidananda
 * BrandAPhone is a Android type phone. It extends AndroidPhone bstract class
 */