import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class generator {
    public static void main(String[] args) {
        //df (data format)
        //dfsa (data format saquence a)
        //dfsb (data format saquence b)
        DateFormat dfsa = new SimpleDateFormat("ddMMyyyy");
        DateFormat dfsb = new SimpleDateFormat("ddMMyHHmmaa");
        Date dateobj = new Date();
        //RepairOrderNumber
        System.out.println("RO_CS" + dfsa.format(dateobj));
        //Serial Part HLA
        System.out.println("SERPART" + dfsa.format(dateobj));
        //Serial System
        System.out.println("SERSYS" + dfsa.format(dateobj));
        //Serial Part LLA
        System.out.println("SERPAR" + dfsa.format(dateobj));
        System.out.println(dfsb.format(dateobj));

        Calendar calobj = Calendar.getInstance();
        System.out.println(calobj.getTime());

//        https://beginnersbook.com/2013/05/current-date-time-in-java/
    }
}
