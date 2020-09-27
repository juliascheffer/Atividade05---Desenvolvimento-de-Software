package at.cinco.sistema;

import at.cinco.dominio.Arquivo;

import at.cinco.dominio.Item;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
	
	//listar itens
	public static List<Item> listarItens(Arquivo arquivo, Item item) {
		
		List<Item> itensPratos = new ArrayList<Item>();
		List<Item> itensBebidas = new ArrayList<Item>();
		List<Item> itensVinhos = new ArrayList<Item>();
		
		try {
			Scanner leitor = new Scanner(new FileInputStream(arquivo.getNome()), "UTF-8");
			leitor.nextLine();
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] partes = linha.split(";");
				Item itens = new Item(partes[0], partes[1]);
				itensPratos.add(itens);
			}
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Erro na leitura do arquivo!");
			e.printStackTrace();
		}
		
		return 
	}

	//Gravar item, esse eu sei que tá certo
		public static void gravarItem(Arquivo arquivo, Item item) {
			try {
				FileWriter file = new FileWriter(arquivo.getNome(), true);
				PrintWriter gravador = new PrintWriter(file);
				if (arquivo.isInvertido()) {
					gravador.println(item.getPreco() + arquivo.getSeparador() + item.getNome());
				}else {
					gravador.println(item.getNome() + arquivo.getSeparador() + item.getPreco());
				}
				gravador.close();
				file.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

		public static List<Item> listarItens(Arquivo arquivoPratos) {
			
			return null;
		}
		
		//excluir itens
//		public static void excluirItem(Arquivo arquivo, Item item) {
//			arquivo.getNome().remove(item);			
//		}
		
//		private static void gravarItensAtualizados(List<Item> itensAtualizados) {
//			for (Arquivo arquivo)
//			try {
//				FileWriter file = new FileWriter(arquivo.getNome(), true);
//				PrintWriter gravador = new PrintWriter(file);
//				if (arquivo.isInvertido()) {
//					gravador.println(item.getPreco() + arquivo.getSeparador() + item.getNome());
//				}else {
//					gravador.println(item.getNome() + arquivo.getSeparador() + item.getPreco());
//				}
//				gravador.close();
//				file.close();
//			}catch(IOException e){
//				e.printStackTrace();
//			}
			
//		}	
	
//	public static void atualizar(Item item) {
//		for (Item itemAtualizar : listaDePratos) {
//			if(itemAtualizar.getNome().equals(item.getNome())) {
//				itemAtualizar.setNome(item.getNome());
//				itemAtualizar.setPreco(item.getPreco());
//				break;
//			}
//		}
//		gravarListaAtualizada(listaDePratos);
//	}
	
}