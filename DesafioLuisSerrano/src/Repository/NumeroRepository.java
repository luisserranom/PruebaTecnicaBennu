package Repository;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;


import static Config.AppConstants.RUTA_ARCHIVOS_GENERADOS_ORDENADOS;
import static Config.AppConstants.RUTA_ARCHIVOS_GENERADOS_AZAR;

public class NumeroRepository {

    public void guardarNumerosAzar(ArrayList<Integer> numerosAzar){
        try{
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter(
                            RUTA_ARCHIVOS_GENERADOS_AZAR ,false));
            for(Integer numero: numerosAzar){
                escritor.write(String.valueOf(numero));
                escritor.newLine();
            }
            escritor.close();
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo" + e.getMessage());
        }

    }
    public String buscarArchivoAzar(){
        File archivo = new File(RUTA_ARCHIVOS_GENERADOS_AZAR);
        if(archivo.exists()){
            return RUTA_ARCHIVOS_GENERADOS_AZAR;
        }else {
            return null;
        }
    }

    public void guardarNumerosOrdenados(ArrayList<Integer> numerosOrdenados){
        try{
            BufferedWriter escritor = new BufferedWriter(
                    new FileWriter(
                            RUTA_ARCHIVOS_GENERADOS_ORDENADOS ,true));
            for(Integer numero: numerosOrdenados){
                escritor.write(String.valueOf(numero));
                escritor.newLine();
            }
            escritor.close();
        }catch(IOException e){
            System.out.println("Error al escribir en el archivo" + e.getMessage());
        }
    }
    public String buscarArchivoOrdenados(){
        File archivo = new File(RUTA_ARCHIVOS_GENERADOS_ORDENADOS);
        if(archivo.exists()){
            return RUTA_ARCHIVOS_GENERADOS_ORDENADOS;
        }else {
            return null;
        }
    }

}
