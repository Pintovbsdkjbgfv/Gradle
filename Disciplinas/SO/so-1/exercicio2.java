import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        double valor1 = Double.parseDouble(args[0]);
        double valor2 = Double.parseDouble(args[1]);
        
        double soma = valor1 + valor2;        
         System.out.println("A soma é: " + soma);          
         
         double subtracao = valor1 - valor2;         
         System.out.println("A subtração é: " + subtracao);   

         double multiplicacao = valor1 * valor2;         
         System.out.println("A multiplicação é: " + multiplicacao);          
         if (valor2 != 0) {             double divisao = valor1 / valor2;             
            System.out.println("A divisão é: " + divisao);         } 
        else { System.out.println("Não é possível dividir por zero.");         }
        
    }
}