package br.ufes.pss.prova2.model;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.presenter.PresenterUltimasImagens;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import java.io.IOException;
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

    public Imagem(String nomeImagem, String url) throws IOException {
        this.nomeImagem = nomeImagem;
        this.url = url;
        exibirToString();
        this.getImageFromUrl(url);
    }

    private void getImageFromUrl(String url) throws IOException {
        this.imagemHD = ImagemDownload.downloadFromUrl(url, 717, 650);
    }

    @Override
    public ImageIcon exibir() {
        try {
            PresenterUltimasImagens.getInstance().getViewUltimasImagens().getImagemHD().setIcon(imagemHD);
            return imagemHD;
        } catch (IOException ex) {
        }
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Carregando Imagem: " + nomeImagem);
    }
}
