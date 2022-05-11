package com.ug10.loginregister;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws UsernameException, EmailException, PasswordException, LoginException {
        System.out.println("Selamat datang di Toko NamaKamu");
        System.out.println("Silakan daftarkan diri kamu untuk dapat mengakses menu di Toko NamaKamu");

        boolean regis = true;
        while (regis) {
            String username = System.console().readLine("Username: ");
            try {
                if (username.isEmpty()) {
                    regis = true;
                    throw new UsernameException(1);
                } else if (username.length() < 6) {
                    regis = true;
                    throw new UsernameException(2);
                } else {
                    regis = false;
                }
            } catch (UsernameException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }

        boolean regis1 = true;
        while (regis1) {
            String email = System.console().readLine("Email: ");
            String emailPattern = "[a-zA-Z0-9]+@[a-z]+\\.+[a-z]+";
            try {
                if (email.isEmpty()) {
                    regis1 = true;
                    throw new EmailException(1);
                } else if (!(email.matches(emailPattern))) {
                    regis1 = true;
                    throw new EmailException(2);
                } else {
                    regis1 = false;
                }
            } catch (EmailException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }

        boolean regis2 = true;
        while (regis2) {
            char[] Password = System.console().readPassword("Password: ");
            char[] KonfirmasiPassword = System.console().readPassword("Konfirmasi Password: ");
            String password = new String(Password);
            String confirm = new String(KonfirmasiPassword);
            try {
                if (password.isEmpty()) {
                    regis2 = true;
                    throw new PasswordException(1);
                } else if (password.length() < 7) {
                    regis2 = true;
                    throw new PasswordException(2);
                } else if (password.equals("username")) {
                    regis2 = true;
                    throw new PasswordException(4);
                } else if (!(password.matches(confirm))) {
                    regis2 = true;
                    throw new PasswordException(5);
                } else {
                    boolean flagKecil = false;
                    boolean flagBesar = false;
                    boolean flagAngka = false;
                    for (int i = 0; i < password.length(); i++) {
                        char c = password.charAt(i);
                        if (Character.isLetter(c) && Character.isLowerCase(c))
                            flagKecil = true;
                        if (Character.isLetter(c) && Character.isUpperCase(c))
                            flagBesar = true;
                        if (Character.isDigit(c))
                            flagAngka = true;
                        if (!(flagKecil && flagAngka && flagBesar)) {
                            throw new PasswordException(3);
                        }
                    }
                }
            } catch (PasswordException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
        System.out.println("Akun kamu berhasil didaftarkan!");
        System.out.println("Silakan login untuk melanjutkan.");

        String username = System.console().readLine("Username: ");
        char[] Password = System.console().readPassword("Password: ");
        String password = new String(Password);
        try {
            if (!(username.equals(username))) {
                throw new LoginException(3);
            } else if (username.isEmpty()) {
                throw new LoginException(1);
            } else if (password.isEmpty()){
                throw new LoginException(2);
            }
        } catch (LoginException e) {
            System.out.println("Error : " + e.getErrorMessage());
        }

    }
}
