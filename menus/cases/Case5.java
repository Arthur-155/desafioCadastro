package menus.cases;

import pet.Pet;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case5 {
    public void quintoCase() {
        int opcao, tipoAnimal;
        Pet pet = new Pet();
        Scanner leitor = new Scanner(System.in);


        System.out.println("1 - Cachorro\n2 - Gato");
        System.out.print("Qual tipo de animal é: ");
        tipoAnimal = leitor.nextInt();

        if (tipoAnimal == 1) {
            pet.setTipoDoAnimal(Pet.tipoAnimal.CACHORRO);
            System.out.println("Você escolheu pesquisar cachorros!");
            perguntasFormulario();
            System.out.println("Por qual desses meios deseja buscar o perfil que deseja alterar: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome Ou Sobrenome: ");
                    String termoPesquisado = leitor.nextLine();
                    buscandoPets(termoPesquisado);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    buscandoPets(sexoPesquisado);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    buscandoPets(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    buscandoPets(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    buscandoPets(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    buscandoPets(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome e sobrenome e idade [Deve ser exato]: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    buscandoPets(nomeAnimal, sobrenomeAnimal, stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    buscandoPets(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    buscandoPets(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    buscandoPets(stringidadeAnimal, stringPesoAnimal);
                    break;
            }
        } else if (tipoAnimal == 2) {
            pet.setTipoDoAnimal(Pet.tipoAnimal.GATO);
            System.out.println("Você escolheu pesquisar Gatos!");
            perguntasFormulario();
            System.out.println("Por qual desses meios deseja buscar o perfil que deseja alterar: ");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome Ou Sobrenome: ");
                    String termoPesquisado = leitor.nextLine();
                    buscandoPets(termoPesquisado);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    buscandoPets(sexoPesquisado);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    buscandoPets(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    buscandoPets(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    buscandoPets(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    buscandoPets(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    buscandoPets(nomeAnimal, sobrenomeAnimal, stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    buscandoPets(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    buscandoPets(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade e Peso: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    buscandoPets(stringidadeAnimal, stringPesoAnimal);
                    break;
            }

        }


    }

    public List<String> buscandoPets(String... criterios) {
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List<String> linhasDoArquivo = new ArrayList<>();
        List<String> petsEncotrados = new ArrayList<>();

        try (Scanner leitor = new Scanner(arquivo)) {
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                if (!linha.endsWith(".TXT")) {
                    if (linha.matches("\\d+\\s*-.*")) {
                        linhasDoArquivo.add(linha.split(" - ", 2)[1]);
                    }
                }
                if (linhasDoArquivo.size() == 7) {
                    String procurandoPet = String.join(" - ", linhasDoArquivo);
                    if (procurandoPet.toLowerCase().contains(criterios[0].toLowerCase())){
                        petsEncotrados.add(procurandoPet);
                    }
                    linhasDoArquivo.clear();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (petsEncotrados.isEmpty()){
            System.out.println("Nenhum pet foi encontrado com esses critérios!");
        }else{
            for (int i=0; i<petsEncotrados.size(); i++){
                System.out.println(i+1 + " -> " + petsEncotrados.get(i));
            }
        }
        return petsEncotrados;
    }

    public void perguntasFormulario() {
        System.out.println("1 - Nome Ou Sobrenome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereço\n" +
                "7 - Nome e Sobrenome e Idade\n8 - Nome\n9 - Sobrenome\n10 - Idade e Peso");
    }
}