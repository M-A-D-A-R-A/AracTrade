import java.util.*;
public class auction {

    public static int ownercount=0,playercount=0,counter=0;

    public static Player player[] = new Player[100];
    public static Owner owner[] = new Owner[100];
    public static String player_name,game_tag,wep1,wep2;
    public static int player_rank,hour;
    public static String owner_name,ph;
    public static int registration_number;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.print("\033[H\033[2J");  
		System.out.flush();
        //***welcome msg***

        System.out.println("\n\n\n");                   
        System.out.println("****");
        System.out.println();
        System.out.println("Welcome to Arcadia Auction System");
        System.out.println();
        System.out.println("****");
        System.out.println("\n\n");

        int t = 0;

        System.out.println("\t\t     press 1 to continue    \t\t");
        int press = sc.nextInt();
        
        if(press == 1)
        {

            

             
            while(t == 0)
            {
                System.out.println("\n** SELECT ANY ONE **");
                System.out.println();
                System.out.println("    1. Player Registration. ");
                System.out.println("    2. Owner Registration. ");
                System.out.println("    3. Auction Panel. ");
                System.out.println(); 
                System.out.print("ENTER YOUR NUMBER: ");
                int temp=sc.nextInt();
                
                if(temp == 1)
                {
                    player[playercount] = new Player();
                    player[playercount].getinfo();
                    player[playercount].set_registration_number(playercount);
                    System.out.println("your registration number is:  "+ player[playercount].get_registration_number());

                        playercount++;
                        counter++;
                }

                if(temp == 2)
                {
                    owner[ownercount] = new Owner();
                    owner[ownercount].getinfo();
                    owner[ownercount].set_registration_number(ownercount);
                    System.out.println("your registration number is:  "+ owner[ownercount].get_registration_number());

                        ownercount++;
                        counter++;
                }
                
                if(temp == 3)
                {
                    Auction_Panel panel = new Auction_Panel();
                    panel.start();
                    
                }
                

            }

        }
    }
    
}
////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

class Auction_Panel extends auction{

    public void start(){
        System.out.println("number of players are: "+playercount);
        System.out.println("number of owners are: "+ownercount);


        for(int i=0 , j = 0; i<playercount && j < ownercount;i++,j++)
        {
            System.out.println(owner[j].show());
            
            
            System.out.println(player[i].show());

            

            System.out.println(" Can start your Biding from : 200 points for " + player[i]);

        }

        
    }
    



}



///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

class Player extends auction{
    Scanner sc=new Scanner(System.in);

    

    public Player()
    {
        player_name = "";
        game_tag = "";
        wep1 = "";
        wep2 = "";
        player_rank = 0;
        hour = 0;
    }

    public void getinfo()
	{
        // super.getinfo();

        System.out.print("Enter your name: ");player_name = sc.nextLine();
            
        System.out.print("Enter your CSGO rank: ");player_rank = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your gaming tag: ");game_tag = sc.nextLine();
        
        System.out.print("Enter number of hours played: ");hour = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your primary weapon: ");wep1 = sc.nextLine();
        
        System.out.print("Enter your secondary weapon: ");wep2 = sc.nextLine();
        
    }

    public void set_registration_number(int a)
	{
		registration_number=a;
	}
	
	public int get_registration_number()
	{
		return(registration_number);
    }
    
    public int show()
    {
        System.out.println("player's name: "+player_name);
        System.out.println("player's rank: "+player_rank);
        System.out.println("Player played a total" +hour+ " hours");
        System.out.print("registration number is: ");
       return registration_number;
    }



}

////////////////////////////////////////////////////////////
/////////////////////////////////////////////////
class Owner extends auction{
    Scanner sc=new Scanner(System.in);

    

    public Owner()
    {
        owner_name = "";
        ph = "";
    }

    public void getinfo()
	{
        // super.getinfo();

        System.out.print("Enter your name: ");owner_name = sc.nextLine();
             
        System.out.print("Enter your phone number: "); ph = sc.nextLine();
        
    }

    public void set_registration_number(int a)
	{
		registration_number=a;
	}
	
	public int get_registration_number()
	{
		return(registration_number);
    }
    public int show()
    {
        System.out.println("Owner's name: "+owner_name);
        System.out.print("registration number is: ");
       return registration_number;
    }

}


/////////////////////////////////////////////////////////
///////////////////////////////////////////////////////

//todo:
//2. credit update wala
//3.ek baar kapil wale sey idea lena