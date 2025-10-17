package menus;

import menus.cases.Case1;
import menus.cases.Case2;
import menus.cases.Case3;
import menus.cases.Case4;
import menus.validacoes.Validacoes;
import pet.Pet;
import java.util.Scanner;

public class MenuInicial {
    Case1 case1 = new Case1();
    Case2 case2 = new Case2();
    Case3 case3 = new Case3();
    Case4 case4 = new Case4();
    Validacoes validacoes = new Validacoes();
    public String entrada;
    int opcoes;

    public void exibirMenu() {
        do {
            try {
                Pet pet = new Pet();
                Scanner leitor = new Scanner(System.in);
                System.out.println(
                        "1 - Cadastrar um novo pet\n" +
                        "2 - Alterar os dados do pet cadastrado\n" +
                        "3 - Deletar um pet cadastrado\n" +
                        "4 - Listar todos os pets cadastrados\n" +
                        "5 - Listar pets por algum critério (idade, nome, raça)\n" +
                        "6 - Sair");
                System.out.print("Escolha uma das opções: ");
                entrada = leitor.nextLine();
                opcoes = validacoes.conferindoCaracteresMenu(entrada,opcoes);

                if (opcoes == -1){
                    continue;
                }

                switch (opcoes) {
                    case 1:
                        case1.primeiroCase();
                        break;
                    case 2:
                        case2.segundoCase();
                        break;
                    case 3:
                        case3.terceiroCase();
                        break;
                    case 4:
                        case4.listarPetsCadastrados();
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } while (opcoes != 6);
    }
}
