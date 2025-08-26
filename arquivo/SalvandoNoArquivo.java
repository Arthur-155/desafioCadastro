package arquivo;

import pet.Pet;


import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SalvandoNoArquivo {

    public void salvarArquivo(Pet pet){
        try(FileWriter fw = new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt",true)){
            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
            String agoraFormatado = agora.format(dataFormatada);
            String semEspaco = pet.getNomeESobrenome().replaceAll("\\s+", "");
            fw.write(agoraFormatado + "-" + semEspaco.toUpperCase().trim() + ".TXT\n");
            fw.write("1 - " + pet.getNomeESobrenome() + "\n");
            fw.write("2 - " + pet.getTipoDoAnimal() + "\n");
            fw.write("3 - " + pet.getSexoDoAnimal() + "\n");
            fw.write("4 - " + pet.getRua() + ", " + pet.getNumeroDaCasa() + ", " + pet.getCidade() + "\n");
            fw.write("5 - " + pet.getIdadeAproximada() + " anos\n");
            fw.write("6 - " + pet.getPesoAproximado() + " kg\n");
            fw.write("7 - " + pet.getRacaAnimal() + "\n");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
