package co.com.accenture.certificacion.despegar.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LoadDataTxt {
	
	
	    public static final String SEPARATOR = ",";
	    String[] fields = new String[3];

	    public String [] leerTxt() {
	        BufferedReader readbuffer = null;
	        try {
	            // Abrir el .csv en buffer de lectura
	            readbuffer = new BufferedReader(new FileReader("src/test/resources/datadriven/Cities.txt"));

	            // Leer una linea del archivo
	            String line = readbuffer.readLine();

	            while (line != null) {
	                // Sepapar la linea leída con el separador definido previamente
	                fields = line.split(SEPARATOR);

	                System.out.println(Arrays.toString(fields));

	                // Volver a leer otra línea del fichero
	                line = readbuffer.readLine();
	            }
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        finally {
	            // Cierro el buffer de lectura
	            if (readbuffer != null) {
	                try {
	                    readbuffer.close();
	                }
	                catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return fields;

	    }

	


}
