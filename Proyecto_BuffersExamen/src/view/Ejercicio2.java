package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField TextFichero;
	private JButton btn;
	private JTextField textLongitud;
	private JTextArea textArea;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblLibreria = new JLabel("Libreria");
		lblLibreria.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblSiQuiereMeter = new JLabel("Ponga los datos e inicie");

		TextFichero = new JTextField();
		TextFichero.setColumns(10);





		btn = new JButton("Iniciar");

		textLongitud = new JTextField();
		textLongitud.setColumns(10);

		textArea = new JTextArea();
		textArea.setEditable(false);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(32)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btn)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(TextFichero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textLongitud, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblLibreria)
								.addComponent(lblSiQuiereMeter))
						.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
						.addGap(37))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(19)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblLibreria)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblSiQuiereMeter)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(TextFichero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(textLongitud, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btn)))
						.addContainerGap(28, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTextFichero() {
		return TextFichero;
	}

	public void setTextFichero(JTextField textFichero) {
		TextFichero = textFichero;
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

	public JTextField getTextLongitud() {
		return textLongitud;
	}

	public void setTextLongitud(JTextField textLongitud) {
		this.textLongitud = textLongitud;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	
	
	


}


