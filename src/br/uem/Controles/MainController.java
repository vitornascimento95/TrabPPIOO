package br.uem.Controles;

import br.uem.modelo.personagem.*;
import br.uem.modelo.time.Time;
import br.uem.utilitarios.MensagemUtils;
import br.uem.utilitarios.TimeUtils;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.awt.font.ImageGraphicAttribute;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    public List<Personagem> timeJogadorList = new ArrayList<Personagem>();
    public List<ImageView> listaImagensTelaTimeJo = new ArrayList<ImageView>();
    public List<ImageView> listaImagensTelaTimeAd = new ArrayList<ImageView>();
    public List<ImageView> listaImagensTelaAtaqueJo = new ArrayList<ImageView>();
    public List<ImageView> listaImagensTelaAtaqueAd = new ArrayList<ImageView>();

    public List<Label> listaNomesTelaTimeJo = new ArrayList<Label>();
    public List<Label> listaNomesTelaTimeAd = new ArrayList<Label>();
    public List<Label> listaNomesTelaAtaqueJo = new ArrayList<Label>();
    public List<Label> listaNomesTelaAtaqueAd = new ArrayList<Label>();

    public ArrayList<ImageView> listaCoracoesJo = new ArrayList<ImageView>();
    public ArrayList<ImageView> listaCoracoesAd = new ArrayList<ImageView>();

    public ArrayList<Label> listaLabeJo = new ArrayList<Label>();
    public ArrayList<Label> listaLabeAd = new ArrayList<Label>();

    private Time timeJogador;
    private Time timeCpu;

    @FXML private TabPane tabPanel;
    @FXML private Tab tabLuta;

    @FXML private ImageView imageViewTelaTimeJo1;
    @FXML private ImageView imageViewTelaTimeJo2;
    @FXML private ImageView imageViewTelaTimeJo3;
    @FXML private ImageView imageViewTelaTimeJo4;

    @FXML private Label labelTelaTimeJo1;
    @FXML private Label labelTelaTimeJo2;
    @FXML private Label labelTelaTimeJo3;
    @FXML private Label labelTelaTimeJo4;

    @FXML private ImageView imageViewTelaTimeAd1;
    @FXML private ImageView imageViewTelaTimeAd2;
    @FXML private ImageView imageViewTelaTimeAd3;
    @FXML private ImageView imageViewTelaTimeAd4;

    @FXML private Label labelTelaTimeAd1;
    @FXML private Label labelTelaTimeAd2;
    @FXML private Label labelTelaTimeAd3;
    @FXML private Label labelTelaTimeAd4;

    @FXML private ImageView imageViewTelaAtaqueJo1;
    @FXML private ImageView imageViewTelaAtaqueJo2;
    @FXML private ImageView imageViewTelaAtaqueJo3;
    @FXML private ImageView imageViewTelaAtaqueJo4;

    @FXML private Label labelNomeTelaAtaqueJo1;
    @FXML private Label labelNomeTelaAtaqueJo2;
    @FXML private Label labelNomeTelaAtaqueJo3;
    @FXML private Label labelNomeTelaAtaqueJo4;

    @FXML private ImageView imageViewTelaAtaqueAd1;
    @FXML private ImageView imageViewTelaAtaqueAd2;
    @FXML private ImageView imageViewTelaAtaqueAd3;
    @FXML private ImageView imageViewTelaAtaqueAd4;

    @FXML private Label labelNomeTelaAtaqueAd1;
    @FXML private Label labelNomeTelaAtaqueAd2;
    @FXML private Label labelNomeTelaAtaqueAd3;
    @FXML private Label labelNomeTelaAtaqueAd4;

    @FXML private Label labeVidaJo1;
    @FXML private Label labeVidaJo2;
    @FXML private Label labeVidaJo3;
    @FXML private Label labeVidaJo4;

    @FXML private ImageView imgCoracaoJo1;
    @FXML private ImageView imgCoracaoJo2;
    @FXML private ImageView imgCoracaoJo3;
    @FXML private ImageView imgCoracaoJo4;

    @FXML private Label labeVidaAd1;
    @FXML private Label labeVidaAd2;
    @FXML private Label labeVidaAd3;
    @FXML private Label labeVidaAd4;

    @FXML private ImageView imgCoracaoAd1;
    @FXML private ImageView imgCoracaoAd2;
    @FXML private ImageView imgCoracaoAd3;
    @FXML private ImageView imgCoracaoAd4;

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

        listaImagensTelaTimeJo.add(imageViewTelaTimeJo1);
        listaImagensTelaTimeJo.add(imageViewTelaTimeJo2);
        listaImagensTelaTimeJo.add(imageViewTelaTimeJo3);
        listaImagensTelaTimeJo.add(imageViewTelaTimeJo4);
        listaNomesTelaTimeJo.add(labelTelaTimeJo1);
        listaNomesTelaTimeJo.add(labelTelaTimeJo2);
        listaNomesTelaTimeJo.add(labelTelaTimeJo3);
        listaNomesTelaTimeJo.add(labelTelaTimeJo4);

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

        listaImagensTelaTimeAd.add(imageViewTelaTimeAd1);
        listaImagensTelaTimeAd.add(imageViewTelaTimeAd2);
        listaImagensTelaTimeAd.add(imageViewTelaTimeAd3);
        listaImagensTelaTimeAd.add(imageViewTelaTimeAd4);
        listaNomesTelaTimeAd.add(labelTelaTimeAd1);
        listaNomesTelaTimeAd.add(labelTelaTimeAd2);
        listaNomesTelaTimeAd.add(labelTelaTimeAd3);
        listaNomesTelaTimeAd.add(labelTelaTimeAd4);

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

        listaImagensTelaAtaqueAd.add(imageViewTelaAtaqueAd1);
        listaImagensTelaAtaqueAd.add(imageViewTelaAtaqueAd2);
        listaImagensTelaAtaqueAd.add(imageViewTelaAtaqueAd3);
        listaImagensTelaAtaqueAd.add(imageViewTelaAtaqueAd4);

        listaImagensTelaAtaqueJo.add(imageViewTelaAtaqueJo1);
        listaImagensTelaAtaqueJo.add(imageViewTelaAtaqueJo2);
        listaImagensTelaAtaqueJo.add(imageViewTelaAtaqueJo3);
        listaImagensTelaAtaqueJo.add(imageViewTelaAtaqueJo4);

        listaNomesTelaAtaqueAd.add(labelNomeTelaAtaqueAd1);
        listaNomesTelaAtaqueAd.add(labelNomeTelaAtaqueAd2);
        listaNomesTelaAtaqueAd.add(labelNomeTelaAtaqueAd3);
        listaNomesTelaAtaqueAd.add(labelNomeTelaAtaqueAd4);

        listaNomesTelaAtaqueJo.add(labelNomeTelaAtaqueJo1);
        listaNomesTelaAtaqueJo.add(labelNomeTelaAtaqueJo2);
        listaNomesTelaAtaqueJo.add(labelNomeTelaAtaqueJo3);
        listaNomesTelaAtaqueJo.add(labelNomeTelaAtaqueJo4);

        listaCoracoesJo.add(imgCoracaoJo1);
        listaCoracoesJo.add(imgCoracaoJo2);
        listaCoracoesJo.add(imgCoracaoJo3);
        listaCoracoesJo.add(imgCoracaoJo4);

        listaCoracoesAd.add(imgCoracaoAd1);
        listaCoracoesAd.add(imgCoracaoAd2);
        listaCoracoesAd.add(imgCoracaoAd3);
        listaCoracoesAd.add(imgCoracaoAd4);

        listaLabeJo.add(labeVidaJo1);
        listaLabeJo.add(labeVidaJo2);
        listaLabeJo.add(labeVidaJo3);
        listaLabeJo.add(labeVidaJo4);

        listaLabeAd.add(labeVidaAd1);
        listaLabeAd.add(labeVidaAd2);
        listaLabeAd.add(labeVidaAd3);
        listaLabeAd.add(labeVidaAd4);


        for ( int i = 0 ; i < timeJogador.getAll().size(); i++){
            if (timeJogador.getAll().get(i).getClass().equals(Guerreiro.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));

                atualizaVida(listaCoracoesJo, listaLabeJo, timeJogador, i);

            }
            if (timeJogador.getAll().get(i).getClass().equals(Cavaleiro.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));

                atualizaVida(listaCoracoesJo, listaLabeJo, timeJogador, i);

            }
            if (timeJogador.getAll().get(i).getClass().equals(Mago.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgMago.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));

                atualizaVida(listaCoracoesJo, listaLabeJo, timeJogador, i);

            }
            if (timeJogador.getAll().get(i).getClass().equals(Bruxa.class)){

                listaImagensTelaAtaqueJo.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaAtaqueJo.get(i).setText(timeJogador.getNomeById(i));

                atualizaVida(listaCoracoesJo, listaLabeJo, timeJogador, i);
            }
        }

        for ( int i = 0 ; i < timeCpu.getAll().size(); i++){
            if (timeCpu.getAll().get(i).getClass().equals(Guerreiro.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgGuerreiro.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));

                atualizaVida(listaCoracoesAd, listaLabeAd, timeCpu, i);

            }
            if (timeCpu.getAll().get(i).getClass().equals(Cavaleiro.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgCavaleiro.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));

                atualizaVida(listaCoracoesAd, listaLabeAd, timeCpu, i);

            }
            if (timeCpu.getAll().get(i).getClass().equals(Mago.class)) {

                listaImagensTelaAtaqueAd.get(i).setImage(imgMago.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));

                atualizaVida(listaCoracoesAd, listaLabeAd, timeCpu, i);

            }
            if (timeCpu.getAll().get(i).getClass().equals(Bruxa.class)){

                listaImagensTelaAtaqueAd.get(i).setImage(imgBruxa.getImage());
                listaNomesTelaAtaqueAd.get(i).setText(timeCpu.getNomeById(i));

                atualizaVida(listaCoracoesAd, listaLabeAd, timeCpu, i);
            }
        }
        tabPanel.getSelectionModel().select(tabLuta);

    }

    private void atualizaVida(ArrayList<ImageView> listaCoracoes, ArrayList<Label> listaLabel, Time time, int index ){
        listaCoracoes.get(index).setVisible(true);
        listaLabel.get(index).setText(time.getPersonagemById(index).getQuantidadeVida() + "");
    }
}
