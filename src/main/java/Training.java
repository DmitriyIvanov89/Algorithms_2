import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Training {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
        Date date = new Date();
        System.out.println("Today is: " + dateFormat.format(date));

    }
}
