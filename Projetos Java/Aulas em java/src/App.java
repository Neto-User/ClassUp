import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite um numero:");
        int numero = teclado.nextInt(); 
        
        
        
        
        
        
        int antecessor = numero -1, sucessor = numero + 1 ;
        
        System.out.println("O conteudo da variavel numero e: " + numero);
        
        System.out.println("O antecessor: " + antecessor );
        
        System.out.println("O sucessor: " + sucessor);
       
    }
}
