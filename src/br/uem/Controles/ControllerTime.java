package br.uem.Controles;

import br.uem.modelo.personagem.*;
import br.uem.modelo.time.Time;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ControllerTime {

    public List<Personagem> timeJogadorList = new ArrayList<Personagem>();
    List<ImageView> imageTimeViews = new ArrayList<ImageView>();
    List<ImageView> imageAdversarioViews = new ArrayList<ImageView>();
    List<Label> imageTimeLbls = new ArrayList<Label>();
    List<Label> imageAdversarioLbls = new ArrayList<Label>();

    @FXML private TabPane tabPanel;
    @FXML private Tab tabLuta;

    @FXML private ImageView imgTimeView1;
    @FXML private ImageView imgTimeView2;
    @FXML private ImageView imgTimeView3;
    @FXML private ImageView imgTimeView4;
    @FXML private Label imgTimeLbl1;
    @FXML private Label imgTimeLbl2;
    @FXML private Label imgTimeLbl3;
    @FXML private Label imgTimeLbl4;
    @FXML private ImageView imgAdverarioView1;
    @FXML private ImageView imgAdverarioView2;
    @FXML private ImageView imgAdverarioView3;
    @FXML private ImageView imgAdverarioView4;
    @FXML private Label imgAdverarioLbl1;
    @FXML private Label imgAdverarioLbl2;
    @FXML private Label imgAdverarioLbl3;
    @FXML private Label imgAdverarioLbl4;
    @FXML private ImageView imgGuerreiro;
    @FXML private ImageView imgCavaleiro;
    @FXML private ImageView imgMago;
    @FXML private ImageView imgBruxa;

    @FXML
    protected void imgGuerreiroClick() {

        if (timeJogadorList.size() < 4) {

            Guerreiro guerreiro = new Guerreiro();
            ImageView image = new ImageView();
            image.setImage(imgGuerreiro.getImage());
            String nome = null;
            try {
                nome = getNomePersonagem(
                        "Defina o Nome",
                        "Guerreiro",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                ShowMessage();
                return;
            }
            guerreiro.setNome(nome);
            guerreiro.setQuantidadeVida(100);
            timeJogadorList.add(guerreiro);
            atualizaTime(timeJogadorList);

        }
    }

    @FXML
    protected void imgCavaleiroClick() {
        if (timeJogadorList.size() < 4) {
            Cavaleiro cavaleiro = new Cavaleiro();
            ImageView image = new ImageView();
            image.setImage(imgCavaleiro.getImage());
            String nome = null;
            try {
                nome = getNomePersonagem(
                        "Defina o Nome",
                        "Cavaleiro",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                ShowMessage();
                return;
            }
            cavaleiro.setNome(nome);
            cavaleiro.setQuantidadeVida(100);
            timeJogadorList.add(cavaleiro);

            atualizaTime(timeJogadorList);
        }
    }

    @FXML
    protected void imgMagoClick() {
        if (timeJogadorList.size() < 4) {
            Mago mago = new Mago();
            ImageView image = new ImageView();
            image.setImage(imgMago.getImage());
            String nome = null;
            try {
                nome = getNomePersonagem(
                        "Defina o Nome",
                        "Mago",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                ShowMessage();
                return;
            }
            mago.setNome(nome);
            mago.setQuantidadeVida(100);
            timeJogadorList.add(mago);
            atualizaTime(timeJogadorList);
        }
    }

    @FXML
    protected void imgBruxaClick() {
        if (timeJogadorList.size() < 4) {
            Bruxa bruxa = new Bruxa();
            ImageView image = new ImageView();
            image.setImage(imgBruxa.getImage());
            String nome = null;
            try {
               nome = getNomePersonagem(
                        "Defina o Nome",
                        "Bruxa",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                ShowMessage();
                return;
            }
            bruxa.setNome(nome);
            bruxa.setQuantidadeVida(100);
            timeJogadorList.add(bruxa);
            atualizaTime(timeJogadorList);
        }
    }

    protected void ShowMessage(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Nome Inválido");
        alert.setHeaderText(null);
        alert.setContentText("O nome do personagem não pode ser vazio");

        alert.showAndWait();
    }

    protected String getNomePersonagem(String titulo, String cabecalho, String mensagem, ImageView image) {
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

    protected void atualizaTime(List<Personagem> listaJogar){

        imageTimeViews.add(imgTimeView1);
        imageTimeViews.add(imgTimeView2);
        imageTimeViews.add(imgTimeView3);
        imageTimeViews.add(imgTimeView4);
        imageTimeLbls.add(imgTimeLbl1);
        imageTimeLbls.add(imgTimeLbl2);
        imageTimeLbls.add(imgTimeLbl3);
        imageTimeLbls.add(imgTimeLbl4);

        for ( int i = 0 ; i < timeJogadorList.size(); i++){

            if (timeJogadorList.get(i).getClass().equals(Guerreiro.class)){

                imageTimeViews.get(i).setImage(imgGuerreiro.getImage());
                imageTimeLbls.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Cavaleiro.class)){

                imageTimeViews.get(i).setImage(imgCavaleiro.getImage());
                imageTimeLbls.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Mago.class)){

                imageTimeViews.get(i).setImage(imgMago.getImage());
                imageTimeLbls.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Bruxa.class)){

                imageTimeViews.get(i).setImage(imgBruxa.getImage());
                imageTimeLbls.get(i).setText(timeJogadorList.get(i).getNome());
            }



        }
    }
    protected void atualizaTime(Time timeAdversario) {

        imageAdversarioViews.add(imgAdverarioView1);
        imageAdversarioViews.add(imgAdverarioView2);
        imageAdversarioViews.add(imgAdverarioView3);
        imageAdversarioViews.add(imgAdverarioView4);
        imageAdversarioLbls.add(imgAdverarioLbl1);
        imageAdversarioLbls.add(imgAdverarioLbl2);
        imageAdversarioLbls.add(imgAdverarioLbl3);
        imageAdversarioLbls.add(imgAdverarioLbl4);

        for (int i = 0; i < timeAdversario.getAll().size(); i++) {

            if (timeAdversario.getAll().get(i).getClass().equals(Guerreiro.class)) {

                imageAdversarioViews.get(i).setImage(imgGuerreiro.getImage());
                imageAdversarioLbls.get(i).setText("Dark" + timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Cavaleiro.class)) {

                imageAdversarioViews.get(i).setImage(imgCavaleiro.getImage());
                imageAdversarioLbls.get(i).setText("Dark" + timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Mago.class)) {

                imageAdversarioViews.get(i).setImage(imgMago.getImage());
                imageAdversarioLbls.get(i).setText("Dark" + timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Bruxa.class)) {

                imageAdversarioViews.get(i).setImage(imgBruxa.getImage());
                imageAdversarioLbls.get(i).setText("Dark" + timeAdversario.getAll().get(i).getNome());
            }


        }
    }

    @FXML
    protected void btnClick() {

        MainController.timeJogador = new Time("Time Diego",timeJogadorList);
        MainController.timeCpu = new Time("Time Inimigo", MainController.timeJogador.cloneTime());

        atualizaTime(MainController.timeCpu);
    }

    @FXML
    protected void btnJogarClick(){

        tabPanel.getSelectionModel().select(tabLuta);
    }
}
