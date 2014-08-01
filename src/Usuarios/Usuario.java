package Usuarios;

import java.util.Scanner;

import Autentica.Autenticavel;

public class Usuario implements Autenticavel  {
	
	private Long id;
    private String nome;
	private  String senha ;
	private String email;
	private String endereco;
	protected String tipo ; //encapsulamento po isso protected 
	protected Scanner ler;  // � utilizado para uso do scan
	
	// construtor de classe	
	public Usuario(Long id, String nome, String senha, String email,
			String endereco, String tipo) {
		super();
		ler = new Scanner(System.in);
		this.id = id;
		System.out.printf ("Digite o nome do Usuario");
		this.nome = ler.next();
		System.out.printf ("Digite a senha");
		this.senha = ler.next();
		System.out.printf ("Digite o email");
		this.email = ler.next();
		System.out.printf ("Digite o endere�o");
		this.endereco = ler.next();
		}
	
	// m�todos get e set para id, nome, email, endere�o 
	public String getNome() {
	return this.nome;
	}
	public void setNome(String nome) {
	 this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
	return this.email;
	}
	public void setEmail(String novo) {
	this.email = novo;
	}
	public String getEndereco() {
	return this.endereco;
	}
	public void setEndereco(String novo) {
	this.endereco = novo;
	}
	public Long getId() {
	return this.id;
	}
	public void setId(Long novo) {
	this.id = novo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	}


