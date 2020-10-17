import java.util.Scanner;
public class Exercise8 {
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
        for(int num = 2; num <= height + 1; num++){
            System.out.print("\n");
            for(int i = 0; i < height + 1 - num; i++){
                System.out.print(" ");
            }
            for(int j = 0; j < num; j++){
                System.out.print("#");
            }
        }
        System.out.println();
    }
}

