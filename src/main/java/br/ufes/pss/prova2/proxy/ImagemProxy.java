package br.ufes.pss.prova2.proxy;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.model.Imagem;
import javax.swing.ImageIcon;

public final class ImagemProxy implements IImagemProxy {

    private String nomeImagem;
    private String url;
    private Imagem imagem;

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public ImagemProxy(String nomeImagem, String url) {
        this.nomeImagem = nomeImagem;
        this.url = url;
    }

    @Override
    public ImageIcon exibir() {

        imagem = ImagemCache.getInstancia().getImagem(this.nomeImagem, this.url);

        if (imagem == null) {
            imagem = new Imagem(nomeImagem);
        }
        exibirToString();
        return imagem.exibir();

    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo imagem: " + nomeImagem);
    }
}
