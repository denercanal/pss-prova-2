package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

public class PresenterMiniatura2 {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura2(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;

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
}
