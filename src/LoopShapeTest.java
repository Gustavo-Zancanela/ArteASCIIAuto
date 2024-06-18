
import java.util.Scanner;

public class LoopShapeTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int width, height, leg;       
        
        
        System.out.println("Digite as dimensões do retâmgulo (largura, altura) ");
          width = sc.nextInt();
          height = sc.nextInt();
        
            LoopShape.createRectangle(width , height);
         
        System.out.println("Digite o lado do triângulo ");
         
          leg = sc.nextInt();
        
            LoopShape.createTriangle(leg);
    }   
}
