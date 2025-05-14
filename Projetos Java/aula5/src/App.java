import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        float salarioM = 1412, salarioF, resultado;
        
        System.out.print("Digite o seu salario: ");
        salarioF = scan.nextFloat();
        
        resultado = salarioM / salarioF;
       
       
        String formato = String.format("%.2f", resultado);
        
        
        System.out.println("Resultado da quantia: " + formato); 
        System.out.printf("\nResultado da quantia: %.2f\n", resultado);
        
    }
}
/*Crie um algoritmo que leia o valor do salário de umfuncionário, calcule a quantidade de salários mínimosque o funcionário ganha e imprima o resultado daquantidade de salários. 
(1SM = R$ 1.412,00).*/