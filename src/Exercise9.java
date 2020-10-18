import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int height;
        while(true){
            System.out.print("Height: ");
            height = in.nextInt();
            if(height > 0 && height < 25){
                break;
            }
        }
        int trueHeight = height + 1;
        for(int num = 2; num <= trueHeight; num++){
            System.out.print("\n");
            Util.printSpaces(trueHeight, num);
            Util.printHashes(num);
            System.out.print("  ");
            Util.printHashes(num);
        }
        in.close();
    }
}
