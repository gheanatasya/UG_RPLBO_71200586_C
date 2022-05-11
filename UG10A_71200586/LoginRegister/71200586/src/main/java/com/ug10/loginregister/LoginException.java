package com.ug10.loginregister;

public class LoginException extends Exception{
    private int errCode;
    private String errMessage;

    public LoginException(int errCode){
        super();
        this.errCode = errCode;
        if(errCode == 1){
            this.errMessage = "Username tidak boleh kosong!";
        }else if(errCode == 2){
            this.errMessage = "Username dan password tidak boleh kosong!";
        }else if(errCode == 3){
            this.errMessage = "Username dan password harus sesuai dengan data saat register!";
        }
    }

    public LoginException(String errorMessage){
        super(errorMessage);
    }

    public int getErrCode(){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}
