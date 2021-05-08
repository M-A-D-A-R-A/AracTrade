package ArcadiaAuctionsystem;
import java.util.*;
import ArcadiaAuctionsystem.registration;


public class wecome {
    public static void welcome_message(){
        System.out.println("\n\n\n");
        System.out.println("************");
        System.out.println();
        System.out.println("Welcome to Arcadia Auction System");
        System.out.println();
        System.out.println("************");
        System.out.println("\n\n");
    }

    // main menu block

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n** SELECT ANY ONE **");
        System.out.println();
        System.out.println("    1. Registration. ");
        System.out.println("    2. Auction Panel. ");
        System.out.println(); 
        System.out.print("ENTER YOUR NUMBER: ");
        int var1 = sc.nextInt();
        sc.close();
        if(var1 == 1){
            registration R1 = new registration();

        }
        if(var1 == 2){
            auctionpannel a = new auctionpannel();
        }
        
    }

}
