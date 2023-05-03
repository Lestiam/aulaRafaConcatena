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

    public static void Sobrescrever(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha1 = "";
        String linha2 = "";
        while (true) {
            if (linha1 != null) {
                System.out.println(linha1);
            } else
                break;
            linha1 = buffRead.readLine();
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        //String linha = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Nomes: ");
        //linha1 = in.nextLine();
        //linha2 = in.nextLine();
        buffWrite.append(linha1 + " " + linha2 + "\n");
        buffWrite.close();
    }
}
