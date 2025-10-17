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
                    deletarPet(encontradoPeloSexo);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    List<String>encontradoPelaIdade = buscandoNoArquivo(stringIdade);
                    deletarPet(encontradoPelaIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    List<String>encontradoPeloPeso = buscandoNoArquivo(stringPeso);
                    deletarPet(encontradoPeloPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    List<String>EncontradoPelaRaca = buscandoNoArquivo(racaPesquisada);
                    deletarPet(EncontradoPelaRaca);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    List<String>EncontradosPeloEndereco = buscandoNoArquivo(enderecoPesquisado);
                    deletarPet(EncontradosPeloEndereco);
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
                    deletarPet(encontradosPeloNomeSobrenomeIdade);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    List<String>encontradosPeloNome = buscandoNoArquivo(nomePesquisado);
                    deletarPet(encontradosPeloNome);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    List<String>encontradosPeloSobrenome = buscandoNoArquivo(sobrenomePesquisado);
                    deletarPet(encontradosPeloSobrenome);
                    break;
                case 10:
                    System.out.println("Digite a idade: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    List<String>encontradosPeloPesoIdade = buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
                    deletarPet(encontradosPeloPesoIdade);
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
                    deletarPet(encontrados);
                    break;
                case 2:
                    System.out.println("Digite o Sexo: ");
                    String sexoPesquisado = leitor.nextLine();
                    List<String>petEncontradoPeloSexo = buscandoNoArquivo(sexoPesquisado);
                    System.out.println(petEncontradoPeloSexo);
                    deletarPet(petEncontradoPeloSexo);
                    break;
                case 3:
                    System.out.println("Digite a idade: ");
                    int idade = leitor.nextInt();
                    String stringIdade = String.valueOf(idade);
                    List<String>petEncontradoPelaIdade = buscandoNoArquivo(stringIdade);
                    deletarPet(petEncontradoPelaIdade);
                    break;
                case 4:
                    System.out.println("Digite o peso: ");
                    int peso = leitor.nextInt();
                    String stringPeso = String.valueOf(peso);
                    List<String>petEncontradoPeloPeso = buscandoNoArquivo(stringPeso);
                    deletarPet(petEncontradoPeloPeso);
                    break;
                case 5:
                    System.out.println("Digite a Raça do animal: ");
                    String racaPesquisada = leitor.nextLine();
                    List<String>petEncontradoPelaRaca = buscandoNoArquivo(racaPesquisada);
                    deletarPet(petEncontradoPelaRaca);
                    break;
                case 6:
                    System.out.println("Digite o endereço: ");
                    String enderecoPesquisado = leitor.nextLine();
                    List<String>petEncontradoPeloEndereco = buscandoNoArquivo(enderecoPesquisado);
                    deletarPet(petEncontradoPeloEndereco);
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
                    deletarPet(PetEncontradoPeloNomeEIdade);
                    break;
                case 8:
                    System.out.println("Digite o nome que deseja Pesquisar: ");
                    String nomePesquisado = leitor.nextLine();
                    List<String>PetEncontradoPeloNome = buscandoNoArquivo(nomePesquisado);
                    deletarPet(PetEncontradoPeloNome);
                    break;
                case 9:
                    System.out.println("Digite o sobrenome que deseja pesquisar: ");
                    String sobrenomePesquisado = leitor.nextLine();
                    List<String>PetEncontradoPeloSobrenome = buscandoNoArquivo(sobrenomePesquisado);
                    deletarPet(PetEncontradoPeloSobrenome);
                    break;
                case 10:
                    System.out.println("Digite a idade e Peso: ");
                    idadeAnimal = leitor.nextInt();
                    System.out.println("Digite o peso: ");
                    int pesoAnimal = leitor.nextInt();
                    String stringidadeAnimal = idadeAnimal + " anos";
                    String stringPesoAnimal = pesoAnimal + ".0 kg";
                    List<String>PetEncontradoPelaIdadeEPeso = buscandoNoArquivo(stringidadeAnimal,stringPesoAnimal);
                    deletarPet(PetEncontradoPelaIdadeEPeso);
                    break;
            }
        }
    }
    public boolean deletarPet(List<String>petBuscado){
        File arquivo = new File("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt"); //arquivo vai ler o arquivo
        List<String>blocoDoPetEncontrado = new ArrayList<>(); //uma lista do tipo string com o nome blocoDoPetEncontrado

        System.out.println("Escolha qual desses pets deseja deletar: "); //mensagem que irá aparecer para o usuário
        int escolha = leitor.nextInt(); // escolha irá armazenar o valor digitado para o usuário
        leitor.nextLine(); //essa linha serve apenas para ter certeza que o próximo valor digitado não seja "Engolido"

        //Esse if serve como validação, caso o usuário digite algum valor fora das opções "esperadas" dará Opção inválida
        if(escolha < 1 || escolha > petBuscado.size()){
            System.out.println("Opção inválida");
            return false;
        }

        //opcaoEscolhida irá armazenar a lista passada por parametro -1, pois os blocos do arquivo
        //cada um representa uma posição começando com 0, ou seja se o usuário escolher 1 para pet buscado
        //vai ser correspondente ao bloco 0
        String opcaoEscolhida = petBuscado.get(escolha-1);
        System.out.println("Pet escolhido: " + opcaoEscolhida); // printa o pet escolhido

        //fim de arquivo NÃO lança exceção. O while termina normalmente quando hasNextLine() for falso.
        //Exceção só ocorre por erro de I/O (ex.: arquivo inacessível).
        /* OBS: este break assume que blocos incompletos só aparecem no fim do arquivo. */
        try(Scanner lt = new Scanner(arquivo)){
            while (lt.hasNextLine()) {
                blocoDoPetEncontrado.add(lt.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //booleano setando deletou como falso
        boolean deletou = false;
        //aqui é mapeado o cabeçalho de cada bloco, todos no cabeçalho tem uma linha que termina com .txt
        //esse bloco serve para ignorar esse bloco .txt e ler apenas as próximas linhas
        for(int i =0; i<blocoDoPetEncontrado.size();){
           String resumo = blocoDoPetEncontrado.get(i).trim();
           if(!resumo.toUpperCase().endsWith(".TXT")){
               i++;
               continue;
           }

           //se o bloco encontrado for maior ou igual a 7 ele sai da condicional
            // isso serve para garantir que a estrutura está como esperado
           if (i+7 >= blocoDoPetEncontrado.size())break;

           //é declarado um array de 7 posições
           String [] temp = new String[7];
           //ao chegar aqui o boolean blocoPreenchido vira true, é esperado que aqui o bloco está como esperado, estruturalmente falando
           boolean blocoPreenchido = true;
           //nesse for vemos linha a linha de cada bloco, i simboliza o bloco, enquanto j simboliza cada linha do bloco.
           //juntamos tudo numa linha só, seperando cada linha do bloco original com um -
           //se pos == -1 significa que a linha está mal formada sem o separado - , logo o bloco não está preenchido e a execução do if para.
           for(int j = 0; j < 7; j++){
               String blocoASerDeletado = blocoDoPetEncontrado.get(i+1+j);
               int pos = blocoASerDeletado.indexOf(" - ");
               if (pos==-1){
                   blocoPreenchido = false;
                   break;
               }

               /* substring(pos+3) pula ODO o separador " - " e captura apenas o valor à direita; depois trim() remove espaços. */
                temp[j] = blocoASerDeletado.substring(pos+3).trim();
           }
           //se o bloco estiver estruturalmente incorreto, parte para o próximo bloco
           if (!blocoPreenchido){i++;continue;}
             /* junta os 7 campos em UMA string "c1 - c2 - ... - c7" para comparar com a opção escolhida.
              A comparação é EXATA (equals). Diferenças de espaço/letras maiúsculas podem fazer falhar. */
           String blocoFinal = String.join(" - ",temp);
           if (blocoFinal.equals(opcaoEscolhida)){
               /* Remove 8 linhas: 1 do cabeçalho (.txt) + 7 de dados do pet. */
               blocoDoPetEncontrado.subList(i, i+8).clear();
               deletou = true;
               break;
           }
            /* Avança exatamente para o próximo bloco: pula cabeçalho + 7 linhas atuais. */
           i += 8;
        }
        //aqui é caso o deletou ocorreu ou seja se o bloco o fluxo ocorreu como esperado
        if (deletou){
            //aqui atualizamos o arquivo agora com -1 bloco, já que ele foi excluido.
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

