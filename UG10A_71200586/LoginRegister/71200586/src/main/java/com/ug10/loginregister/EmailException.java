package com.ug10.loginregister;

public class EmailException extends Exception{
    private int errCode;
    private String errMessage;

    public EmailException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode == 1){
            this.errMessage = "Email tidak boleh kosong!";
        }else if(errCode == 2){
            this.errMessage = "Format email seperti berikut : email@ukdw.com!";
        }
    }

    public EmailException(String errorMessage){
        super(errorMessage);
    }

    public int getErrCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }

}
