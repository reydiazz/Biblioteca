package App;

import Controlador.ControladorLogin;
import Vista.Login;

public class Main {

    public static void main(String[] args) {
        ControladorLogin c = new ControladorLogin(new Login());
        c.iniciarLogin();
    }
}
