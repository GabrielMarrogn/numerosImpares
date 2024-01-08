import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int soma = 0;
        sc.close();

        if(b%2 != 0 && a != b){
            b += 1;
        }
        


        for(i = b; i < a; i++){
            if(i%2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
    } 
}
