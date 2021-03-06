package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.plaf.metal.MetalBorders;

public final class PresenterMiniatura3 implements IImagemProxy {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura3(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;
        viewUltimasImagens.getMiniatura3().setIcon(new ImagemDownload().downloadFromUrl("https://img.mandic.com.br/blog/2018/02/devops-process.png", 150, 150));
        exibirToString();
        this.miniatura3();
    }

    private void miniatura3() {
        viewUltimasImagens.getMiniatura3().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new ImagemProxy("3_DEVOPS.png", "https://img.mandic.com.br/blog/2018/02/devops-process.png").exibir();

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewUltimasImagens.getMiniatura3().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura3().setBorder(null);
            }
        });
    }

    @Override
    public ImageIcon exibir() {
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: 3_DEVOPS.png");
    }
}
