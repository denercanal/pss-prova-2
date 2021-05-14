package br.ufes.pss.prova2.presenter;

import br.ufes.pss.prova2.view.ViewUltimasImagens;
import java.io.IOException;

public class PresenterUltimasImagens {

    private final ViewUltimasImagens viewUltimasImagens;
    private static PresenterUltimasImagens instance;

    public static PresenterUltimasImagens getInstance() throws IOException {
        if (instance == null) {
            instance = new PresenterUltimasImagens();
        }
        return instance;
    }

    public ViewUltimasImagens getViewUltimasImagens() {
        return viewUltimasImagens;
    }

    private PresenterUltimasImagens() throws IOException {
        this.viewUltimasImagens = new ViewUltimasImagens();
        this.viewUltimasImagens.setVisible(true);
        this.viewUltimasImagensMiniatura1();
        this.viewUltimasImagensMiniatura2();
        this.viewUltimasImagensMiniatura3();
        this.viewUltimasImagensMiniatura4();
        this.viewUltimasImagensMiniatura5();
    }

    private void viewUltimasImagensMiniatura1() throws IOException {
        new PresenterMiniatura1(this.viewUltimasImagens);
    }

    private void viewUltimasImagensMiniatura2() throws IOException {
        new PresenterMiniatura2(this.viewUltimasImagens);
    }

    private void viewUltimasImagensMiniatura3() throws IOException {
        new PresenterMiniatura3(this.viewUltimasImagens);
    }

    private void viewUltimasImagensMiniatura4() throws IOException {
        new PresenterMiniatura4(this.viewUltimasImagens);
    }

    private void viewUltimasImagensMiniatura5() throws IOException {
        new PresenterMiniatura5(this.viewUltimasImagens);
    }
}
