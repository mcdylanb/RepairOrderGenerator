import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class generator {
    public static void main(String[] args) {
        //df (data format)
        //dfsa (data format saquence a)
        //dfsb (data format saquence b)
        DateFormat dfsa = new SimpleDateFormat("ddMMyyyy");
        DateFormat dfsb = new SimpleDateFormat("ddMMyHHmmaa");
        Date dateobj = new Date();



        //TODO:
        // - also how to input lla and hla
        // - ask what letter to start

        Scanner scan = new Scanner(System.in);

        //ask how many serial numbers does the user want to generate
        System.out.println("Number of Serial to generate:");
        int generates = scan.nextInt();


        // FIXME:
        //  - if the number of generated serial doesnt have the same number of LLA
        //  - we can ask for each individual generated chuchu
        System.out.println("Number of LLA you are using:");
        int number_of_lla = scan.nextInt();

        //letter to start
        char alphabet = 'A';


        // FIXME:
        //  -change the int name of x and y

        //creates serial base on number requested by the user
        for (int y=1; y <= generates; y++){
            System.out.println("=========="+ y + "/" + generates + "==========");
            //RepairOrderNumber
            System.out.println("Repair Order Number:");
            System.out.println("    RO_CS" + dfsa.format(dateobj)+alphabet);
            System.out.println("");

            //Serial Part HLA
            System.out.println("HLA Serial:");
            System.out.println("    SERPART" + dfsa.format(dateobj)+alphabet);
            System.out.println("");

            //Serial System
            System.out.println("Serial System:");
            System.out.println("    SERSYS" + dfsa.format(dateobj)+alphabet);
            System.out.println("");

            System.out.println("LLA Serial:");
            char alphabetlla = 'A';
            for (int x=0; x < number_of_lla; x++){
                //Serial Part LLA
                System.out.println("    SERPAR" + dfsa.format(dateobj)+alphabet+alphabetlla);
                alphabetlla++;
            }
            System.out.println("");


            //Customer ID
            System.out.println("Customer ID:");
            System.out.println("    "+dfsb.format(dateobj));
            System.out.println("");

            //changes the letter after every generated serial
            alphabet++;
        }




//        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
//
//        }




//        https://beginnersbook.com/2013/05/current-date-time-in-java/
    }
}
