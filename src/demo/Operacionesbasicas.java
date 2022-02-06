package demo;

import demo.damei.Cliente;

public class Operacionesbasicas {

	public static void main(String[] args) {

	Cliente cliente=new Cliente();
	
	cliente.setCedula("0305264856");
	cliente.setNombre("Marcus Lema");
	cliente.setDireccion("Av. de la Americas");
	cliente.setEmail("marcus.l@gmail.com");
	cliente.setFnacimiento("20/12/2001");
	
	System.out.println(cliente);
}	
	}
