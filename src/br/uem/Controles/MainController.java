package br.uem.Controles;

import br.uem.modelo.personagem.*;
import br.uem.modelo.time.Time;
import br.uem.utilitarios.MensagemUtils;
import br.uem.utilitarios.TimeUtils;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;


import java.util.ArrayList;
import java.util.List;

public class MainController {

    public List<Personagem> timeJogadorList = new ArrayList<Personagem>();
    List<ImageView> listaImagensTelaTimeJo = new ArrayList<ImageView>();
    List<ImageView> listaImagensTelaTimeAd = new ArrayList<ImageView>();
    List<ImageView> listaImagensTelaAtaqueJo = new ArrayList<ImageView>();
    List<ImageView> listaImagensTelaAtaqueAd = new ArrayList<ImageView>();

    List<Label> listaNomesTelaTimeJo = new ArrayList<Label>();
    List<Label> listaNomesTelaTimeAd = new ArrayList<Label>();
    List<Label> listaNomesTelaAtaqueJo = new ArrayList<Label>();
    List<Label> listaNomesTelaAtaqueAd = new ArrayList<Label>();

    private Time timeJogador;
    private Time timeCpu;

    @FXML private TabPane tabPanel;
    @FXML private Tab tabLuta;
    @FXML private ImageView imgTimeView1;
    @FXML private ImageView imgTimeView2;
    @FXML private ImageView imgTimeView3;
    @FXML private ImageView imgTimeView4;

    @FXML private ImageView ImgViewAtaqueAd1;
    @FXML private ImageView ImgViewAtaqueAd2;
    @FXML private ImageView ImgViewAtaqueAd3;
    @FXML private ImageView ImgViewAtaqueAd4;
    @FXML private ImageView ImgViewAtaqueJo1;
    @FXML private ImageView ImgViewAtaqueJo2;
    @FXML private ImageView ImgViewAtaqueJo3;
    @FXML private ImageView ImgViewAtaqueJo4;

    @FXML private Label lblNomeAtaqueJo1;
    @FXML private Label lblNomeAtaqueJo2;
    @FXML private Label lblNomeAtaqueJo3;
    @FXML private Label lblNomeAtaqueJo4;
    @FXML private Label lblNomeAtaqueAd1;
    @FXML private Label lblNomeAtaqueAd2;
    @FXML private Label lblNomeAtaqueAd3;
    @FXML private Label lblNomeAtaqueAd4;


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

