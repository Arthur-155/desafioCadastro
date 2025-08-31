package menus.cases;

import pet.Pet;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case2 {

    public void segundoCase(){
        int opcao,tipoAnimal;
        Scanner leitor = new Scanner(System.in);
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
                    buscandoNoArquivo(termoPesquisado);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    buscandoNoArquivo(sexoPesquisado);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    buscandoNoArquivo(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    buscandoNoArquivo(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    buscandoNoArquivo(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    buscandoNoArquivo(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome e sobrenome e idade [Deve ser exato]: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    buscandoNoArquivo(nomeAnimal,sobrenomeAnimal,stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    buscandoNoArquivo(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    buscandoNoArquivo(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
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
                    buscandoNoArquivo(termoPesquisado);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    buscandoNoArquivo(sexoPesquisado);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    buscandoNoArquivo(stringIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    buscandoNoArquivo(stringPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    buscandoNoArquivo(racaPesquisada);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    buscandoNoArquivo(enderecoPesquisado);
                    break;
                case 7:
                    System.out.println("Digite o nome e sobrenome e idade [Deve ser exato]: ");
                    String nomeAnimal = leitor.nextLine();
                    System.out.println("Digite o sobrenome do Animal: ");
                    String sobrenomeAnimal = leitor.nextLine();
                    System.out.println("Digite a idade do animal: ");
                    int idadeAnimal = leitor.nextInt();
                    String stringIdadeAnimal = idadeAnimal + " anos";
                    buscandoNoArquivo(nomeAnimal,sobrenomeAnimal,stringIdadeAnimal);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    buscandoNoArquivo(nomePesquisado);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    buscandoNoArquivo(sobrenomePesquisado);
                    break;
                case 10:
                    System.out.println("Digite a idade: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
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
        boolean encontrou = false;
        int contador = 1;

            try(Scanner leitor = new Scanner(arquivo)){
                List <String> linhasDoPet = new ArrayList<>();

                while(leitor.hasNextLine()){
                    String linha = leitor.nextLine();
                    if(!linha.isBlank() && !linha.contains(".TXT")){
                        if(linha.matches("\\d+\\s*-.*")){
                            linhasDoPet.add(linha.split(" - ", 2)[1]);
                        }
                    }
                    if(linhasDoPet.size() == 7 || !leitor.hasNextLine()){
                        String petResumo = String.join(" - ", linhasDoPet);
                        if(petResumo.toLowerCase().contains(termoProcurado.toLowerCase())){
                            System.out.println(contador + "." + petResumo);
                            encontrou = true;
                            contador++;
                        }
                        linhasDoPet.clear();
                    }

                }
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        if(!encontrou){
            System.out.println("Nenhum pet encontrado com o termo: " + termoProcurado);
        }
    }

    public void buscandoNoArquivo(String termo1, String termo2){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        boolean encontrou = false;
        int contador = 1;

        try(Scanner leitor = new Scanner(arquivo)){
            List <String> linhasDoPet = new ArrayList<>();

            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                if(!linha.isBlank() && !linha.contains(".TXT")){
                    if(linha.matches("\\d+\\s*-.*")){
                        linhasDoPet.add(linha.split(" - ", 2)[1]);
                    }
                }
                if(linhasDoPet.size() == 7 || !leitor.hasNextLine()){
                    String petResumo = String.join(" - ", linhasDoPet);
                    if(petResumo.toLowerCase().contains(termo1.toLowerCase()) && petResumo.toLowerCase().contains(termo2.toLowerCase())){
                        System.out.println(contador + "." + petResumo);
                        encontrou = true;
                        contador++;
                    }
                    linhasDoPet.clear();
                }

            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if(!encontrou){
            System.out.println("Nenhum pet encontrado com o termo: " + termo1 + termo2);
        }
    }

    public void buscandoNoArquivo(String termo1, String termo2, String termo3){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        boolean encontrou = false;
        int contador = 1;

        try(Scanner leitor = new Scanner(arquivo)){
            List <String> linhasDoPet = new ArrayList<>();

            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                if(!linha.isBlank() && !linha.contains(".TXT")){
                    if(linha.matches("\\d+\\s*-.*")){
                        linhasDoPet.add(linha.split(" - ", 2)[1]);
                    }
                }
                if(linhasDoPet.size() == 7 || !leitor.hasNextLine()){
                    String petResumo = String.join(" - ", linhasDoPet);
                    if(petResumo.toLowerCase().contains(termo1.toLowerCase()) && petResumo.toLowerCase().contains(termo2.toLowerCase())
                       &&petResumo.toLowerCase().contains(termo3.toLowerCase())){
                        System.out.println(contador + "." + petResumo);
                        encontrou = true;
                        contador++;
                    }
                    linhasDoPet.clear();
                }

            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if(!encontrou){
            System.out.println("Nenhum pet encontrado com o termo: " + termo1 + termo2 + termo3);
        }
    }
}
