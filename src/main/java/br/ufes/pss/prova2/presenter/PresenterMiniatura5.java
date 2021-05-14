package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.plaf.metal.MetalBorders;

public final class PresenterMiniatura5 implements IImagemProxy {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura5(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;
        viewUltimasImagens.getMiniatura5().setIcon(ImagemDownload.downloadFromUrl("https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg", 150, 150));
        exibirToString();
        this.miniatura5();
    }

    private void miniatura5() {
        viewUltimasImagens.getMiniatura5().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                new ImagemProxy("5_JAVA.jpg", "https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg").exibir();

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewUltimasImagens.getMiniatura5().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura5().setBorder(null);
            }
        });
    }

    @Override
    public ImageIcon exibir() {
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: 5_JAVA.jpg");
    }

}
