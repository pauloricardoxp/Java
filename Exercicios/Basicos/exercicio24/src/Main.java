import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num;
        
        System.out.println("Digite o número para descobrir seu divisores");
        num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    sc.close();
    }
}
