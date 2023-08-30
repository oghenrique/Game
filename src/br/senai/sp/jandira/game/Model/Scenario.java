package br.senai.sp.jandira.game.Model;

public class Scenario {
    public String Scenario(int optionScenario){

        String scenario = "Senai Jandira";

        switch (optionScenario){
            case 1:
                scenario = "Torre Eiffel";
                break;
            case 2:
                scenario = "Arabia - [Junto com o Ney]";
                break;
            case 3:
                scenario = "Turquia";
                break;
        }

        return scenario;

    }

}