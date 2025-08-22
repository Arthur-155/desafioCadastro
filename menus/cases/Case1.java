package menus.cases;

import arquivo.SalvandoNoArquivo;
import menus.MostrarFormulario;
import menus.validacoes.Validacoes;
import pet.Pet;

import java.util.Scanner;

public class Case1 {

    Pet pet = new Pet();
    Scanner leitor = new Scanner(System.in);
    MostrarFormulario mostrarFormulario = new MostrarFormulario();
    SalvandoNoArquivo salvandoNoArquivo = new SalvandoNoArquivo();
    Validacoes validacoes = new Validacoes();
    int subOpcoes;
    public String entrada;


    public void primeiroCase (){
        do{
            mostrarFormulario.mostrarFormulario();
            System.out.println("Escolha uma das opções: ");
            entrada = leitor.nextLine();
            subOpcoes = validacoes.conferindoCaracteresMenu(entrada,subOpcoes);

            switch (subOpcoes) {

                case 1:

                    System.out.println("Digite o nome e o Sobrenome do pet: ");
                    String nomeESobrenome = leitor.nextLine();
                    pet.setNomeESobrenome(nomeESobrenome);
                    validacoes.conferindoSobrenomeAnimal(nomeESobrenome);
                    break;
                case 2:
                    System.out.println("1 - Cachorro\n2 - Gato: ");
                    int tipoDoPet = leitor.nextInt();
                    
                    break;
                case 3:
                    System.out.println("Digite o sexo do animal: ");
                    pet.setSexoDoAnimal(leitor.nextLine());
                    break;
                case 4:
                    System.out.println("Digite o endereço que o pet foi encontrado: ");
                    pet.setEnderecoEBairroEncontrado(leitor.nextLine());
                    break;
                case 5:
                    System.out.println("Digite a idade aproximada do pet: ");
                    pet.setIdadeAproximada(leitor.nextInt());
                    break;
                case 6:
                    System.out.println("Digite o peso aproximado do pet: ");
                    pet.setPesoAproximado(leitor.nextDouble());
                    break;
                case 7:
                    System.out.println("Digite a raça do pet: ");
                    pet.setRacaAnimal(leitor.nextLine());
                    break;
                case 8:
                    salvandoNoArquivo.salvarArquivo(pet);
                    break;
                default:
                    System.out.println("Valor inválido, tente novamente!");
                    break;
            }


        }while(subOpcoes!=8);
    }
}
