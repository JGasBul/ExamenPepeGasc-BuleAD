package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import model.*;
import view.*;

public class GestionEventos {

	private GestionDatos model;
	private LaunchView view;
	private Libreria lib;
	private Ejercicio1 ej1;
	private Ejercicio2 ej2;
	private ActionListener actionListener_comparar, actionListener_buscar,actionListener_LibrosInterfaz,actionListener_enviar;
	private ActionListener actionListener_recoger;
	private ActionListener actionListener_recogerTodos;
	private ActionListener actionListener_enviarID;
	private ActionListener actionListener_EJ1;
	private ActionListener actionListener_recogerEJ1;
	private ActionListener actionListener_Ej2;



	public GestionEventos(GestionDatos model, LaunchView view, Libreria l, Ejercicio1 ej1, Ejercicio2 ej2) {
		this.model = model;
		this.view = view;
		this.lib = l;
		this.ej1=ej1;
		this.ej2=ej2;
	}

	public void contol() {
		actionListener_comparar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				call_compararContenido();
			}
		};
		view.getComparar().addActionListener(actionListener_comparar);

		actionListener_buscar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				call_buscarPalabra();
			}
		};
		view.getBuscar().addActionListener(actionListener_buscar);
		actionListener_LibrosInterfaz=new ActionListener() {

			public void actionPerformed(ActionEvent actionEvent) {
				call_Libreria();
			}
		};
		view.getBtnLibros().addActionListener(actionListener_LibrosInterfaz);
		actionListener_EJ1=new ActionListener() {

			public void actionPerformed(ActionEvent actionEvent) {
				call_EJ1();
			}
		};
		view.getBtnEj1().addActionListener(actionListener_EJ1);
		actionListener_enviarID=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				call_EnviarID();
			}

		};
		lib.getBtnEnviar().addActionListener(actionListener_enviarID);

		actionListener_recoger=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				call_Recoger();
			}

		};
		lib.getBtnIDR().addActionListener(actionListener_recoger);
		actionListener_recogerEJ1=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				call_RecogerAño();
			}

		};
		ej1.getBtnIDR().addActionListener(actionListener_recogerEJ1);

		actionListener_recogerTodos=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				call_RecogerTodos();
			}

		};
		lib.getBtnIDR().addActionListener(actionListener_recogerTodos);

		actionListener_Ej2=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		};
		lib.getBtnIDR().addActionListener(actionListener_Ej2);



	}



	private void call_Ej2() throws NumberFormatException, IOException {
		if(model.buscar_longitud(ej2.getTextFichero().getText(), Integer.parseInt(ej2.getTextLongitud().getText()))) {

		}

	}

	private void call_compararContenido() {
		try {
			if (model.compararContenido(view.getFichero1().getText(), view.getFichero2().getText())) {
				view.getTextArea().setText("Los archivos son iguales");
			}else {
				view.getTextArea().setText("Los archivos son diferentes");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			view.showError("No existe el fichero");
		}
	}

	private void call_buscarPalabra() {
		try {
			int result=model.buscarPalabra(view.getFichero1().getText(), view.getPalabra().getText(),view.getPrimera().isSelected());
			if(result!=-1) {
				if(view.getPrimera().isSelected()) {
					view.getTextArea().setText("La palabra `"+view.getPalabra().getText()+"´ aparece por primera vez en la linea "+result );
				}else {
					view.getTextArea().setText("La palabra `"+view.getPalabra().getText()+"´ aparece por ultima vez en la linea "+result );
				}
			}else {
				view.getTextArea().setText("No existe la palabra `"+view.getPalabra().getText()+"´ en el archivo "+view.getFichero1().getText());
			}
		} catch (IOException e) {
			view.showError("Va mal");
		}


	}
	private void call_Libreria() {
		lib.setVisible(true);
	}
	private void call_EJ1() {
		ej1.setVisible(true);
	}
	private void call_EnviarID() {
		if(model.enviar(lib)) {
			lib.getTextResult().setText("Libro guardado correctamente");
		}else {
			lib.getTextResult().setText("Error al guardar");
		} 
	}
	private void call_Recoger() {
		if(model.recuperar_libro(lib.getTextIDR().getText())!=null) {
			Libro l=model.recuperar_libro(lib.getTextIDR().getText());
			l.print();
		}

	}
	private void call_RecogerTodos() {


	}
	private void call_RecogerAño() {
		if(model.recuperar_año(Integer.parseInt(ej1.getTextIDR().getText()))==false) {
			System.out.println("No hay libros de ese año");
		}
	}


}

