package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// Exemplo para escrever em arquivo texto
		// FileWriter(path) cria/recria arquivo
		// FileWriter(path,true) cria/escreve o novo texto ao fim do arquivo
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
