package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import view.Ejercicio1;
import view.Libreria;

public class GestionDatos {
	public GestionDatos() {

	}

	//TODO: Implementa una funci�n para abrir ficheros

	//TODO: Implementa una funci�n para cerrar ficheros

	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la funci�n
		FileReader fr1=new FileReader(fichero1);
		BufferedReader br1=new BufferedReader(fr1);
		FileReader fr2=new FileReader(fichero2);
		BufferedReader br2=new BufferedReader(fr2);

		String Cadena1 = br1.readLine();
		String Cadena2=br2.readLine();
		boolean temp = true;

		while ((Cadena1!=null) || (Cadena2!=null) && temp) {

			if (Cadena1 == null || Cadena2== null || !Cadena1.equals(Cadena2))
				temp = false;

			Cadena1 = br1.readLine();
			Cadena2 = br2.readLine();
		} 
		fr1.close();
		fr2.close();
		br1.close();
		br2.close();


		return temp;
	}

	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion) throws IOException{
		//TODO: Implementa la funci�n
		FileReader fr1=new FileReader(fichero1);
		BufferedReader br1=new BufferedReader(fr1);

		String Cadena1 = br1.readLine();
		boolean encontrada = false;
		int cont=0;
		int linea=0;
		int result;
		if(primera_aparicion) {
			while ((Cadena1!=null) && encontrada==false) {
				cont++;
				if(Cadena1.compareTo(palabra)==0) {
					encontrada=true;
					linea=cont;
				}
				Cadena1=br1.readLine();
			}
			if(linea==0) {
				result=-1;
			}else {
				result=linea;
			}

		}
		else {
			while ((Cadena1!=null)) {
				cont++;
				if(Cadena1.compareTo(palabra)==0) {
					linea=cont;
				}
				Cadena1=br1.readLine();
			}
			if(linea==0) {
				result=-1;
			}else {
				result=linea;
			}

		}

		fr1.close();
		br1.close();



		return result;
	}
	public boolean enviar(Libreria lib) {
		String ID=lib.getTextID().getText();
		String Titulo=lib.getTextTitulo().getText();
		String Autor=lib.getTextAutor().getText();
		int A�o_publi=Integer.parseInt(lib.getTextA�o().getText().trim());
		String Editor=lib.getTextEditor().getText();
		int num_pg=Integer.parseInt(lib.getTextNumPg().getText().trim());

		Libro libro=new Libro(ID,A�o_publi,num_pg,Titulo,Autor,Editor);

		boolean fin=true;
		ObjectOutputStream out=null;
		try {
			out=new ObjectOutputStream(new FileOutputStream(libro.getId()+".dat"));
			out.writeObject(libro);
			out.close();
		} catch (IOException e) {
			fin=false;
		}
		return fin;

	}
	public Libro recuperar_libro(String identificador) {
		Libro l=null;
		ObjectInputStream in=null;
		try {
			in=new ObjectInputStream(new FileInputStream(identificador+".dat"));
			l=(Libro) in.readObject();
			in.close();
		} catch (IOException e) {
			l=null;
		} catch (ClassNotFoundException e) {
			l=null;
		}
		return l;
	}
	public void recuperar_todos(){
		File file=new File("libros");
		ArrayList<Libro> libros =new ArrayList<Libro>();



		Iterator it=libros.iterator();
		while(it.hasNext()) {
			Libro l=(Libro) it.next();
			l.print();
		}

	}
	public boolean recuperar_a�o(int a�o) {
		Ejercicio1 ej1=new Ejercicio1();
		boolean temp =true;
		Libro lib= new Libro();
		int x=0;
		ArrayList<Libro> libros =new ArrayList<Libro>();
		while(temp==true) {
			x++;
			try {
				lib=recuperar_libro(String.valueOf(x).trim());
				if(lib.getA�o_publi()==a�o) {
					libros.add(lib);
				}
			} catch (Exception e) {
				temp=false;
			}

		}
		boolean cantidad=true;
		Iterator it=libros.iterator();
		x=0;	
		while(it.hasNext()) {
			x++;
			lib=(Libro) it.next();
			System.out.println("El libro "+lib.getTitulo()+" es del a�o "+a�o);
		}
		if(x==0) {
			cantidad=false;
		}
		return cantidad;
	}

	public boolean buscar_longitud(String fichero1,int l) throws IOException {
		String fichero=fichero1+".txt";
		File file=new File(fichero);
		FileReader fr1=new FileReader(fichero);
		BufferedReader br1=new BufferedReader(fr1);

		int longitud = (int) file.length();
		String temp=br1.readLine();
		boolean result=true;
		if(longitud==l) {
			while(temp!=null) {
				System.out.println(temp);
				temp=br1.readLine();
			}
		}else {
			result=false;
		}
		return result;



	}
}
