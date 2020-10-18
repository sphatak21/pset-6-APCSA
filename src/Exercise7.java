import java.util.Scanner;
public class Exercise7 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean run = true;
        while (run) {
            System.out.print("Enter an integer: ");
            number = in.nextInt();
            run = Util.run(number);
        }
        int firstFactor;
        int secondFactor;
        int index = 0;
        int[] factors = new int[number];
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                firstFactor = i;
                secondFactor = number/i;
                factors[index] = firstFactor;
                index++;
                factors[index] = secondFactor;
                index++;
            }
        }
        String finalStr = "";
        for(int i = 0; i < index; i++){
            finalStr += Integer.toString(factors[i]);
            if(i == index-1){
                finalStr+=".";
            }else{
                finalStr+=", ";
            }
        }
        System.out.println("\n"+ finalStr);
        in.close();
    }
}
