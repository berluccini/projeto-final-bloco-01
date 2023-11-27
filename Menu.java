package adega_berluccini;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		int opcao =0 ,tipo,quantidade;
		String nome, produto;
		
		while (true) {
		
		System.out.println("                                                     ");
		System.out.println("                Adega Berluccini                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar produto                    ");
		System.out.println("            2 - Listar todas as bedidas              ");
		System.out.println("            3 - Buscar por produto                   ");
		System.out.println("            4 - Atualizar produtos                   ");
		System.out.println("            5 - Apagar produto                       ");
		System.out.println("            0 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		
		if (opcao == 0) 
			
			System.out.println("\n adega berluccini - venha matar sua cede!");
			
			
		switch (opcao) {
		
		
		case 1:
			System.out.println( "Adicionar Produto:\n\n");
			System.out.println("digite o nome do produro:");
			nome=leia.next();
			
		case 2:
			System.out.println( "Listar todos os produtos:\n\n");
				
		case 3:
			System.out.println( "Consultar por produto:\n\n");
			System.out.println("escolha o ptoduto:");
			produto=leia.next();
		case 4:
			System.out.println( "Atualizar dados dos produtos\n\n");

			
		case 5:
			System.out.println("Apagar produto\n\n");
			
			break;
			
			
		
		
		default:
			System.out.println( "\nOpção Inválida!\n" );

		}
		break;
		}
	}
	
public static void sobre() {

System.out.println("\n*********************************************************");
System.out.println("Projeto Desenvolvido por: Felipe Vieira");
System.out.println("Generation Brasil - generation@generation.org");
System.out.println("github.com/https://github.com/berluccini");
System.out.println("*********************************************************");

}

		
		}