import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        int jan, fev, mar;
        System.out.println("Digite os gastos de janeiro:");
        jan = tc.nextInt();
        System.out.println("Digite os gastos de fevereiro:");
        fev = tc.nextInt();
        System.out.println("Digite os gastos de marco:");
        mar = tc.nextInt();
        int soma = jan + fev + mar;
        int media = soma / 3;
        
        System.out.println("Os gastos totais foram: $" + soma);
        System.out.println("A média geral foi: $" + media);
    
    }
}
/*Na empresa dos Barões da Pisadinha, há tabelas com ogasto de cada mês. Para fechar o balanço do primeirotrimestre,
precisamos somar o gasto total. Sabendoque, em janeiro, foram gastos 15 mil reais, emfevereiro, 23 mil reais e, em março, 17 mil reais, 
façaum programa que calcule e imprima a despesa total notrimestre e a média mensal de gastos.*/