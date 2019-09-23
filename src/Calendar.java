import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Calendar calendar = Calendar.getInstance();

        System.out.println("Enter the date: MM/DD/YYYY");
        String userCal = sc.nextLine();
        String userMonth = userCal.substring(0, userCal.indexOf("/"));
        String month = "";
        String day = userCal.substring(3, userCal.lastIndexOf("/")) + ", ";
        String year = userCal.substring(userCal.lastIndexOf("/") + 1);

        if(userMonth.equals("01")){
            month = "January";
        }else if(userMonth.equals("02")){
            month = "February";
        }else if(userMonth.equals("03")){
            month = "March";
        }else if(userMonth.equals("04")){
            month = "April";
        }else if(userMonth.equals("05")){
            month = "May";
        }else if(userMonth.equals("06")){
            month = "June";
        }else if(userMonth.equals("07")){
            month = "July";
        }else if(userMonth.equals("08")){
            month = "August";
        }else if(userMonth.equals("09")){
            month = "September";
        }else if(userMonth.equals("10")){
            month = "October";
        }else if(userMonth.equals("11")){
            month = "November";
        }else if(userMonth.equals("12")){
            month = "December";
        }else{
            System.out.println("Not a calendar month.");
        }

        System.out.println(month + " " + day + year);

    }
}