    @FXML protected void imgGuerreiroClick() {

        if (timeJogadorList.size() < 4) {

            Guerreiro guerreiro = new Guerreiro();
            ImageView image = new ImageView();
            image.setImage(imgGuerreiro.getImage());
            String nome = null;
            try {
                nome = TimeUtils.getNomePersonagem(
                        "Defina o Nome",
                        "Guerreiro",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                MensagemUtils.ShowMessageNomeVazio();
                return;
            }
            guerreiro.setNome(nome);
            guerreiro.setQuantidadeVida(100);
            timeJogadorList.add(guerreiro);
            atualizaTime();

        }
    }

    @FXML protected void imgCavaleiroClick() {
        if (timeJogadorList.size() < 4) {
            Cavaleiro cavaleiro = new Cavaleiro();
            ImageView image = new ImageView();
            image.setImage(imgCavaleiro.getImage());
            String nome = null;
            try {
                nome = TimeUtils.getNomePersonagem(
                        "Defina o Nome",
                        "Cavaleiro",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                MensagemUtils.ShowMessageNomeVazio();
                return;
            }
            cavaleiro.setNome(nome);
            cavaleiro.setQuantidadeVida(100);
            timeJogadorList.add(cavaleiro);

            atualizaTime();
        }
    }
    @FXML protected void imgMagoClick() {
        if (timeJogadorList.size() < 4) {
            Mago mago = new Mago();
            ImageView image = new ImageView();
            image.setImage(imgMago.getImage());
            String nome = null;
            try {
                nome = TimeUtils.getNomePersonagem(
                        "Defina o Nome",
                        "Mago",
                        "Entre com o nome do personagem:",

                        image
                );

            }catch (RuntimeException ex){
                MensagemUtils.ShowMessageNomeVazio();
                return;
            }
            mago.setNome(nome);
            mago.setQuantidadeVida(100);
            timeJogadorList.add(mago);
            atualizaTime();
        }
    }
    @FXML protected void imgBruxaClick() {
        if (timeJogadorList.size() < 4) {
            Bruxa bruxa = new Bruxa();
            ImageView image = new ImageView();
            image.setImage(imgBruxa.getImage());
            String nome = null;
            try {
               nome = TimeUtils.getNomePersonagem(
                       "Defina o Nome",
                       "Bruxa",
                       "Entre com o nome do personagem:",

                       image
               );

            }catch (RuntimeException ex){
                MensagemUtils.ShowMessageNomeVazio();
                return;
            }
            bruxa.setNome(nome);
            bruxa.setQuantidadeVida(100);
            timeJogadorList.add(bruxa);
            atualizaTime();
        }
    }
    protected void atualizaTime(){

        listaImagensTelaTimeJo.add(imgTimeView1);
        listaImagensTelaTimeJo.add(imgTimeView2);
        listaImagensTelaTimeJo.add(imgTimeView3);
        listaImagensTelaTimeJo.add(imgTimeView4);
        listaNomesTelaTimeJo.add(imgTimeLbl1);
        listaNomesTelaTimeJo.add(imgTimeLbl2);
        listaNomesTelaTimeJo.add(imgTimeLbl3);
        listaNomesTelaTimeJo.add(imgTimeLbl4);

        for ( int i = 0 ; i < timeJogadorList.size(); i++){

            if (timeJogadorList.get(i).getClass().equals(Guerreiro.class)){

                listaImagensTelaTimeJo.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaTimeJo.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Cavaleiro.class)){

                listaImagensTelaTimeJo.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaTimeJo.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Mago.class)){

                listaImagensTelaTimeJo.get(i).setImage(imgMago.getImage());
                listaNomesTelaTimeJo.get(i).setText(timeJogadorList.get(i).getNome());
            }
            if (timeJogadorList.get(i).getClass().equals(Bruxa.class)){

                listaImagensTelaTimeJo.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaTimeJo.get(i).setText(timeJogadorList.get(i).getNome());
            }



        }
    }
    protected void atualizaTime(Time timeAdversario) {

        listaImagensTelaTimeAd.add(imgAdverarioView1);
        listaImagensTelaTimeAd.add(imgAdverarioView2);
        listaImagensTelaTimeAd.add(imgAdverarioView3);
        listaImagensTelaTimeAd.add(imgAdverarioView4);
        listaNomesTelaTimeAd.add(imgAdverarioLbl1);
        listaNomesTelaTimeAd.add(imgAdverarioLbl2);
        listaNomesTelaTimeAd.add(imgAdverarioLbl3);
        listaNomesTelaTimeAd.add(imgAdverarioLbl4);

        for (int i = 0; i < timeAdversario.getAll().size(); i++) {

            if (timeAdversario.getAll().get(i).getClass().equals(Guerreiro.class)) {

                listaImagensTelaTimeAd.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaTimeAd.get(i).setText(timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Cavaleiro.class)) {

                listaImagensTelaTimeAd.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaTimeAd.get(i).setText(timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Mago.class)) {

                listaImagensTelaTimeAd.get(i).setImage(imgMago.getImage());
                listaNomesTelaTimeAd.get(i).setText(timeAdversario.getAll().get(i).getNome());
            }
            if (timeAdversario.getAll().get(i).getClass().equals(Bruxa.class)) {

                listaImagensTelaTimeAd.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaTimeAd.get(i).setText(timeAdversario.getAll().get(i).getNome());
            }


        }
    }
    @FXML protected void btnClick() {

        timeJogador = new Time("Time Diego",timeJogadorList);
        timeCpu = timeJogador.cloneTime();

        atualizaTime(timeCpu);
    }

    @FXML protected void btnJogarClick(){

        listaImagensTelaAtaqueAd.add(ImgViewAtaqueAd1);
        listaImagensTelaAtaqueAd.add(ImgViewAtaqueAd2);
        listaImagensTelaAtaqueAd.add(ImgViewAtaqueAd3);
        listaImagensTelaAtaqueAd.add(ImgViewAtaqueAd4);

        listaImagensTelaAtaqueJo.add(ImgViewAtaqueJo1);
        listaImagensTelaAtaqueJo.add(ImgViewAtaqueJo2);
        listaImagensTelaAtaqueJo.add(ImgViewAtaqueJo3);
        listaImagensTelaAtaqueJo.add(ImgViewAtaqueJo4);

        listaNomesTelaAtaqueAd.add(lblNomeAtaqueAd1);
        listaNomesTelaAtaqueAd.add(lblNomeAtaqueAd2);
        listaNomesTelaAtaqueAd.add(lblNomeAtaqueAd3);
        listaNomesTelaAtaqueAd.add(lblNomeAtaqueAd4);

        listaNomesTelaAtaqueJo.add(lblNomeAtaqueJo1);
        listaNomesTelaAtaqueJo.add(lblNomeAtaqueJo2);
        listaNomesTelaAtaqueJo.add(lblNomeAtaqueJo3);
        listaNomesTelaAtaqueJo.add(lblNomeAtaqueJo4);


        for ( int i = 0 ; i < timeJogador.getAll().size(); i++){
            if (timeJogador.getAll().get(i).getClass().equals(Guerreiro.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));
            }
            if (timeJogador.getAll().get(i).getClass().equals(Cavaleiro.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));
            }
            if (timeJogador.getAll().get(i).getClass().equals(Mago.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgMago.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));
            }
            if (timeJogador.getAll().get(i).getClass().equals(Bruxa.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));
            }
        }

        for ( int i = 0 ; i < timeCpu.getAll().size(); i++){
            if (timeCpu.getAll().get(i).getClass().equals(Guerreiro.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));
            }
            if (timeCpu.getAll().get(i).getClass().equals(Cavaleiro.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));
            }
            if (timeCpu.getAll().get(i).getClass().equals(Mago.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgMago.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));
            }
            if (timeCpu.getAll().get(i).getClass().equals(Bruxa.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));
            }
        }
        tabPanel.getSelectionModel().select(tabLuta);




    }
}
