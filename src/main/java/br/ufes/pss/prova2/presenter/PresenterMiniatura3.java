package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

public class PresenterMiniatura3 {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura3(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;

        this.miniatura3();
    }

    private void miniatura3() {
        viewUltimasImagens.getMiniatura3().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new ImagemProxy("3_DEVOPS.png", "https://img.mandic.com.br/blog/2018/02/devops-process.png").exibir();
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
                viewUltimasImagens.getMiniatura3().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura3().setBorder(null);
            }
        });
    }
}
