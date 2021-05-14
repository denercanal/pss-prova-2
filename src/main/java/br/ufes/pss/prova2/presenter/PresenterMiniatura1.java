package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.proxy.ImagemProxy;
import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;

public class PresenterMiniatura1 {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura1(ViewUltimasImagens viewUltimasImagens) {
        this.viewUltimasImagens = viewUltimasImagens;
        this.miniatura1();
    }

    private void miniatura1() {
        viewUltimasImagens.getMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new ImagemProxy("1_DOCKER.jpg", "https://blog.geekhunter.com.br/wp-content/uploads/2019/06/docker-na-pratica-como-construir-uma-aplicacao-2-1280x720.png").exibir();
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
                viewUltimasImagens.getMiniatura1().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura1().setBorder(null);
            }
        });
    }
}
