import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor (String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = " ";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = " ";
        Scanner in =new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void Sobrescrever(String path, String path2, String path3) throws IOException {

        BufferedReader brNome = new BufferedReader(new FileReader(path));
        BufferedReader brSobrenome = new BufferedReader(new FileReader(path2));
        BufferedWriter brNomeSobrenome = new BufferedWriter(new FileWriter(path3));

        String linhaNome, linhaSobrenome;

        while ((linhaNome = brNome.readLine()) != null && (linhaSobrenome = brSobrenome.readLine()) != null) {
            brNomeSobrenome.write(linhaNome + " " + linhaSobrenome + "\n");
        }
        brNome.close();
        brSobrenome.close();
        brNomeSobrenome.close();

        System.out.println("\nNomes completos foram gravados em: " + path3);
    }
}
