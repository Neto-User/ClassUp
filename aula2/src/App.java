import java.util.Scanner;
public class App {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura em C");
        double celsius = teclado.nextDouble();        
        //F = 1,8C + 32
        double farenheit = 1.8*celsius+32;
        System.out.println(
                "O valor convertido e: " + farenheit);
        
       
    }
    

}
