package br.ufes.pss.prova2;

import br.ufes.pss.prova2.presenter.PresenterUltimasImagens;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {
        PresenterUltimasImagens.getInstance();

        ArrayList<ImagemProxy> imagens = new ArrayList<>();

        imagens.add(new ImagemProxy(PresenterUltimasImagens.getInstance().getViewUltimasImagens(), "1_DOCKER.jpg", "https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png"));
        imagens.add(new ImagemProxy(PresenterUltimasImagens.getInstance().getViewUltimasImagens(), "2_AWS.png", "https://a0.awsstatic.com/libra-css/images/logos/aws_logo_smile_1200x630.png"));
        imagens.add(new ImagemProxy(PresenterUltimasImagens.getInstance().getViewUltimasImagens(), "3_DEVOPS.png", "https://img.mandic.com.br/blog/2018/02/devops-process.png"));
        imagens.add(new ImagemProxy(PresenterUltimasImagens.getInstance().getViewUltimasImagens(), "4_LINUX.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Tux.svg/1200px-Tux.svg.png"));
        imagens.add(new ImagemProxy(PresenterUltimasImagens.getInstance().getViewUltimasImagens(), "5_JAVA.jpg", "https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg"));

        imagens.get(0).exibir();
        imagens.get(1).exibir();
        imagens.get(0).exibir();
        imagens.get(2).exibir();
        imagens.get(1).exibir();
    }
}
