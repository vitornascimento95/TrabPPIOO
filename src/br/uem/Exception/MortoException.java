package br.uem.Exception;

/**
 * Created by Diego on 21/11/2014.
 */
public class MortoException extends Exception {

    private String msg;
    public MortoException(String msg){
        super(msg);
        this.msg = msg;
    }
    public String getMessage(){
        return msg;
    }

}
