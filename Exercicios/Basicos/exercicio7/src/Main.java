import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        if(num >=0){
            System.out.println("Não Negativo");
        }
        else{
            System.out.println("Negativo");
        }

    sc.close();
    }
}
