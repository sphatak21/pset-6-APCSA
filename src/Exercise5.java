import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean run = true;
        boolean prime = true;
        while (run) {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            run = Util.run(number);
        }
        if(number % 2 == 0){
            prime = false;
        }else{
            for(int i = 3; i < number; i+=2){
                if(number % i == 0){
                    prime = false;
                }
            }
        }
        if(prime){
            System.out.println("\nPrime.");
        }else{
            System.out.println("\nNot Prime.");
        }
        in.close();
    }
}
