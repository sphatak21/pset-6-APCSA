import java.util.Scanner;
public class Exercise2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        while(true){
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            if(number > 0){
                break;
            }
        }
        String numberStr = Integer.toString(number);
        String revNumStr = new String();
        for(int i = numberStr.length(); i > 0; i--){
            String punctuationSpace = ", ";
            if(i == 1){
                punctuationSpace = ".";
            }
            revNumStr += Character.toString(numberStr.charAt(i-1)) + punctuationSpace;
        }
        System.out.println("\n" + revNumStr);
        in.close();
    }
}
