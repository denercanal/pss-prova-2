package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.interfaces.IImagemProxy;
import br.ufes.pss.prova2.proxy.ImagemDownload;
import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

public final class PresenterMiniatura2 implements IImagemProxy {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura2(ViewUltimasImagens viewUltimasImagens) throws IOException {
        this.viewUltimasImagens = viewUltimasImagens;
        viewUltimasImagens.getMiniatura2().setIcon(new ImagemDownload().downloadFromUrl("https://a0.awsstatic.com/libra-css/images/logos/aws_logo_smile_1200x630.png", 150, 150));
        exibirToString();
        this.miniatura2();
    }

    private void miniatura2() {
        viewUltimasImagens.getMiniatura2().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new ImagemProxy("2_AWS.png", "https://a0.awsstatic.com/libra-css/images/logos/aws_logo_smile_1200x630.png").exibir();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(viewUltimasImagens, "Imagem não encontrada!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewUltimasImagens.getMiniatura2().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura2().setBorder(null);
            }
        });
    }

    @Override
    public ImageIcon exibir() {
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: 2_AWS.png");
    }
}
