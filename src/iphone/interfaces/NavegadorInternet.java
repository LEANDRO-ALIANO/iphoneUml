package iphone.interfaces;

import iphone.classes.Site;

public interface NavegadorInternet {
	public  void adicionarPagina(Site site);
	public void exibirPagina(Site site);
	public void fecharPagina(Site site);
	public void atualizarPagina(Site site);
	public Boolean verificarRede();
}
