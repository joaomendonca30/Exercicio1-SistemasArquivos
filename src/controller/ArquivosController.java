package controller;

import java.io.*;

public class ArquivosController implements IArquivosController {

    @Override
    public void readFile(String path, String nome) throws IOException {
        File arq = new File(path, nome);
        if(arq.exists() && arq.isFile()){
            FileInputStream fluxo = new FileInputStream(arq);
            InputStreamReader leitor = new InputStreamReader(fluxo);
            BufferedReader buffer = new BufferedReader(leitor);
            String linha = buffer.readLine();

            while(linha != null){
                String[] parts = linha.split(",");
                if(parts[2].contains("Fruits")){
                    System.out.printf("%-20s\t%-30s\t%-20s\n", parts[0].trim(), parts[1].trim(), parts[3].trim());
                }

                linha = buffer.readLine();
            }
            buffer.close();
            leitor.close();
            fluxo.close();

        }
        else{
            throw new IOException("Arquivo inválido");
        }
    }
}
