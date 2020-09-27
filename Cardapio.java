package at.cinco.dominio;

import java.util.List;

import at.cinco.sistema.Cadastro;

public class Cardapio {
	
	private static List<Item> itensPratos;
	private static List<Item> itensBebidas;
	private static List<Item> itensVinhos;
	
	private static Arquivo arquivoPratos = new Arquivo "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\pratos.txt";
	private static Arquivo arquivoBebidas = new Arquivo "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\bebidas-tabuladas.txt";
	private static Arquivo arquivoVinhos = new Arquivo "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\vinhos-tabulados.txt";
	
	static {
		itensPratos = Cadastro.listarItens(arquivoPratos);
	    itensBebidas = Cadastro.listarItens(arquivoBebidas);
	    itensVinhos = Cadastro.listarItens(arquivoVinhos);
	}
	
	public static List<Item> listarPratos() {
		return itensPratos;
		
	}
	
	public static List<Item> listarBebidas() {
		return itensBebidas;
		
	}
	
	public static List<Item> listarVinhos() {
		return itensVinhos;
		
	}

	public static void incluirPrato(Item item) {
		itensPratos.add(item);
		Cadastro.gravarItem(arquivoPratos, item);
	}
	
	public static Item buscarPratoPorNome(String nome) {
		Item itemEncontrado = null;
		for (Item item : itensPratos) {
			if (item.getNome().contains(nome)) {
				itemEncontrado = item;
			}
		}
		return itemEncontrado;
	}
	
	public static boolean excluirPrato(Item item) {
		
		boolean excluiu = itensPratos.remove(item);
		if(excluiu) {
			Cadastro.excluirItem(arquivoPratos, itensPratos);
		}
		return excluiu;
	}	
	
	public static void incluirBebida(Item item) {
		itensPratos.add(item);
		Cadastro.gravarItem(arquivoBebidas, item);
	}
	
	public static Item buscarBebidaPorNome(String nome) {
		Item itemEncontrado = null;
		for (Item item : itensBebidas) {
			if (item.getNome().contains(nome)) {
				itemEncontrado = item;
			}
		}
		return itemEncontrado;
	}
	
	public static boolean excluirBebida(Item item) {
		
		boolean excluiu = itensBebidas.remove(item);
		if(excluiu) {
			Cadastro.excluirItem(arquivoBebidas, itensBebidas);
		}
		return excluiu;
	}	
	
	public static void incluirVinho(Item item) {
		itensVinhos.add(item);
		Cadastro.gravarItem(arquivoVinhos, item);
	}
	
	public static Item buscarVinhoPorNome(String nome) {
		Item itemEncontrado = null;
		for (Item item : itensVinhos) {
			if (item.getNome().contains(nome)) {
				itemEncontrado = item;
			}
		}
		return itemEncontrado;
	}
	
	public static boolean excluirVinho(Item item) {
		
		boolean excluiu = itensVinhos.remove(item);
		if(excluiu) {
			Cadastro.excluirItem(arquivoVinhos, itensVinhos);
		}
		return excluiu;
	}	
}