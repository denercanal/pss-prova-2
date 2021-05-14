package br.ufes.pss.prova2;

import br.ufes.pss.prova2.presenter.PresenterUltimasImagens;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        PresenterUltimasImagens.getInstance();
        ArrayList<ImagemProxy> imagens = new ArrayList<>();

        imagens.add(new ImagemProxy("1_DOCKER.png", "https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png"));
        TimeUnit.SECONDS.sleep(1);
        imagens.add(new ImagemProxy("2_AWS.png", "https://a0.awsstatic.com/libra-css/images/logos/aws_logo_smile_1200x630.png"));
        TimeUnit.SECONDS.sleep(1);
        imagens.add(new ImagemProxy("3_DEVOPS.png", "https://img.mandic.com.br/blog/2018/02/devops-process.png"));
        TimeUnit.SECONDS.sleep(1);
        imagens.add(new ImagemProxy("4_LINUX.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Tux.svg/1200px-Tux.svg.png"));
        TimeUnit.SECONDS.sleep(1);
        imagens.add(new ImagemProxy("5_JAVA.jpg", "https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg"));
        TimeUnit.SECONDS.sleep(1);

        imagens.get(0).exibir();
        TimeUnit.SECONDS.sleep(1);
        imagens.get(1).exibir();
        TimeUnit.SECONDS.sleep(1);
        imagens.get(0).exibir();
        TimeUnit.SECONDS.sleep(1);
        imagens.get(2).exibir();
        TimeUnit.SECONDS.sleep(1);
        imagens.get(1).exibir();
        TimeUnit.SECONDS.sleep(1);
    }
}
