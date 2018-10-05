package dir;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		File file=new File("h1");
		File file2=new File("h2");
		comparar(file,file2);
	}


	public static void localizar(){

	}

	public static void comparar(File file, File file2){
		boolean temp=false;
		if ((file.exists() && file.canRead()) && (file2.exists() && file2.canRead())) {
			temp=true;
		}
		if(temp) {
			if(file.isDirectory() && file2.isDirectory()) {
				int archivos1;
				int archivos2;
				String[] fileA = file.list();
				archivos1=fileA.length;
				String[] fileB=file2.list();
				archivos2=fileB.length;
				if(archivos1==archivos2) {
					System.out.println("Las dos carpetas tienen el mismo numero de archivos: "+archivos1);
				}else {
					System.out.println("Las dos carpetas no tinene el mismo numero de archivos.\nLa primera tiene "+archivos1+" y la segunda tiene "+archivos2);
				}
			}else {
				System.out.println("Alguna ruta proporcionada no es una carpeta");
			}
		}
		else {
			System.out.println("Una de las rutas esta mal escrita o no existe");
		}


	}
}