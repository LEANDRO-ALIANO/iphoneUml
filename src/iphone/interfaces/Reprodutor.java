package iphone.interfaces;

import iphone.classes.Musica;
import iphone.classes.Video;

public interface Reprodutor {
public void reproduzirMusica(String nomeDaMusica);
public void pausarMusica();
public void selecionarMusica(Musica musicas);


public void reproduzirVideo(String NomeDoVideo);
public void pausarVideo();
public void selecionarVideo(Video video);



}
