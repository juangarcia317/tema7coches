package tema7coches.main;

import java.util.List;

import org.w3c.dom.Document;
import tema7coches.model.Coche;
import tema7coches.util.Utilidades;

public class CocheTest {
	final static String RUTA_FICH = "src\\main\\resorces\\";
	public static void main(String[] args) {
		List<Coche> listaCoches = Utilidades.fromFich2Json( RUTA_FICH+"coches.json",Coche[].class);
		// TODO 
		//1-leer el archivo json y montar una lista de objetos coche utilizando Utilidades.fromFich2Json
		//2-mostrar lista por consola
		//3-Pasamos lista de Coches a XML con DocumentBuilder y DocumentBuilderFactory		 
        Document docListaCoches = fromCochesToXML(listaCoches  );		
		//4-mostrar xml por consola
		//5-generar en src/main/resources xml de salida llamado cochesOut.xml con el método de Utilidades

	}
	private static Document fromCochesToXML(List<Coche> listaCoches) {
		// TODO Auto-generated method stub
		return null;
	}

}
