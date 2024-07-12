package modelos;

public class Musica extends Audio implements Info {

	public Musica (String nome ) {
		setTitulo(nome);
	}
	
	
	private String artista;
	private String album;
	private String genero;
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	@Override
	public int getClassificacoes() {
		 if (this.getTotalReproducoes() > 2000 ) {
	       
			 return 10;
			 
		} else if (this.getTotalReproducoes() > 1000) {
			return 6;
			
		} else {
			return 3;
		}
		 	
	}
	
	
	@Override
	public void Informacoes () {
		System.out.println("\nA música a ser tocado é: " + getTitulo().replace(".wav", ""));
	}
	
	
	
}
