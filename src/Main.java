import controller.ArquivosController;
import controller.IArquivosController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        IArquivosController arquivosController = new ArquivosController();

        String path = "C:\\TEMP";
        String nome = "generic_food.csv";
        try {
            arquivosController.readFile(path, nome);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}