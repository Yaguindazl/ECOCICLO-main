import java.util.Scanner;

public class ProjetinhoJava {
    
    static void Soma(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    
    static void Sub(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
    
    static void Mult(int x, int y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }
    
    static void Div(int x, int y) {
        if (y != 0) {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        
        System.out.println("ESCOLHA UMA OPÇÃO PARA A CALCULADORA:");
        System.out.println("1 ---- SOMA");
        System.out.println("2 ---- SUBTRAÇÃO");
        System.out.println("3 ---- MULTIPLICAÇÃO");
        System.out.println("4 ---- DIVISÃO");
        int opcao = sc.nextInt();
        
        switch(opcao) {
        
        case 1:
            Soma(num1, num2);
            break;
            
        case 2:
            Sub(num1, num2);
            break;
            
        case 3:
            Mult(num1, num2);
            break;
            
        case 4:
            Div(num1, num2);
            break;
            
        default:
            System.out.println("Opção inválida.");
        }
        
        sc.close();
    }
}