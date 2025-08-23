package arquivo;

import pet.Pet;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class SalvandoNoArquivo {

    public void salvarArquivo(Pet pet){
        try(FileWriter fw = new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\java\\desafioCadastro\\petsCadastrados\\petsCadastrados.txt",true)){
            LocalDateTime agora = LocalDateTime.now();
            LocalTime horaDeAgora = LocalTime.now();
            LocalDateTime agoraFormatado = agora.toLocalDate().atTime(horaDeAgora);
            fw.write(String.valueOf(agoraFormatado) + "-" + pet.getNomeESobrenome().toUpperCase() + ".TXT\n");
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
