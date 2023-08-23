package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {

    public void  Menu(){

        Scanner teclado = new Scanner(System.in);
        Register register = new Register();
        Battle battle = new Battle();

        boolean continuar = true;

        while (continuar){
            System.out.println("--------------------------------------");
            System.out.println("------------- BEM VINDO --------------");
            System.out.println("Escolha uma das Opções: ");
            System.out.println("1 - Register");
            System.out.println("2 - Battle");
            System.out.println("3 - Exit");
            System.out.println("--------------------------------------");

            int userOption = teclado.nextInt();

            switch (userOption){

                case 1:
                    register.Decision();
                    break;

                case 2:
                    //battle.Battle();
                    System.out.println("Feature in Development");
                    break;

                case 3:
                    continuar = false;
                    break;



            }
        }
    }
}