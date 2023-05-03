import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            String pathNome = "D:\\fa\\linguagens de programação\\aulaRafaConcatena\\src\\ArquivoNomes.txt";
            String pathSobrenome = "D:\\fa\\linguagens de programação\\aulaRafaConcatena\\src\\SobreNomes.txt";
            String pathNomeSobrenome = "D:\\fa\\linguagens de programação\\aulaRafaConcatena\\src\\nomeSobrenome.txt";

            ManipuladorArquivo.leitor(pathNome);
            ManipuladorArquivo.leitor(pathSobrenome);
            ManipuladorArquivo.Sobrescrever(pathNome, pathSobrenome, pathNomeSobrenome);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
