package menus.validacoes;

import java.util.regex.Matcher;

public class Validacoes {

    private int opcoes;
    private String nomeAnimal;

    public int conferindoCaracteresMenu(String entrada, int opcoes){
        if (entrada.matches("-?\\d+")){
            this.opcoes = Integer.parseInt(entrada);
            if(this.opcoes == 0){
                System.out.println("Não é aceito o valor 0");
                return -1;
            } else if (this.opcoes < 0) {
                System.out.println("Não é permitido números menores que zero!");
                return -1;
            }
            return this.opcoes;
        }else{
            System.out.println("Não é permitido letras, apenas números!");
            return -1;
        }
    }

    public String conferindoSobrenomeAnimal(String nomeAnimal){
        if(nomeAnimal == null){
            throw new IllegalArgumentException("Não é permitido o nome do animal estar vazio");
        }
        String nomeAnimalSemEspaco = nomeAnimal.trim();
        String [] partes = nomeAnimalSemEspaco.split("\\s+");
        String conferindoCaracteresEspeciais = nomeAnimalSemEspaco;
        if(conferindoCaracteresEspeciais.matches(".*[^\\w\\s].*")){
            throw new IllegalArgumentException("Não é permitido caracteres especiais");
        } else if (partes.length <=1) {
            throw new IllegalArgumentException("É necessário inserir o sobrenome do animal!");
        }else {
            System.out.println("Nome cadastrado com sucesso");
        }
        return this.nomeAnimal;
    }

}
