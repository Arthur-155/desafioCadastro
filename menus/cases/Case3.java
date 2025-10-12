package menus.cases;

import pet.Pet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case3 extends Case2{

    public void terceiroCase(){
        int opcao,tipoAnimal;
        Pet pet = new Pet();

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
                    List<String> encontrados = buscandoNoArquivo(termoPesquisado);
                    deletarPet(encontrados);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    List<String>encontradoPeloSexo = buscandoNoArquivo(sexoPesquisado);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    List<String>encontradoPelaIdade = buscandoNoArquivo(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    List<String>encontradoPeloPeso = buscandoNoArquivo(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    List<String>EncontradoPelaRaca = buscandoNoArquivo(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    List<String>EncontradosPeloEndereco = buscandoNoArquivo(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome e sobrenome e idade [Deve ser exato]: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    List <String> encontradosPeloNomeSobrenomeIdade = buscandoNoArquivo(nomeAnimal,sobrenomeAnimal,stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    List<String>encontradosPeloNome = buscandoNoArquivo(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    List<String>encontradosPeloSobrenome = buscandoNoArquivo(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    List<String>encontradosPeloPesoIdade = buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
                    break;
            }
        } else if (tipoAnimal == 2) {
            pet.setTipoDoAnimal(Pet.tipoAnimal.GATO);
            System.out.println("Você escolheu pesquisar Gatos!");
            perguntasFormulario();
            System.out.println("Por qual desses meios deseja buscar o perfil que deseja alterar: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome Ou Sobrenome: ");
                    String termoPesquisado = leitor.nextLine();
                    List <String> encontrados = buscandoNoArquivo(termoPesquisado);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    List<String>petEncontradoPeloSexo = buscandoNoArquivo(sexoPesquisado);
                    System.out.println(petEncontradoPeloSexo);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    List<String>petEncontradoPelaIdade = buscandoNoArquivo(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    List<String>petEncontradoPeloPeso = buscandoNoArquivo(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    List<String>petEncontradoPelaRaca = buscandoNoArquivo(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    List<String>petEncontradoPeloEndereco = buscandoNoArquivo(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    List<String>PetEncontradoPeloNomeEIdade = buscandoNoArquivo(nomeAnimal,sobrenomeAnimal,stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    List<String>PetEncontradoPeloNome = buscandoNoArquivo(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    List<String>PetEncontradoPeloSobrenome = buscandoNoArquivo(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade e Peso: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    List<String>PetEncontradoPelaIdadeEPeso = buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
                    break;
            }
        }
    }
    public boolean deletarPet(List<String>petBuscado){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List<String>blocoDoPetEncontrado = new ArrayList<>();

        System.out.println("Escolha qual desses pets deseja deletar: ");
        int escolha = leitor.nextInt();
        leitor.nextLine();

        if(escolha < 1 || escolha > petBuscado.size()){
            System.out.println("Opção inválida");
            return false;
        }

        String opcaoEscolhida = petBuscado.get(escolha-1);
        System.out.println("Pet escolhido: " + opcaoEscolhida);

        try(Scanner lt = new Scanner(arquivo)){
            while (lt.hasNextLine()) {
                blocoDoPetEncontrado.add(lt.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        boolean deletou = false;
        for(int i =0; i<blocoDoPetEncontrado.size();){
           String resumo = blocoDoPetEncontrado.get(i).trim();
           if(!resumo.toUpperCase().endsWith(".TXT")){
               i++;
               continue;
           }

           if (i+7 >= blocoDoPetEncontrado.size())break;

           String [] temp = new String[7];
           boolean blocoPreenchido = true;
           for(int j = 0; j < 7; j++){
               String blocoASerDeletado = blocoDoPetEncontrado.get(i+1+j);
               int pos = blocoASerDeletado.indexOf(" - ");
               if (pos==-1){
                   blocoPreenchido = false;
                   break;
               }
                temp[j] = blocoASerDeletado.substring(pos+3).trim();
           }
           if (!blocoPreenchido){i++;continue;}

           String blocoFinal = String.join(" - ",temp);
           if (blocoFinal.equals(opcaoEscolhida)){
               blocoDoPetEncontrado.subList(i, i+8).clear();
               deletou = true;
               break;
           }
           i += 8;
        }

        if (deletou){
            try(BufferedWriter reescrevendoAposDelete = new BufferedWriter(new FileWriter(arquivo,false))){
                for(String deletar : blocoDoPetEncontrado){
                    reescrevendoAposDelete.write(deletar);
                    reescrevendoAposDelete.newLine();
                }
                System.out.println("Pet Excluído com sucesso!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return deletou;
    }
}

