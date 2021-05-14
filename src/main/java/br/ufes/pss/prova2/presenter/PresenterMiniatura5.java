package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

public class PresenterMiniatura5 {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura5(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;

        this.miniatura5();
    }

    private void miniatura5() {
        viewUltimasImagens.getMiniatura5().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new ImagemProxy("5_JAVA.jpg", "https://i1.wp.com/www.softsell.com.br/wp-content/uploads/2018/04/java_logo_640.jpg").exibir();
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
                viewUltimasImagens.getMiniatura5().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura5().setBorder(null);
            }
        });
    }
}
