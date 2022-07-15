import java.util.Random;
class Tos {
    public static void main(String[] args){
        int i,a=0,b=0;
        Random ran =new Random();

        System.out.println("Tossing acoin...");
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


    



    }


}
