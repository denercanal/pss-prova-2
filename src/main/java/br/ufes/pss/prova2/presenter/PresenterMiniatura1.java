package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.plaf.metal.MetalBorders;

public final class PresenterMiniatura1 implements IImagemProxy {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura1(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;
        viewUltimasImagens.getMiniatura1().setIcon(new ImagemDownload().downloadFromUrl("https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png", 150, 150));
        exibirToString();
        this.miniatura1();
    }

    private void miniatura1() {
        viewUltimasImagens.getMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                viewUltimasImagens.getImagemHD().setIcon(new ImagemProxy("1_DOCKER.png", "https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png").exibir());

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewUltimasImagens.getMiniatura1().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura1().setBorder(null);
            }
        });
    }

    @Override
    public ImageIcon exibir() {
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: 1_DOCKER.png");
    }
}
