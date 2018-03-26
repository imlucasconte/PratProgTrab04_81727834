package Negocio;

import com.mysql.jdbc.StringUtils;

public class Pais<nome> {

	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	public Pais() {	
	}
	public Pais(int id,String nome, long populacao, double area) {
		super();
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	
	public Pais(String nome, long populacao, double area) {
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	//Get Set ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Get Set Nome
	public StringUtils getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Get Set Pop
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	//Get Set Area
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	//toString
	public String toString() {		
		return "ID: " + getId() + " Nome: "+getNome()+" Pop: "+getPopulacao()+" Area: "+getArea();
	}
	
	
}
