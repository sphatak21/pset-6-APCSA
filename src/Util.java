public class Util {
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
    public static boolean run(int num){
        return num <= 0;
    }
}
