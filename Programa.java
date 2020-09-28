package at.cinco.sistema;

import java.util.List;

import at.cinco.dominio.Cardapio;

import at.cinco.dominio.Item;

// Fazer um CRUD:
// Create;
// Retrieve;
// Update;
// Delete; 
// Listar, incluir opções de pratos, bebidas e vinhos no cardapio da at4

public class Programa {
	public static void main (String[] args) {
		
		// C -> Incluir
		Item item = new Item(null, 0);
		
		Cardapio.incluirPrato(item);
		Cardapio.incluirBebida(item);
		Cardapio.incluirVinho(item);
		
		// R -> Listar
		String nome = ("Comida");
		Item itemRetornado1 = Cardapio.buscarPorNomePratos(nome);
		System.out.println("Prato encontrado: " + itemRetornado1);
		
		Item itemRetornado2 = Cardapio.buscarPorNomeBebidas(nome);
		System.out.println("Prato encontrado: " + itemRetornado2);
		
		Item itemRetornado3 = Cardapio.buscarPorNomeVinhos(nome);
		System.out.println("Prato encontrado: " + itemRetornado3);
		
		//U -> Atualizar
	//	Item itemAtualizado = new Item("Comida", 50.5);
		
		Cardapio.gravarListaAtualizadaPratos(null);
		Cardapio.gravarListaAtualizadaBebidas(null);
		Cardapio.gravarListaAtualizadaVinhos(null);
		
		// D -> Excluir	
		Cardapio.excluirPrato(item);
		Cardapio.excluirBebida(item);
		Cardapio.excluirVinho(item);
		
		List<Item> lista1 = Cardapio.carregarListaDePratos();
		System.out.println("--------------------");
		System.out.println("Tamanho da lista: " +lista1.size());
		
		for (Item itensPratos : lista1) {
			System.out.println(item.getNome() + ";" + " "  + item.getPreco());
		}
	
		List<Item> lista2 = Cardapio.carregarListaDeBebidas();
		System.out.println("--------------------");
		System.out.println("Tamanho da lista: " +lista2.size());

		for (Item itensBebidas : lista2) {
			System.out.println(item.getNome() + ";" + " "  + item.getPreco());
		}
	
	
		List<Item> lista3 = Cardapio.carregarListaDeVinhos();
		System.out.println("--------------------");
		System.out.println("Tamanho da lista: " +lista3.size());

		for (Item itensVinhos : lista3) {
		System.out.println(item.getNome() + ";" + " "  + item.getPreco());
	
		}
	}
 }