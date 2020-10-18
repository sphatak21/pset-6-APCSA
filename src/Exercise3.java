import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean run = true;
        while (run) {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            run = Util.run(number);
        }
        String numberStr = Integer.toString(number);
        int numLength = numberStr.length();
        int sum = 0;
        for(int i = numLength; i > 0; i--){
            double exp = Math.pow(10, -(i-1));
            int checkInt = (int) (number * exp);
            if(checkInt % 2 == 1){
                sum += Integer.parseInt(Character.toString(numberStr.charAt(numLength - i)));
            }
        }
        System.out.println("\n" + sum + ".");
        in.close();
    }
}
