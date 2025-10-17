package menus.cases;

import pet.Pet;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case4 {

    public void quartoCase(){

        System.out.println("       PETS ENCONTRADOS       ");
        listarPetsCadastrados();



    }
    public void listarPetsCadastrados(){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List<String>PetsEncontrados = new ArrayList<>();
        try{
            Scanner leitorDoArquivo = new Scanner(arquivo);
            while(leitorDoArquivo.hasNextLine()){
                String linhas = leitorDoArquivo.nextLine();
                if(!linhas.isBlank() && !linhas.contains(".TXT")){
                    if(linhas.matches("\\d+\\s*-.*")){
                        String valor = linhas.split(" - ", 2)[1].trim();
                        PetsEncontrados.add(valor);
                        if(PetsEncontrados.size() == 7){
                            System.out.println("==============================");
                            System.out.println(String.join(" - ", PetsEncontrados));
                            System.out.println("==============================");
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(PetsEncontrados);
    }
}
