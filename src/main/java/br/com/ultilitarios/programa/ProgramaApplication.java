package br.com.ultilitarios.programa;

import java.util.List;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.ultilitarios.programa.file.File;

@SpringBootApplication
public class ProgramaApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(ProgramaApplication.class, args);
			
		String arquivo1 = "C:/dados/arquivo1.txt";
		String arquivo2 = "C:/dados/arquivo2.txt";
		
		List <String> retorno ;
		int totalduplicadaPorlinha = 0;
		
		retorno = File.lerArquivo(arquivo1);
     
		List<String> lista = retorno;
        Map<String, Integer> ocorrencia = new HashMap<>();
        int totalDuplicados = 0;

        for (String elemento : lista) {
            int count = ocorrencia.getOrDefault(elemento, 0);
            ocorrencia.put(elemento, count + 1);
            if (count == 1) {
                totalDuplicados++;
            }
        	
        }

        for (Map.Entry<String, Integer> entry : ocorrencia.entrySet()) {
            String elemento = entry.getKey();
            
            int quantidade = entry.getValue();
            if (quantidade > 1) {
            	totalduplicadaPorlinha = totalduplicadaPorlinha + quantidade ;
                System.out.println("Elemento \"" + elemento + "\" ocorre " + quantidade + " vezes.");
            }
        }

        System.out.println("Quantidade total de registros duplicados: " + totalDuplicados);
        System.out.println("Quantidade total de registros duplicados Por linha: " + totalduplicadaPorlinha );


        


	}

}
