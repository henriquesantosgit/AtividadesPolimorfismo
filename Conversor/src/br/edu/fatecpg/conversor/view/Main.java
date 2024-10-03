package br.edu.fatecpg.conversor.view;



import br.edu.fatecpg.conversor.model.Conversor;

public class Main {

	public static void main(String[] args) {
		Conversor con = new Conversor();
		
		
		System.out.println(con.converter(20.5));
		System.out.println(con.converter(200));
		System.out.println(con.converter("ola mundo"));

	}

}
