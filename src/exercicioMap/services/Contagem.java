package exercicioMap.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Contagem {
	Map<String, Integer> votacao = new TreeMap<>();
	
	public void acessarArquivo(String str) {
		File path = new File(str);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String part[] = line.split(",");
				contagem(part[0], Integer.parseInt(part[1]));
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void contagem(String nome, Integer valor) {
		votacao.put(nome, valor);
	}
	
}
