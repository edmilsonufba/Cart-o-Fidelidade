package Usuarios;

import java.util.Scanner;


public class Cliente extends Usuario {

	private Long cpf;
   
	
 	public Cliente(Long id, String nome, String senha, String email,
	                String endereco, String tipo, int matricula) {
			super(id, nome, senha, email, endereco, tipo);
			ler = new Scanner(System.in);
			System.out.printf ("Digite o CPF");
			this.cpf = (long) ler.nextInt();
			this.tipo = "Cliente";
	}
 
	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public void VizualizarCartao() {
	
	}
}

 


