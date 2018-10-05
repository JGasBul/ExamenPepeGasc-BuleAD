package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField TextIDR;
	private JButton btnIDR;
	
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblLibreria = new JLabel("Libreria");
		lblLibreria.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblSiQuiereMeter = new JLabel("Pulse el a\u00F1o que quiere comprobar y le saldran los resultados");

		TextIDR = new JTextField();
		TextIDR.setColumns(10);





		btnIDR = new JButton("Recoger por a\u00F1o");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(198)
										.addComponent(lblLibreria))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(93)
										.addComponent(lblSiQuiereMeter))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(193)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnIDR)
												.addComponent(TextIDR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(120, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGap(19)
						.addComponent(lblLibreria)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblSiQuiereMeter)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(TextIDR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnIDR)
						.addContainerGap(26, Short.MAX_VALUE))
				);
		contentPane.setLayout(gl_contentPane);
	}

	public JButton getBtnIDR() {
		return btnIDR;
	}
	public void setBtnIDR(JButton btnIDR) {
		this.btnIDR = btnIDR;
	}

	public JTextField getTextIDR() {
		return TextIDR;
	}
	public void setTextIDR(JTextField textIDR) {
		TextIDR = textIDR;
	}


}
