package br.senai.sp.jandira.game;

import br.senai.sp.jandira.game.Model.Menu;
import br.senai.sp.jandira.game.Model.Register;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.Menu();

        /** Instancia Register */
        Register register = new Register();

        register.Decision();


    }

}
