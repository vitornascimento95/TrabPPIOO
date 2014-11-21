package br.uem.utilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.ImageView;

import java.util.Optional;

/**
 * Created by Diego on 20/11/2014.
 */
public class TimeUtils {

    @FXML
    private ImageView imgTimeView1;

    public static String getNomePersonagem(String titulo, String cabecalho, String mensagem, ImageView image) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titulo);
        dialog.setHeaderText(cabecalho);
        dialog.setContentText(mensagem);
        dialog.setGraphic(image);

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            String retorno = result.get().toString();

            if(retorno.equals("")){
                throw new RuntimeException();
            }

            return retorno;
        }

        throw new NullPointerException();
    }

}
