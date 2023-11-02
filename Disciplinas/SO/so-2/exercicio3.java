import java.io.*;

public class exercicio3 {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Modo_de_uso: java exercicio3 <comando> [argumentos]");
            System.exit(1);
        }
        
        // Crie uma lista para armazenar o comando e seus argumentos
        // args[0] é o comando, os argumentos começam a partir de args[1]
        ProcessBuilder pb = new ProcessBuilder(args);
        
        pb.redirectErrorStream(true); // Redireciona a saída de erro para a saída padrão

        Process process = pb.start();
        System.out.println("Início do comando: " + String.join(" ", args));

        try {
            // Crie um leitor de entrada para ler a saída do processo
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            // Leia e imprima a saída do processo linha por linha
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Aguarde o término do processo
            int exitCode = process.waitFor();
            System.out.println("Fim do comando: " + String.join(" ", args));
            System.out.println("Código de saída: " + exitCode);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

