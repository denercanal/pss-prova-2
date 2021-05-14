package br.ufes.pss.prova2.model;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.presenter.PresenterUltimasImagens;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imagem implements IImagemProxy {

    private final String nomeImagem;
    private final String url;
    private ImageIcon imagemHD;

    public String getNomeImagem() {
        return nomeImagem;
    }

    public Imagem(String nomeImagem, String url) throws IOException {
        this.nomeImagem = nomeImagem;
        this.url = url;
        this.carregarImagem(this.url);
    }

    private void carregarImagem(String url) throws IOException {
        this.imagemHD = new ImagemDownload().downloadFromUrl(url, 717, 650);
    }

    @Override
    public void exibir() {
        exibirToString();
        try {
            PresenterUltimasImagens.getInstance().getViewUltimasImagens().getImagemHD().setIcon(imagemHD);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Imagem não encontrada!");
        }
    }

    @Override
    public void exibirToString() {
        System.out.println("Carregando imagem: " + this.nomeImagem);
        System.out.println("Exibindo imagem: " + this.nomeImagem);
    }
}
