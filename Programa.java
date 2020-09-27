package at.cinco.sistema;

import java.util.List;

import at.cinco.dominio.Cardapio;
import at.cinco.dominio.Item;
import at.cinco.dominio.Arquivo;

// Fazer um CRUD:
// Create;
// Retrieve;
// Update;
// Delete; 
// Listar, incluir opções de pratos, bebidas e vinhos no cardapio da at4

public class Programa {
	public static void main (String[] args) {
		
		// C -> Incluir
	//	Item item = new Item(" ", 50.5);
	//	Cardapio.incluirPrato(" ");
	//	Cardapio.incluirBebida(" ");
	//	Cardapio.incluirVinho(" "); 
		
		// R -> Listar
	//	String query = " ";
	//	Item itemEncontrado = Cardapio.buscarPratoPorNome(item);
	//	System.out.println("Item encontrado: " + itemEnocntrado);
		
		//U -> Atualizar
	//	Cardapio.atualizar();
		
		// D -> Excluir
	//	Cadastro.excluirItem(itemEncontrado);
		
		List<Item> lista = Cadastro.listarItens();
		System.out.println("--------------------");
		System.out.println("Tamanho da lista: " +lista.size());
		
		for (Item item : lista) {
			System.out.println(item.getNome() + ";" + " "  + item.getPreco());
		}
	}
}