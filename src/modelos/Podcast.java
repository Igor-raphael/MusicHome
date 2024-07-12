package modelos;

public class Podcast extends Audio implements Info {
	
	public Podcast( String nomePodcast, String apresentadorPodcast ) {
		setTitulo(nomePodcast);
		this.apresentador = apresentadorPodcast;
	}
	
	
	
	private String host;
	private String descricao;
	private String apresentador;
	
	
	public String getApresentador() {
		return apresentador;
	}
	
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public int getClassificacoes() {
		 if (this.getCurtidas() > 500 ) {
	       
			 return 10;
			 
		} else if (this.getCurtidas() > 250) {
			
			return 6;
			
		} else {
			
			return 3;
		}
		 	
	}
	
	@Override
	public void Informacoes () {
		System.out.println("\nO Podcast a ser tocado é: " + getTitulo().replace(".wav", "") + " com apresentação de: " + getApresentador());
	}
	
	

}
