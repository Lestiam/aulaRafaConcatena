import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String pathNome = "C:\\Users\\12116809\\Downloads\\ArquivoNomes.txt";
        String pathSobrenome = "C:\\Users\\12116809\\Downloads\\SobreNomes.txt";
        String pathSobrescreve = "C:\\Users\\12116809\\Downloads\\teste.txt";

        ManipuladorArquivo.leitor(pathNome);
        ManipuladorArquivo.leitor(pathSobrenome);
        ManipuladorArquivo.Sobrescrever(pathNome);


    }
}
