import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int KMS= sc.nextInt();
        int totalCost=0;
        if(hours<=8 && KMS <=250) return;
        else if(hours<8 && KMS>250){
            totalCost+=2000+(KMS-250)*20;
        } else if (hours>8 && KMS<=250) {
            totalCost+=2000+(hours-8)*100;
        }else {
            totalCost+=2000+(KMS-250)*20;
        }
        System.out.println("total Cost: "+totalCost);
    }
}
