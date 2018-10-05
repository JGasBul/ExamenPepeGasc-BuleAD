package model;
import java.io.Serializable;

import view.Libreria;

public class Libro implements Serializable{
	private int a�o_publi,n_pg;
	private String id,titulo,autor,editor;
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String id, int a�o_publi, int n_pg, String titulo, String autor, String editor) {
		this.id = id;
		this.a�o_publi = a�o_publi;
		this.n_pg = n_pg;
		this.titulo = titulo;
		this.autor = autor;
		this.editor = editor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getA�o_publi() {
		return a�o_publi;
	}
	public void setA�o_publi(int a�o_publi) {
		this.a�o_publi = a�o_publi;
	}
	public int getN_pg() {
		return n_pg;
	}
	public void setN_pg(int n_pg) {
		this.n_pg = n_pg;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public void print() {
		Libreria lib=new Libreria();

		System.out.println("******************************************************************");
		System.out.println("Identificador: "+this.id);
		System.out.println("T�tulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("A�o de publicaci�n: "+this.a�o_publi);
		System.out.println("Editor: "+this.editor);
		System.out.println("Numero de p�ginas: "+this.n_pg);
		System.out.println("******************************************************************");
	}




}
