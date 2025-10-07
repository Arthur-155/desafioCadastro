package menus.cases;

import pet.Pet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case2 {
    Scanner leitor = new Scanner(System.in);

    public void segundoCase(){
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
                    List <String> encontrados = buscandoNoArquivo(termoPesquisado);
                    alterarPet(encontrados);
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
                    List <String> encontrados = buscandoNoArquivo(termoPesquisado);
                    alterarPet(encontrados);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    List<String>petEncontradoPeloSexo = buscandoNoArquivo(sexoPesquisado);
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
                    System.out.println("Digite o nome e sobrenome e idade [Deve ser exato]: ");
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

    public void perguntasFormulario (){
        System.out.println("1 - Nome Ou Sobrenome\n2 - Sexo\n3 - Idade\n4 - Peso\n5 - Raça\n6 - Endereço\n" +
                           "7 - Nome e Sobrenome e Idade\n8 - Nome\n9 - Sobrenome\n10 - Idade e Peso");
    }

    public List<String> buscandoNoArquivo(String... termoProcurado){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List <String> linhasDoPet = new ArrayList<>();
        List <String> petsEncontrados = new ArrayList<>();

            try(Scanner leitor = new Scanner(arquivo)){
                while(leitor.hasNextLine()){
                    String linha = leitor.nextLine();
                    if(!linha.isBlank() && !linha.contains(".TXT")){
                        if(linha.matches("\\d+\\s*-.*")){
                            linhasDoPet.add(linha.split(" - ", 2)[1]);
                        }
                    }
                    if(linhasDoPet.size() == 7 || !leitor.hasNextLine()){
                        String petResumo = String.join(" - ", linhasDoPet);
                        if(petResumo.toLowerCase().contains(termoProcurado[0].toLowerCase())){
                            petsEncontrados.add(petResumo);
                        }
                        linhasDoPet.clear();
                    }
                }
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        if(petsEncontrados.isEmpty()){
            System.out.println("Nenhum pet encontrado com o termo: " + termoProcurado);
        }else{
            for(int i =0; i<petsEncontrados.size(); i++){
                System.out.println(i+1 + ". " + petsEncontrados.get(i));
            }
        }
        return petsEncontrados;
    }


    public void alterarPet(List <String> encontrados){
       if(encontrados.isEmpty()){return;};

        System.out.println("Escolha qual desses pets deseja alterar: ");
        int escolha = leitor.nextInt();
        leitor.nextLine();

        if(escolha < 1 || escolha > encontrados.size() ){
            System.out.println("Opção inválida");
            return;
        }

        String petEscolhido =  encontrados.get(escolha-1);
        System.out.println("Pet escolhido: " + petEscolhido);

        String campos[] = petEscolhido.split(" - ");
        for(int i =0; i<campos.length; i++){
            campos[i] = campos[i].trim();
        }

        int opcao;
        do{
            System.out.println("1 - Nome\n2 - Endereço\n3 - Idade\n4 - Peso\n" +
                               "5 - Raça\n0 - Salvar e Sair");
            System.out.print("O que você deseja alterar nesse pet ?: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o novo nome: ");
                    campos[0]= leitor.nextLine().trim();
                    break;
                case 2:
                    System.out.println("Digite o novo Endeço: ");
                    campos[3]= leitor.nextLine().trim();
                    break;
                case 3:
                    System.out.println("Digite a nova idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    if(!stringIdade.contains("anos")){
                        campos[4]= idade + " anos";
                    }else{
                        campos[4] =  stringIdade;
                    }
                    break;
                case 4:
                    System.out.println("Digite o novo peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    if(!stringPeso.contains("kg")){
                        campos[5]= stringPeso + " kg";
                    }else {
                        campos[5]= stringPeso;
                    }
                    break;
                case 5:
                    System.out.println("Digite a raça: ");
                    campos[6]= leitor.nextLine().trim();
                    break;
                case 0:
                    System.out.println("Salvando e Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 0);
        String informacoesAtualizadas = String.join(" - ", campos);
        atualizandoNoArquivo(petEscolhido,informacoesAtualizadas);
        System.out.println("Pet atualizado: " +  informacoesAtualizadas);
    }


    public void atualizandoNoArquivo(String antigo, String novo) {
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt");
        List<String> todasLinhasDoArquivo = new ArrayList<>();

        try(Scanner sc = new Scanner(arquivo)){
            while(sc.hasNextLine()){
                todasLinhasDoArquivo.add(sc.nextLine());
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

        String [] novosCampos = novo.split(" - ");
        if(novosCampos.length != 7){
            System.out.println("O bloco não tem 7 campos" + novosCampos.length);
            return;
        }
        boolean atualizou = false;

        for(int i =0; i<todasLinhasDoArquivo.size(); ){
            String linhas = todasLinhasDoArquivo.get(i).trim();
            if(!linhas.toUpperCase().endsWith(".TXT")){
                i++;
                continue;
            }

            if(i+7 >= todasLinhasDoArquivo.size())break;

            String[] valoresBloco = new String[7];
            boolean blocoPreenchido = true;
            for(int j = 0; j<7; j++){
                String linhaDoBloco = todasLinhasDoArquivo.get(i + 1 + j);
                int pos = linhaDoBloco.indexOf(" - ");
                if(pos == -1){blocoPreenchido = false; break;}
                valoresBloco[j] = linhaDoBloco.substring(pos+3).trim();
            }
            if(!blocoPreenchido){i++;continue;}

            String blocosDoPet = String.join(" - ",valoresBloco);

            if(blocosDoPet.equals(antigo)){
                for (int j = 0; j<7; j++){
                    todasLinhasDoArquivo.set(i +1 + j, (j+1) + " - " + novosCampos[j].trim());
                }
                atualizou = true;
                break;
            }
            i += 8;
        }

        try (BufferedWriter escrevendo = new BufferedWriter(new FileWriter(arquivo,false))) {
            for (String l : todasLinhasDoArquivo) {
                escrevendo.write(l);
                escrevendo.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }


