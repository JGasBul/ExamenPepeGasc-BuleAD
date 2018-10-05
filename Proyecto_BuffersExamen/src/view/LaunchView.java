package view;

import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaunchView extends JFrame {

	private JButton comparar,buscar;
	private JTextArea textArea;
	private JTextField fichero1,fichero2,palabra;
	private JLabel label_f1,label_f2,label_pal;
	private JCheckBox primera;

	private JPanel panel;
	private JButton btnLibros;
	private JButton btnEj1;

	public LaunchView() {

		setBounds(200,200,1000,450);
		setTitle("Proyecto Buffers");	
		panel = new JPanel();

		comparar = new JButton("Comparar contenido");
		comparar.setPreferredSize(new Dimension(150, 26));
		buscar = new JButton("Buscar palabra");
		buscar.setPreferredSize(new Dimension(150, 26));

		fichero1 = new JTextField("",10);
		fichero2 = new JTextField("",10);
		palabra = new JTextField("",10);

		label_f1 = new JLabel("Fichero 1:");
		label_f2 = new JLabel("Fichero 2:");
		label_pal = new JLabel("Palabra:");

		primera = new JCheckBox("Primera aparici�n");

		textArea = new JTextArea(20, 80);
		textArea.setBounds(50,50,50,50);
		textArea.setEditable(false);		

		panel.add(comparar);
		panel.add(buscar);
		panel.add(label_f1);
		panel.add(fichero1);
		panel.add(label_f2);
		panel.add(fichero2);
		panel.add(label_pal);
		panel.add(palabra);
		panel.add(primera);
		panel.add(textArea);

		// A�adimos el JPanel al JFrame
		this.getContentPane().add(panel);		
		
		btnEj1 = new JButton("Paginas");
		panel.add(btnEj1);
		
				btnLibros = new JButton("Libros");
				
						panel.add(btnLibros);

	}	

	public JButton getComparar() {
		return comparar;
	}

	public void setComparar(JButton comparar) {
		this.comparar = comparar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JButton getBtnLibros() {
		return btnLibros;
	}

	public void setBtnLibros(JButton btnLibros) {
		this.btnLibros = btnLibros;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JTextField getFichero1() {
		return fichero1;
	}
	public JTextField getPalabra() {
		return palabra;
	}

	public void setFichero1(JTextField fichero1) {
		this.fichero1 = fichero1;
	}

	public JTextField getFichero2() {
		return fichero2;
	}

	public JCheckBox getPrimera() {
		return primera;
	}

	public void setFichero2(JTextField fichero2) {
		this.fichero2 = fichero2;
	}

	public JButton getBtnEj1() {
		return btnEj1;
	}

	public void setBtnEj1(JButton btnEj1) {
		this.btnEj1 = btnEj1;
	}

	public void showError(String m){
		JOptionPane.showMessageDialog(this.panel,
				m,
				"Error",
				JOptionPane.ERROR_MESSAGE);
	}


}
