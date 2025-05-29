package com.interfaceapp.View;

import javax.swing.JOptionPane;
import com.interfaceapp.Controller.PessoasController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.interfaceapp.Controller.PessoasController;
import com.interfaceapp.Controller.StyleController;

public class MenuView extends JFrame {
    private PessoasController pessoasController; // Controller usado para listar pessoas
    private JButton inserirButton, listarButton, sairButton;

    // Construtor
    public MenuView(PessoasController controller) {
        this.pessoasController = controller;
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        StyleController styleController = new StyleController();
        styleController.estilizarJanela(this, new Color(30, 30, 30));

        JLabel titulo = new JLabel("Menu Principal", SwingConstants.CENTER);
        styleController.estilizarTitulo(titulo, Color.WHITE, 22);
        add(titulo, BorderLayout.NORTH);

        JPanel botoesPanel = new JPanel(new GridLayout(3, 1, 20, 20));
        styleController.estilizarPanel(botoesPanel, new Color(30, 30, 30));

        inserirButton = new JButton("Inserir Pessoa");
        listarButton = new JButton("Listar Pessoas");
        sairButton = new JButton("Sair");
        styleController.estilizarBotao(inserirButton, new Color(76, 175, 80), 18);
        styleController.estilizarBotao(listarButton, new Color(33, 150, 243), 18);
        styleController.estilizarBotao(sairButton, new Color(255, 50, 50), 18);

        inserirButton.addActionListener(e -> {
            dispose();
            InsertPessoasView insertPessoasView = new InsertPessoasView(pessoasController, MenuView.this);
            insertPessoasView.showView();
        });
        listarButton.addActionListener(e -> {
            dispose();
            ListPessoasView listPessoasView = new ListPessoasView(pessoasController, MenuView.this);
            listPessoasView.showView();
        });
        sairButton.addActionListener(e -> System.exit(0));

        botoesPanel.add(inserirButton);
        botoesPanel.add(listarButton);
        botoesPanel.add(sairButton);
        add(botoesPanel, BorderLayout.CENTER);
    }


    public void showView() {
        setVisible(true);
    }
}


