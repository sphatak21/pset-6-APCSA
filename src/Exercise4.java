import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            int number = in.nextInt();
            if(number < 0){
                break;
            }else{
                sum += number;
                count ++;
            }
        }
        double avg = (double) sum/count;
        System.out.print("\n");
        System.out.printf("%,.2f", avg);
        System.out.print("\n");
        in.close();
    }
}

