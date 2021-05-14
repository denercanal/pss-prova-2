package br.ufes.pss.prova2.proxy;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.model.Imagem;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.io.IOException;
import java.util.ArrayList;

public final class ImagemProxy implements IImagemProxy {

    private String nomeImagem;
    private final String url;
    private final ArrayList<Imagem> imagens;
    private ViewUltimasImagens viewUltimasImagens;

    public void setNomeImagem(String nomeImagem) {
        this.nomeImagem = nomeImagem;
    }

    public ImagemProxy(String nomeImagem, String url) throws IOException {
        this.nomeImagem = nomeImagem;
        this.url = url;
        this.imagens = new ArrayList<>();
    }

    public ImagemProxy(ViewUltimasImagens viewUltimasImagens, String nomeImagem, String url) throws IOException {
        this.nomeImagem = nomeImagem;
        this.url = url;
        this.viewUltimasImagens = viewUltimasImagens;
        this.imagens = new ArrayList<>();
        exibirToString();
        this.setMiniaturas(this.viewUltimasImagens, this.nomeImagem);
    }

    private void setMiniaturas(ViewUltimasImagens viewUltimasImagens, String nomeImagem) throws IOException {

        switch (nomeImagem) {
            case "1_DOCKER.png":
                viewUltimasImagens.getMiniatura1().setIcon(new ImagemDownload().downloadFromUrl("https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png", 150, 150));
                break;
            case "2_AWS.png":
                viewUltimasImagens.getMiniatura2().setIcon(new ImagemDownload().downloadFromUrl("https://a0.awsstatic.com/libra-css/images/logos/aws_logo_smile_1200x630.png", 150, 150));
                break;
            case "3_DEVOPS.png":
                viewUltimasImagens.getMiniatura3().setIcon(new ImagemDownload().downloadFromUrl("https://img.mandic.com.br/blog/2018/02/devops-process.png", 150, 150));
                break;
            case "4_LINUX.png":
                viewUltimasImagens.getMiniatura4().setIcon(new ImagemDownload().downloadFromUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Tux.svg/1200px-Tux.svg.png", 150, 150));
                break;
            case "5_JAVA.jpg":
                viewUltimasImagens.getMiniatura5().setIcon(new ImagemDownload().downloadFromUrl("https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg", 150, 150));
                break;
        }
    }

    @Override
    public void exibir() {
        imagens.stream().filter(imagem -> (imagem.getNomeImagem().equals(this.nomeImagem))).forEachOrdered(imagem -> {
            exibirToString();
            imagem.exibir();
        });
        try {
            imagens.add(new Imagem(this.nomeImagem, this.url));
        } catch (IOException ex) {
        }
        imagens.get(imagens.size() - 1).exibir();

    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: " + this.nomeImagem);
    }
}
