package modelos;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Audio {
	
	private String titulo;
	private double duracao;
	private int totalReproducoes;
	private int curtidas;
	private int classificacoes;
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	public void setTotalReproducoes(int totalReproducoes) {
		this.totalReproducoes = totalReproducoes;
	}
	public int getCurtidas() {
		return curtidas;
	}
	
	public int getClassificacoes() {
		return classificacoes;
	}
	public void setClassificacoes(int classificacoes) {
		this.classificacoes = classificacoes;
	}
	
	
	public void Like() {
		this.curtidas++;
		 System.out.println("-------- Seu like foi salvo com sucesso. ---------");
		 System.out.println("         Total de likes: " + curtidas + "\n");
	}
	
	public void reproduz() {
		this.totalReproducoes++;
	}
	                  
	public void reprodutor(String localizacao) 
	{
		try
		{
			File localDoArquivo = new File (localizacao);
			
			if (localDoArquivo.exists()) {
				
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(localDoArquivo);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				
			   } else {
				   
				     System.err.println("\nNão foi possivel achar o arquivo.");
		      	 }
			
	         	} catch (IllegalArgumentException e ){
		  	
	         		 System.err.println("\nVerifique se a saida de audio esta bem configurada e funcionando!. ");
			     
			} catch (UnsupportedAudioFileException e) {
				
				System.err.println("\nEsse arquivo não é suportado pelo sistema. (Somente Arquivo .WAV é permitido.) ");
			
			} catch (LineUnavailableException e) {
			
				e.printStackTrace();
			
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
		
		
	}
	
	

}
