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
    int subOpcoes,opcao;


    public void primeiroCase (){
        do{
            mostrarFormulario.mostrarFormulario();
            System.out.println("Escolha uma das opções: ");
            subOpcoes = leitor.nextInt();
            leitor.nextLine();

            switch (subOpcoes) {
                case 1:
                    System.out.println("Digite o nome e o Sobrenome do pet: ");
                    String nomeESobrenome = leitor.nextLine();
                    pet.setNomeESobrenome(nomeESobrenome);
                    validacoes.conferindoSobrenomeAnimal(nomeESobrenome);
                    break;
                case 2:
                    System.out.println("1 - Cachorro\n2 - Gato");
                    System.out.print("Escolha uma das duas opções: ");
                    opcao = leitor.nextInt();
                    switch(opcao){
                        case 1:
                            pet.setTipoDoAnimal(Pet.tipoAnimal.CACHORRO);
                            break;
                        case 2:
                            pet.setTipoDoAnimal(Pet.tipoAnimal.GATO);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 - FEMEA\n2 - MACHO");
                    System.out.print("Escolha uma das opções acima: ");
                    opcao = leitor.nextInt();
                    switch(opcao){
                        case 1:
                            pet.setSexoDoAnimal(Pet.sexoAnimal.FEMEA);
                            break;
                        case 2:
                            pet.setSexoDoAnimal(Pet.sexoAnimal.MACHO);
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                    break;
                case 4:
                    System.out.println("Digite o número da casa: ");
                    int numeroDaCasa = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite a cidade: ");
                    String cidade = leitor.nextLine();
                    System.out.println("Digite a rua: ");
                    String rua = leitor.nextLine();
                    pet.setRua(rua);
                    pet.setNumeroDaCasa(numeroDaCasa);
                    pet.setCidade(cidade);

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
