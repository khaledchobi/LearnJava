package learn.java.day14.object_oriented_programming.interface_abstraction;

class SmartPhone implements MobilePhone{
    /**
     * @param number
     * @param countryCode
     * Overridden from MobilePhone interface
     */
    @Override
    public void makeACall(Long number, Integer countryCode) {
        System.out.println(String.format("I can make audio and video call to %d-%d", countryCode, number));
    }

    /**
     * @param message
     * @return
     * Overridden from MobilePhone interface
     */
    @Override
    public boolean sendSMS(String message) {
        System.out.println("I can send SMS");
        return true;
    }

    /**
     * own method of SmartPhone class
     */
    public void canCapturePhoto() {
        System.out.println("I can take HD photo");
    }
}

/**
 * @author
 * SmartPhone class implements MobilePhone interface. It has to provide definition for all the methods.
 * Also it has additional methods.
 */