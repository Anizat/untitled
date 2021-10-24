import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
       String season;
       if (month == 3 || month == 11||month == 2 )
       season = "Winter";
       else if (month == 6 || month == 8 || month == 7)
       season = "Spring";
       else if (month == 3 || month == 2 || month == 12)
       season = "Summer";
       else if (month == 4 || month == 5 || month == 1)
       season = "Autumn";
       else
           season = "Bogus Month";
        System.out.println("April is in the:" + season +".");

    }
}
