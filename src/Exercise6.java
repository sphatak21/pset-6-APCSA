import java.util.Scanner;
public class Exercise6 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            if(number > 0 && number < 93){
                break;
            }
        }
        int[] arr = new int[number + 1];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 0;
        for(int i = 2; i < number + 1; i ++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("\n" + arr[number] + ".");
        in.close();
    }
}
