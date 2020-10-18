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
            printSpaces(trueHeight, num);
            printHashes(num);
            System.out.print("  ");
            printHashes(num);
        }
        in.close();
    }
    public static void printSpaces(int h, int n){
        for(int i = 0; i < h - n; i++){
            System.out.print(" ");
        }
    }
    public static void printHashes(int n){
        for(int i = 0; i < n; i++){
            System.out.print("#");
        }
    }
}
