package menus;

import java.io.FileReader;
import java.util.Scanner;

public class MostrarFormulario {


    public void mostrarFormulario(){
        try{
            FileReader arquivo = new FileReader("formulario.txt");
            Scanner conteudoArquivo = new Scanner(arquivo);
            while (conteudoArquivo.hasNextLine()) {
                String linhaArquivo = conteudoArquivo.nextLine();
                System.out.println(linhaArquivo);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
