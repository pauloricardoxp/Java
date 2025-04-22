import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            primeiro = i;
            segundo = i * i;
            terceiro = i * i* i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
    sc.close();
    }
}
