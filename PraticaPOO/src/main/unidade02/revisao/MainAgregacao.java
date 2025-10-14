package unidade02.revisao;

public class MainAgregacao {

	public static void main(String[] args) {
		Musica musica1 = new Musica();
		musica1.setNome("Teste");

		Playlist playlist = new Playlist();
		playlist.adicionarMusica(musica1);
	}
}
