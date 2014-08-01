package Cartao;

import java.util.Random;

//import Usuarios.Cliente;
import Usuarios.Loja;

public class Cartao  {
	

	public Cartao() {
		this.pontos = 10; //colocado para testar função.
		//consuta ao banco apartir do cliente logado para trazer as informaçãoes.
	}

	public int pontos  ;
    protected int Codigo;
    protected Loja loajaassociada;
    
	
   public int getCodigo() {
	return Codigo;
}

   public void setCodigo(int codigo) {
	Codigo = codigo;
}

   public int getPontos() {
		return pontos;
	}

   public  void setPontos(int pontos) {
		this.pontos = 10;
	}
	
   public void zerarpontoseresgatar (){
		//int pontuacao = pontos;
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(10000);
		if ( this.pontos == 10) {
			this.pontos =0 ;
			this.Codigo = aleatorio; 
			System.out.println("resgate efetuado com sucesso o numero do resgate é" + Codigo);
		}
		else {
			System.out.println("Não foi possivel fazer o resgate " );
		}
	}
	}


	             