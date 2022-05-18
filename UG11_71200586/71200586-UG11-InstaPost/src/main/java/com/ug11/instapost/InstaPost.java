package com.ug11.instapost;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){};

    public void printInfo(){
        System.out.println("Username: " + username.toUpperCase());
        System.out.println("Email: " + this.email);
        System.out.println("Total Mention: " + this.totalMention);
    };

    public void login(String email) throws EmailException {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String[] emailBaru = email.split("@");
        this.email = email;
        if(email.matches(emailPattern) && emailBaru[1] == "gmail.com"){
            this.username = emailBaru[0];
        }else if(emailBaru[1] != "gmail.com"){
            throw new EmailException(2);
        }else{
            if(email.indexOf("@") == -1){
                throw new EmailException(1);
                }
            }
        }

    public void post(String caption){
        String[] captBaru = caption.split(" ");
        String captPattern = "@[a-z]";
        String[] pengguna = new String[5];
        for(String user :captBaru){
            if(user.matches(captPattern)){
                totalMention = totalMention + 1;
                for (int i = 0; i < pengguna.length; i++){
                    if(pengguna[i] == null){
                        pengguna[i] = user;
                    }
                }
            }
        }
        System.out.println("Caption: " + caption);
        System.out.println("Pengguna yang Anda mention: ");
        for (int k = 0; k < pengguna.length; k++){
            if(k != pengguna.length){
                System.out.println(pengguna[k] + ",");
            }else{
                System.out.println(pengguna[k]);}
        }
        System.out.println("Total username yang Anda mention: " + pengguna.length);
        };
}
