package br.ufes.pss.prova2.proxy;

import br.ufes.pss.prova2.model.Imagem;
import java.util.ArrayList;

public class ImagemCache {

    private static ImagemCache instancia;
    private final ArrayList<Imagem> imagensCache;

    private ImagemCache() {
        this.imagensCache = new ArrayList();
    }

    public static ImagemCache getInstancia() {
        if (instancia == null) {
            instancia = new ImagemCache();
        }
        return instancia;
    }

    public Imagem getImagem(String nome, String url) {
        int i = 0;
        for (Imagem imagem : this.imagensCache) {
            if (imagem.getNomeImagem().equals(nome)) {
                return imagem;
            }
            i++;
        }
        if (this.imagensCache.size() >= i) {
            this.imagensCache.add(new Imagem(nome, url));
            return this.imagensCache.get(this.imagensCache.size() - 1);
        }
        return null;
    }
}
