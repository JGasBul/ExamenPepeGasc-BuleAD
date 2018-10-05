package principal;

import javax.swing.JFrame;

import model.*;
import view.*;
import controller.*;

public class Principal {

	public static void main(String[] args) {		

		GestionDatos model = new GestionDatos();

		LaunchView view = new LaunchView();
		Libreria l = new Libreria();
		Ejercicio1 ej1=new Ejercicio1();
		Ejercicio2 ej2=new Ejercicio2();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);

		GestionEventos controller = new GestionEventos(model,view,l,ej1,ej2);
		controller.contol();

	}

}
