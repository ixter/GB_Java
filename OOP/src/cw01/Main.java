package cw01;

import cw01.console.View;
import cw01.presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        cw01.presenter.Presenter p = new Presenter(new View());
        p.buttonClick(); // Старт программы
    }

}
