package Usuarios;

import java.util.Scanner;

public class Loja extends Usuario {

	private int cnpj;

	
	public Loja(Long id, String nome, String senha, String email,
	            String endereco, String tipo, int matricula) {
		super(id, nome, senha, email, endereco, tipo);
		ler = new Scanner(System.in);
		System.out.printf ("Digite o CNPJ");
		this.cnpj = ler.nextInt();
		this.tipo = "Loja";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public void ConsultaCartao(){
		
	}

	public void AdcionarPontos(){
	
	}	
}

