package br.com.ultilitarios.programa.file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;


public class File {
	
	File(){}

	//Abre um arquivo de texto e devolve uma String com o conteudo
	public static List<String> lerArquivo(String caminho) {
        List<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha.replaceAll("\\s+", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }
	

	
}
