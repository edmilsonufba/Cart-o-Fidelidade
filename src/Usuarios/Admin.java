package Usuarios;

import java.util.Scanner;

public class Admin extends Usuario {
	
	private int matricula;
	

	public Admin(Long id, String nome, String senha, String email,
			      String endereco, String tipo, int matricula) {
		super(id, nome, senha, email, endereco, tipo);
		ler = new Scanner(System.in);
		System.out.printf ("Digite a matricula");
		this.matricula = ler.nextInt();
		this.tipo = "Admin";
    }
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
}
