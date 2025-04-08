import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A,B;
        System.out.println("Digite o primeiro número:");
        A = sc.nextInt();
        System.out.println("Digite o segundo número:");
        B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.println("São multiplos");
        }
        else{
            System.out.println("Não são multiplos ");
        }

    sc.close();
    }
}
