package br.uem.utilitarios;

import javafx.scene.control.Alert;

/**
 * Created by Diego on 20/11/2014.
 */
public class MensagemUtils {

    public static void ShowMessageNomeVazio(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nome Inválido");
        alert.setHeaderText(null);
        alert.setContentText("O nome do personagem não pode ser vazio");

        alert.showAndWait();
    }

    public static void ShowMessage( String msg){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Atenção");
        alert.setHeaderText(null);
        alert.setContentText(msg);

        alert.showAndWait();
    }

}
