package com.ownk.TextGenerator;

import java.io.File;

public class OrquestadorArchivo {

	public static void main(String[] args) {
		
		String aUno;
		File archivoUno=null;
		File archivoDos=null;
		
		String contenedorArchivoUno= null;
		String contenedorArchivoDos= null;
		String contenedorArchivoTres=null;
		
		
		ArchivoUtils archivoUtils = new ArchivoUtils();
		archivoUno= archivoUtils.obtenerArchivo("C:\\Users\\user\\Documents\\OwnkTxtProyect", "Txt1.txt");
		archivoDos= archivoUtils.obtenerArchivo("C:\\Users\\user\\Documents\\OwnkTxtProyect", "Txt2.txt");
		try {  
		contenedorArchivoUno= archivoUtils.leerArchivo(archivoUno);
		System.out.println(contenedorArchivoUno+ " 1 \n");
		contenedorArchivoDos= archivoUtils.leerArchivo(archivoDos);
		System.out.println(contenedorArchivoDos+ " 2 \n");
		contenedorArchivoTres= contenedorArchivoUno + contenedorArchivoDos;
		System.out.println(contenedorArchivoTres+ " 3 \n");
		
	
		archivoUtils.crearArchivo(contenedorArchivoTres, "txtCUCHOOO", "F:");
		}
		catch (Exception e) {
	// TODO: handle exception
}		
		
	}
}
