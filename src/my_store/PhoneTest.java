package my_store;

public class PhoneTest {



    public static void main(String[] args) {
        Android pixel3 = new Android(5.1);
        Iphone iphone8 = new Iphone(6.1);
        Phone pixel4 = new Android(6.7);
        Phone iponeX = new Iphone(5.6);

        Phone[] phones = new Phone[2];
        phones[0] = pixel4;
        phones[1] = iponeX;

        pixel3.makeCall("123");
    }

}


