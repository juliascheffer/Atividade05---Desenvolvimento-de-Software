package at.cinco.dominio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
	
	private static List<Item> listaDePratos;
	private static List<Item> listaDeBebidas;
	private static List<Item> listaDeVinhos;
	
	private static String arquivoPratos = "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\pratos.txt";
	private static String arquivoBebidas = "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\bebidas-tabuladas.txt";
	private static String arquivoVinhos = "C:\\Users\\Luiz\\Documents\\Família Documentos\\Julia\\_ws\\Atividade05\\arquivosatcinco\\vinhos-tabulados.txt";
			
	//Listar itens
	private static List<Item> carregarListaDePratos() {
		
		List<Item> itensPratos = new ArrayList<>();
		try {
			File arquivo = new File(arquivoPratos);
			Scanner leitor = new Scanner(new FileInputStream(arquivoPratos), "UTF-8");
			leitor.nextLine();
			
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] partes = linha.split(";");
				Item item = new Item(partes[0], partes[1]);
				itensPratos.add(item);
			}
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro na leitura do arquivo!");
			e.printStackTrace();
		}
		
		return itensPratos;	
		}

	private static List<Item> carregarListaDeBebidas() {
		
		List<Item> itensBebidas = new ArrayList<>();
		
		try {
			File arquivo = new File(arquivoBebidas);
			Scanner leitor = new Scanner(new FileInputStream(arquivoBebidas), "UTF-8");
			leitor.nextLine();
			
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] partes = linha.split(";");
				Item item = new Item(partes[0], partes[1]);
				itensBebidas.add(item);
			}
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro na leitura do arquivo!");
			e.printStackTrace();
		}
	return itensBebidas;
	}
	
	public static List<Item> carregarListaDeVinhos() {
	
		List<Item> itensVinhos = new ArrayList<>();
	
		try {
		File arquivo = new File(arquivoVinhos);
		Scanner leitor = new Scanner(new FileInputStream(arquivoVinhos), "UTF-8");
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] partes = linha.split(";");
			Item item = new Item(partes[0], partes[1]);
			itensVinhos.add(item);
		}
		leitor.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("Erro na leitura do arquivo!");
		e.printStackTrace();
	}
	return itensVinhos;
	}
	
	//Incluir itens
	public static void addPrato(Item item) {
		listaDePratos.add(item);
		incluirPrato(item);
	}
	
	private static void incluirPrato(Item item) {
		try {
			FileWriter arquivo = new FileWriter(arquivoPratos, true);
			PrintWriter gravador = new PrintWriter(arquivoPratos);
			gravador.println(item);
			gravador.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println("Erro na gravação do arquivo!");
			e.printStackTrace();
		}
	}
	
	public static void addBebida(Item item) {
		listaDeBebidas.add(item);
		incluirBebida(item);
	}
	
		private static void incluirBebida(Item item) {
			try {
				FileWriter arquivo = new FileWriter(arquivoBebidas, true);
				PrintWriter gravador = new PrintWriter(arquivoBebidas);
				gravador.println(item);
				gravador.close();
				arquivo.close();
				
			} catch (IOException e) {
				System.out.println("Erro na gravação do arquivo!");
				e.printStackTrace();
			}	
		}
		
		public static void addVinho(Item item) {
			listaDeVinhos.add(item);
			incluirVinho(item);
		}
		
		private static void incluirVinho(Item item) {
			try {
				FileWriter arquivo = new FileWriter(arquivoVinhos, true);
				PrintWriter gravador = new PrintWriter(arquivoVinhos);
				gravador.println(item);
				gravador.close();
				arquivo.close();
				
			} catch (IOException e) {
				System.out.println("Erro na gravação do arquivo!");
				e.printStackTrace();
			}
		 }
		
		//Excluir itens e atualizar listas
		public static void excluirPrato(Item item) {
			listaDePratos.remove(item);
			gravarListaAtualizadaPratos(listaDePratos);
		}
		private static void gravarListaAtualizadaPratos(List<Item> listaDeItem1) {
			try {
				FileWriter arquivo = new FileWriter(arquivoPratos, true);
				PrintWriter gravador = new PrintWriter(arquivoPratos);
				for (Item item : listaDePratos) {
					gravador.println(item);
						
					}
				gravador.close();
				arquivo.close();
				
			} catch (IOException e) {
				System.out.println("Erro na gravação do arquivo!");
				e.printStackTrace();
			}
		}
		
		public static void excluirBebida(Item item) {
			listaDeBebidas.remove(item);
			gravarListaAtualizadaBebidas(listaDeBebidas);
		}
		private static void gravarListaAtualizadaBebidas(List<Item> listaDeItem2) {
			try {
				FileWriter arquivo = new FileWriter(arquivoBebidas, true);
				PrintWriter gravador = new PrintWriter(arquivoBebidas);
				for (Item item : listaDeBebidas) {
					gravador.println(item);
						
					}
				gravador.close();
				arquivo.close();
				
			} catch (IOException e) {
				System.out.println("Erro na gravação do arquivo!");
				e.printStackTrace();
			}
		}
		
		public static void excluirVinho(Item item) {
			listaDePratos.remove(item);
			gravarListaAtualizadaVinhos(listaDePratos);
		}
		private static void gravarListaAtualizadaVinhos(List<Item> listaDeItem3) {
			try {
				FileWriter arquivo = new FileWriter(arquivoVinhos, true);
				PrintWriter gravador = new PrintWriter(arquivoVinhos);
				for (Item item : listaDeVinhos) {
					gravador.println(item);
						
					}
				gravador.close();
				arquivo.close();
				
			} catch (IOException e) {
				System.out.println("Erro na gravação do arquivo!");
				e.printStackTrace();
			}
		}
		
		//Buscar por nome
		public static Item buscarPorNomePratos(String query) {
			Item pratoRetornado = null;
			
			for (Item item : listaDePratos) {
				if (item.getNome().contains(query)){
					pratoRetornado = item;
					break;
				}
			}
			
			return pratoRetornado;
		}
		
		public static Item buscarPorNomeBebidas(String query) {
			Item bebidaRetornada = null;
			
			for (Item item : listaDeBebidas) {
				if (item.getNome().contains(query)){
					bebidaRetornada = item;
					break;
				}
			}
			
			return bebidaRetornada;
		}
		
		public static Item buscarPorNomeVinhos(String query) {
			Item vinhoRetornado = null;
			
			for (Item item : listaDePratos) {
				if (item.getNome().contains(query)){
					vinhoRetornado = item;
					break;
				}
			}
			
			return vinhoRetornado;
		}


}	
	
	
	
	
	
	
	
	
	