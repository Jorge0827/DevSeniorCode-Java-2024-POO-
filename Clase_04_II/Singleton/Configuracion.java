package Clase_04_II.Singleton;

public class Configuracion {
    private static Configuracion instance;
    private String userName;
    private String password;
    private String email;

    public static Configuracion getInstance(String userName, String password, String email) {
        if (instance == null) {
            instance = new Configuracion(userName, password, email);
        }
        return instance;
    }

    private Configuracion(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Configuracion [userName=" + userName + ", password=" + password + ", email=" + email + "]";
    }

}
