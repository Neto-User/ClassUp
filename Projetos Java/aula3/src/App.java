import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o valor de X1");
        double x1 = tc.nextDouble();
        System.out.println("Digite o valor de Y1");
        double y1 = tc.nextDouble();
        System.out.println("Digite o valor de X2");
        double x2 = tc.nextDouble();
        System.out.println("Digite o valor de Y2");
        double y2 = tc.nextDouble();
        double primeiro_termo = (x2 - x1)*(x2 - x1);
        double segundo_termo = (y2 -y1)*(y2 -y1);
        double dist = primeiro_termo + segundo_termo;
        dist = Math.sqrt(dist);
        System.out.println("A distancia e: " + dist);
      
        
    }
}
