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
		int num;
		if(votacao.containsKey(nome)) {
			num = votacao.get(nome);
			votacao.put(nome, valor + num);
		}
		else 
			votacao.put(nome, valor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(String key : votacao.keySet()) {
			sb.append(key + ": " + votacao.get(key) + "\n");
		}
		return sb.toString();
	}
	
	
}
