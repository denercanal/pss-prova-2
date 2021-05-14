package br.ufes.pss.prova2.model;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.presenter.PresenterUltimasImagens;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import javax.swing.ImageIcon;

public final class Imagem implements IImagemProxy {

    private String nomeImagem;
    private String url;
    private ImageIcon imagemHD;

    public Imagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
        this.url = null;
    }

    public String getNomeImagem() {
        return nomeImagem;
    }

    public Imagem(String nomeImagem, String url) {
        this.nomeImagem = nomeImagem;
        this.url = url;
        exibirToString();
        this.getImageFromUrl(url);
    }

    private void getImageFromUrl(String url) {
        this.imagemHD = ImagemDownload.downloadFromUrl(url, 717, 650);
    }

    @Override
    public ImageIcon exibir() {

        PresenterUltimasImagens.getInstance().getViewUltimasImagens().getImagemHD().setIcon(imagemHD);
        return imagemHD;

    }

    @Override
    public void exibirToString() {
        System.out.println("Carregando Imagem: " + nomeImagem);
    }
}
