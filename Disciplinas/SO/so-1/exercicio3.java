import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String [] args) {
        try {
            Charset ENCODING = StandardCharsets.UTF_8;
            Path path = Paths.get("ficha.txt");
            List<String> linhas = Files.readAllLines (path, ENCODING);
            for (int i=0; i< linhas.size(); i++)
                System.err.println("Linha_n."+i+":"+linhas.get(i));

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
        } catch (IOException ex) {
            System.out.println("Erro_no_acesso_ao_ficheiro...");
        }
    }
}
