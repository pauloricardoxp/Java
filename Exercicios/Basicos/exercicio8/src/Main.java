import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para saber se é par ou ímpar:");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Número par");
        }
        else{
            System.out.println("Número Ímpar");
        }

    sc.close();
    }
}
