package my_store;

public class Iphone extends Phone {

    public Iphone(double screenSize) {
        super(screenSize, "IOS");
    }

    public void MakeCall(){
        System.out.println("calling ");
    }
    private  boolean facialUnlock(String face){
        return true;
    }
}
