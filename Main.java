import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter buying price");
        double price= scan.nextDouble();
        double closePrice=0.1;
        int day=1;


        while(true){
            System.out.println(" closing for day " + day +"(type exit to leave program) "  );
            closePrice= scan.nextDouble();
            if(closePrice<0.0) break;
            double profit = closePrice-price;
            if(profit>0){
                System.out.println(" you made " + profit + " after " + day + " days ");
            } else if (profit<0.0) {
                System.out.println(" you made " + profit + " after " + " days " + (-profit));

            }
            else {
                System.out.println("after day " + day + " you had no profit");
            }
            day+=1;

            }


        }


}

