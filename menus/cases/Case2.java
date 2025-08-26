package menus.cases;

import arquivo.SalvandoNoArquivo;
import pet.Pet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case2 {

    public void segundoCase(){
        int opcao,tipoAnimal;
        Scanner leitor = new Scanner(System.in);
        Pet pet = new Pet();
        List<Pet>petsCadastrados = new ArrayList<>();


        System.out.println("1 - Cachorro\n2 - Gato");
        System.out.print("Qual tipo de animal é: ");
        tipoAnimal = leitor.nextInt();
        if(tipoAnimal == 1){
            pet.setTipoDoAnimal(Pet.tipoAnimal.CACHORRO);
            System.out.println("Você escolheu pesquisar cachorros!");
            perguntasFormulario();
            System.out.println("Por qual desses meios deseja buscar o perfil que deseja alterar: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome Ou Sobrenome: ");
                    String termoPesquisado = leitor.nextLine();
                    for(Pet cachorros: petsCadastrados){
                        if(pet.getTipoDoAnimal() == Pet.tipoAnimal.CACHORRO){
                            buscandoNoArquivo(termoPesquisado);
                        }
                    }
                    break;
            }
        }

    }

    public void perguntasFormulario (){
        System.out.println("1 - Nome Ou Sobrenome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereço\n" +
                "7 - Nome e Sobrenome e Idade\n8 - Nome\n9 - Sobrenome\n10 - Idade e Peso");
    }

    public void buscandoNoArquivo(String termoProcurado){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");



        try(Scanner leitor = new Scanner(arquivo)){
            String linha = leitor.nextLine();
            if(linha.contains(termoProcurado)){
                System.out.println(linha);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
