package main;


import javax.swing.JOptionPane;

import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class App {

	public static void main(String[] args) {
		
		//Esse projeto atualmente só aceita arquivos de audio em ".wav", 
		
		Podcast meuPodcast = new Podcast("Nome do PODCAST.wav", "Nome do apresentador");    
		Musica musica1 = new Musica("Nome da musica.wav");
		
		MinhasPreferidas Fav = new MinhasPreferidas();
		
		
		//Teste simples para verificar o funcionamento dos favoritos e seu retorno.
		for (int i = 0 ; i < 2500; i++) {
			musica1.reproduz();
			meuPodcast.Like();;
		}
		
		
		Fav.inclui(musica1);
		
		Fav.inclui(meuPodcast);
		 
		
		meuPodcast.Informacoes();
		musica1.Informacoes();
		
		// Algoritmo padrão para o funcionamento normal do Audio player.
		String localDoArquivo = musica1.getTitulo();
		musica1.reprodutor(localDoArquivo);
		JOptionPane.showMessageDialog(null, "Pressione OK para fechar o reprodutor");
		
		
	}
	
	
}
