package iphone.entidades;

import iphone.classes.Contato;
import iphone.classes.Musica;
import iphone.classes.Site;
import iphone.classes.Video;
import iphone.interfaces.FazerChamadas;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.Reprodutor;

public class Iphone implements FazerChamadas,NavegadorInternet,Reprodutor {

	@Override
	public void reproduzirMusica(String nomeDaMusica) {
		// TODO Auto-generated method stub
		System.out.println("tocando "+ nomeDaMusica);
	}

	@Override
	public void pausarMusica() {
		System.out.println("pausando Musica");
		
	}

	@Override
	public void selecionarMusica(Musica musicas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduzirVideo(String NomeDoVideo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausarVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarVideo(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarPagina(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exibirPagina(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fecharPagina(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina(Site site) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean verificarRede() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ligar(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encerrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato selecionarContato(Contato contato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verificaRede() {
		// TODO Auto-generated method stub
		
	}


}
