package br.ufes.pss.prova2.proxy;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ImagemDownload {

    public static ImageIcon downloadFromUrl(String url, int altura, int largura) {

        try {

            URL imagemUrl = new URL(url);

            BufferedImage image;
            try (InputStream in = imagemUrl.openStream()) {
                image = ImageIO.read(in);
                ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(altura, largura, Image.SCALE_DEFAULT));
                in.close();
                return imageIcon;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
