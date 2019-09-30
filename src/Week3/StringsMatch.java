package Week3;

public class StringsMatch {
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i= 0; i <len-1; i++ ){
            String aSbStr = a.substring(i,i+2);
            String bSbStr = b.substring(i,i+2);
            if(aSbStr.equals(bSbStr)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(stringMatch("tree", "eret"));
    }
}
