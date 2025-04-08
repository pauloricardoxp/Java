import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero, horaTrabalhadas;
        double valorHoras, salario;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        horaTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor que você recebe por hora trabalhada:");
        valorHoras = sc.nextDouble();

        salario = valorHoras * horaTrabalhadas;

        System.out.println("O número é : " + numero);
        System.out.printf("O seu salário é U$ %.2f%n", salario);

    sc.close();
    }
}
