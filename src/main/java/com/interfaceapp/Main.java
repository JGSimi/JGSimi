package com.interfaceapp;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.interfaceapp.Controller.PessoasController;
import com.interfaceapp.View.MenuView;

public class Main {
    public static void main(String[] args) {
        PessoasController pessoasController = new PessoasController();
        MenuView menuView = new MenuView(pessoasController);
        menuView.showView();
    }
}

