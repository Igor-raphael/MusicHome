package modelos;

public class MinhasPreferidas {

	public void inclui (Audio audio) {
		
		if (audio.getClassificacoes() > 8) {
			
			      if (audio instanceof Musica musica) {
				
			           System.out.println(musica.getTitulo().replace(".wav", "") + " É uma musica muito bem avaliada, estando no favoritos de todos");
			
			      } else {
			    	  
				       System.out.println(audio.getTitulo().replace(".wav", "") + " É considerado um sucesso absoluto, estando no favoritos de todos");
			   }
			
		} else {
			
			       if (audio instanceof Musica musica ) {
			       System.out.println( musica.getTitulo().replace(".wav", "") + "  É uma musica muito bem curtida. ");
			
		} else {
			
			     System.out.println( audio.getTitulo().replace(".wav", "") + "  É um Podcast muito bem curtida. ");
		 }
		
	 }
	

  }
	
}
