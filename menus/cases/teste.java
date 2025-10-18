package menus.cases;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
    public void teste(){

    }
    public List<String>testeProcurandoPet(String...termos){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List<String>linhasDoArquivo = new ArrayList<>();
        List<String>blocosEncontrados = new ArrayList<>();

        try(Scanner leitor = new Scanner(arquivo)){
            while (leitor.hasNextLine()){
                String linhas = leitor.next();

                if (!linhas.endsWith(".TXT")){
                    if (linhas.matches("\\d+\\s*-.*")){
                        linhasDoArquivo.add(linhas.split(" - ", 2)[1]);
                    }
                }
                if (linhasDoArquivo.size() == 7){
                    String blocoDosPets = String.join(" - ", linhasDoArquivo);
                    if (blocoDosPets.toLowerCase().contains(termos[0].toLowerCase())){
                        blocosEncontrados.add(blocoDosPets);
                    }
                    linhasDoArquivo.clear();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Arquivo não encontrado irmao!");
        }

        if (blocosEncontrados.isEmpty()){
            System.out.println("Não foi encontrado nenhum pet com esse termo");
        }else{
            for (int i =0; i<blocosEncontrados.size(); i++){
                System.out.println(i+1 + " -> " + blocosEncontrados);
            }
        }
        return blocosEncontrados;
    }
    //deu bom
}


