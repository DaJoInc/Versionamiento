package com.ownk.TextGenerator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class ArchivoUtils {
	
	public File obtenerArchivo(String ruta, String nombre) {
		File txt = null;
		 try {
			 
			 String path= ruta + "/" +nombre;
			 txt = new File (path);
			 
		} catch (Exception e) {
			System.out.println("CLV");
		}
		return txt;
	}
	
	public String leerArchivo(File archivo) {
			String texto="";
			String textoSiguiente="";
		try {
			FileReader abrirRuta = new FileReader (archivo);
			BufferedReader textoInterior = new BufferedReader(abrirRuta);
			while((texto=textoInterior.readLine())!=null)
			{
				textoSiguiente=textoSiguiente+texto;
			}
			
		} catch (Exception e) {
			System.out.println("Error al leer: "+ e);
		}
		return textoSiguiente;
	}
		
	public Boolean crearArchivo(String datosArchivo, String nombre, String ruta) {
	
		Boolean exito = false;
	
		try {
			File archivo = new File(ruta +"/"+ nombre);
			FileWriter escribir = new FileWriter(archivo,true);
			escribir.write(datosArchivo);
			escribir.close(); 
		} 
		
		catch (Exception e) {
			{
				System.out.println("Error al escribir : " + e);
			}
		}
		
		return exito;
	}
}
