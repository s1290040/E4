import java.util.Scanner;
import java.util.Random;
class Tos {
    public static void main(String[] args){
        int i,a=0,b=0;
        Random ran =new Random();
	Scanner scan= new Scanner(System.in);
	System.out.println("Who are you?");
	String name= scan.nextLine();
	System.out.println("Hello, "+name+"!");
	

        System.out.println("Tossing a coin...");
        for(i=1;i<4;i++){
            int num=ran.nextInt(2);
            if(num==1){
            System.out.println("Round "+i+":Heads");
            a++;
            }
            else {
                System.out.println("Round "+i+":Tails");
            b++;


            }


        }
	
        System.out.println("Heads: "+a+", Tails: "+b);
	if(a>b)System.out.println("You won!");
	else System.out.println("You lost!");


    



    }


}
