package my_store;

public class Phone {
    private String number;
    private double ScreenSize;
    private  String  os;

    public Phone( double screenSize, String os) {
        this.ScreenSize = screenSize;
        this.os = os;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        this.ScreenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public void makeCall(String aNumber){
        System.out.println("Calling a" + aNumber);
    }
}
