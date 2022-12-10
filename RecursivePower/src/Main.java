import java.util.Scanner;

public class Main {
    static int pow(int a, int b){
       int result = 1;

       if ( b == 0){
           return 1;
       }
        if(b == 1){
            return a;
        }
        for(int i = 1;i<=b;i++){
            result *= a;
        }
        return a * pow(a,b-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz:");
        int base = scan.nextInt();
        System.out.print("Üst değerini giriniz:");
        int exp = scan.nextInt();

        System.out.println(pow(base,exp));
    }
}
