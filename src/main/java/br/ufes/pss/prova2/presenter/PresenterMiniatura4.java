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

public final class PresenterMiniatura4 implements IImagemProxy {

    private final ViewUltimasImagens viewUltimasImagens;

    PresenterMiniatura4(ViewUltimasImagens viewUltimasImagens) throws IOException {
        this.viewUltimasImagens = viewUltimasImagens;
        viewUltimasImagens.getMiniatura4().setIcon(ImagemDownload.downloadFromUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Tux.svg/1200px-Tux.svg.png", 150, 150));
        exibirToString();
        this.miniatura4();
    }

    private void miniatura4() {
        viewUltimasImagens.getMiniatura4().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new ImagemProxy("4_LINUX.png", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/Tux.svg/1200px-Tux.svg.png").exibir();
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
                viewUltimasImagens.getMiniatura4().setBorder(new MetalBorders.Flush3DBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewUltimasImagens.getMiniatura4().setBorder(null);
            }
        });
    }

    @Override
    public ImageIcon exibir() {
        return null;
    }

    @Override
    public void exibirToString() {
        System.out.println("Exibindo miniatura da imagem: 4_LINUX.png");
    }
}
