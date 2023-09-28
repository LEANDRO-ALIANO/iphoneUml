package iphone.interfaces;

import iphone.classes.Contato;


public interface FazerChamadas {
public void ligar(Contato contato);
public void encerrar();
public  Contato selecionarContato(Contato contato); 
public void verificaRede();

}
