package Week3;

public class firstThreeChar {
    public static String frontTimes(String str, int n) {
        int frontLength = 3;
        if(frontLength > str.length()){
            frontLength = str.length();
        }
        String front = str.substring(0, frontLength);

        String result = "";
        for(int i=0; i<n; i++){
            result+= front;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Apple", 4));
    }

}
