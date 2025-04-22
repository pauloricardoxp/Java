import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;
        int fat = 1;

        System.out.println("Digite o número que queira fatorar");
        num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            fat = fat * i;
        }
        System.out.println(fat);
        
    sc.close();
    }
}
