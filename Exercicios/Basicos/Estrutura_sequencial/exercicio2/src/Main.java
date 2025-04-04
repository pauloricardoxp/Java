import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        double raio,area,pi;

        System.out.println("Digite o valor do raio de um círculo:");
        raio = sc.nextDouble();

        pi = 3.14159;

        area = pi * raio * raio;

        System.out.printf("A área é: %.4f%n", area);


    sc.close();
    }
}
