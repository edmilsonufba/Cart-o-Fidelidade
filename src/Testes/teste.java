package Testes;




import java.util.Scanner;

import Usuarios.Admin;
import Usuarios.Cliente;
import Usuarios.Loja;

//import Usuarios.Usuario;

import BD.AdminDao;
import BD.ClienteDao;
import BD.LojaDao;
import Cartao.Cartao;
//import BD.UsuarioDao;

//import Usuarios.cadastra;
public class teste {

	private static  Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cartao novo_cartao = new Cartao();
	    //  adcionarUsuarios();
		 novo_cartao.zerarpontoseresgatar() ;
		}
	
	private static void adcionarUsuarios() {
		int escolha;
        entrada = new Scanner(System.in);
        
        System.out.print(" Digite 1 para Loja \n "
        		       + "Digite 2 para Administrador \n "
        		       + "Digite 3 para Cliente \n ---> ");
        escolha = entrada.nextLine().charAt(0);
        
        
        switch(escolha )
        {
            case '1':
            	
                System.out.println("Voc� est� adcionando uma Loja");
                Loja loja = new Loja(null, null, null, null, null, null, escolha);
             // grave nessa conex�o!!!
               LojaDao dao = new LojaDao();
             // m�todo elegante
                dao.adiciona(loja);
                break;
           case '2':
        	   System.out.println("Voc� est� adcionando um Administrador");
                Admin administrador= new Admin(null, null, null, null, null, null, escolha);
             // grave nessa conex�o!!!
               AdminDao dao1 = new AdminDao();
             // m�todo elegante
                dao1.adiciona(administrador);
               break;
            case '3':
            	 System.out.println("Voc� est�adcionando um cliente");
	                Cliente cliente = new  Cliente(null, null, null, null, null, null, escolha);
	             // grave nessa conex�o!!!
	               ClienteDao dao2 = new ClienteDao();
	             // m�todo elegante
	                dao2.adiciona(cliente);
	            break;
     
           default:
                System.out.println("Voc� n�o fez uma escolha Valida");        
            
        }
		
	}
	
	
}