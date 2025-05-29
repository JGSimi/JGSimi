package com.interfaceapp.View;

import com.interfaceapp.Controller.StyleController;

import com.interfaceapp.Controller.PessoasController;
import com.interfaceapp.Model.Pessoa;
import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InsertPessoasView extends JFrame {
    private PessoasController pessoasController;
    private MenuView menuView;
    private JTextField nomeField, cpfField, telefoneField, emailField, senhaField;
    private JButton salvarButton;

    public InsertPessoasView(PessoasController controller, MenuView menuView) {
        this.pessoasController = controller;
        this.menuView = menuView;
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(430, 370);
        setLocationRelativeTo(null);
        StyleController styleController = new StyleController();
        styleController.estilizarJanela(this, new Color(30, 30, 30));

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        styleController.estilizarTitulo(titulo, Color.WHITE, 22);
        add(titulo, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 15));
        styleController.estilizarPanel(formPanel, new Color(30, 30, 30));
        JLabel nomeLabel = new JLabel("Nome:");
        styleController.estilizarTitulo(nomeLabel, Color.WHITE, 14);
        nomeField = new JTextField();
        styleController.estilizarTextField(nomeField, Color.DARK_GRAY, 14);
        formPanel.add(nomeLabel);
        formPanel.add(nomeField);

        JLabel cpfLabel = new JLabel("CPF:");
        styleController.estilizarTitulo(cpfLabel, Color.WHITE, 14);
        cpfField = new JTextField();
        styleController.estilizarTextField(cpfField, Color.DARK_GRAY, 14);
        formPanel.add(cpfLabel);
        formPanel.add(cpfField);

        JLabel telefoneLabel = new JLabel("Telefone:");
        styleController.estilizarTitulo(telefoneLabel, Color.WHITE, 14);
        telefoneField = new JTextField();
        styleController.estilizarTextField(telefoneField, Color.DARK_GRAY, 14);
        formPanel.add(telefoneLabel);
        formPanel.add(telefoneField);

        JLabel emailLabel = new JLabel("Email:");
        styleController.estilizarTitulo(emailLabel, Color.WHITE, 14);
        emailField = new JTextField();
        styleController.estilizarTextField(emailField, Color.DARK_GRAY, 14);
        formPanel.add(emailLabel);
        formPanel.add(emailField);

        JLabel senhaLabel = new JLabel("Senha:");
        styleController.estilizarTitulo(senhaLabel, Color.WHITE, 14);
        senhaField = new JPasswordField();
        styleController.estilizarTextField(senhaField, Color.DARK_GRAY, 14);
        formPanel.add(senhaLabel);
        formPanel.add(senhaField);

        add(formPanel, BorderLayout.CENTER);

        salvarButton = new JButton("Salvar");
        styleController.estilizarBotao(salvarButton, new Color(76, 175, 80), 18);
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoa();
            }
        });
        JPanel buttonPanel = new JPanel();
        styleController.estilizarPanel(buttonPanel, new Color(30, 30, 30));
        buttonPanel.add(salvarButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void showView() {
        setVisible(true);
    }

    private void cadastrarPessoa() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String telefone = telefoneField.getText();
        String email = emailField.getText();
        String senha = senhaField.getText();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone, email, senha);
        pessoasController.salvarPessoa(pessoa);
        JOptionPane.showMessageDialog(this, "Pessoa cadastrada com sucesso!");
        dispose();
        menuView.showView();
    }
}