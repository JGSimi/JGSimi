package com.interfaceapp.View;

import com.interfaceapp.Controller.PessoasController;
import com.interfaceapp.Model.Pessoa;

import java.util.List;
import com.interfaceapp.Model.Pessoa;
import com.interfaceapp.Controller.PessoasController;
import java.util.List;
import com.interfaceapp.Model.Pessoa;
import com.interfaceapp.Controller.PessoasController;

// @module View responsavel por listar pessoas via interface simples
// @field showView() Exibe a interface para listagem de pessoas
// @author Joao
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import com.interfaceapp.Model.Pessoa;
import com.interfaceapp.Controller.PessoasController;
import com.interfaceapp.Controller.StyleController;

// @module View responsavel por listar pessoas via interface Swing
// @field showView() Exibe a tela para listagem de pessoas
// @author Joao

public class ListPessoasView extends JFrame {
    private PessoasController pessoasController; // Controller usado para listar pessoas
    private MenuView menuView; // Referência ao menu principal
    private JTable pessoasTable;
    private JButton voltarButton;

    /**
     * Construtor da view de listagem de pessoas.
     * @param controller Controller de pessoas
     * @param menuView Referência ao menu principal
     */
    public ListPessoasView(PessoasController controller, MenuView menuView) {
        this.pessoasController = controller;
        this.menuView = menuView;
        setTitle("Lista de Pessoas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 370);
        setLocationRelativeTo(null);
        StyleController styleController = new StyleController();
        styleController.estilizarJanela(this, new Color(30, 30, 30));

        JLabel titulo = new JLabel("Lista de Pessoas", SwingConstants.CENTER);
        styleController.estilizarTitulo(titulo, Color.WHITE, 22);
        add(titulo, BorderLayout.NORTH);

        String[] colunas = {"Nome", "CPF", "Telefone", "Email", "Senha"};
        pessoasTable = new JTable(new Object[0][5], colunas);
        pessoasTable.setEnabled(false);
        pessoasTable.setFont(new Font("Arial", Font.PLAIN, 14));
        styleController.estilizarTabela(pessoasTable, new Color(30, 30, 30), 14, 14, 10, 10);
        JScrollPane scrollPane = new JScrollPane(pessoasTable);
        add(scrollPane, BorderLayout.CENTER);

        voltarButton = new JButton("Voltar");
        styleController.estilizarBotao(voltarButton, new Color(255, 50, 50), 18);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                menuView.showView();
            }
        });
        JPanel bottomPanel = new JPanel();
        styleController.estilizarPanel(bottomPanel, new Color(30, 30, 30));
        bottomPanel.add(voltarButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    /**
     * Exibe a tela para listagem de pessoas.
     */
    public void showView() {
        List<Pessoa> pessoas = pessoasController.listarPessoas();
        Object[][] dados = new Object[pessoas.size()][5];
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            dados[i][0] = p.getNome();
            dados[i][1] = p.getCpf();
            dados[i][2] = p.getTelefone();
            dados[i][3] = p.getEmail();
            dados[i][4] = p.getSenha();
        }
        String[] colunas = {"Nome", "CPF", "Telefone", "Email", "Senha"};
        pessoasTable.setModel(new javax.swing.table.DefaultTableModel(dados, colunas));
        setVisible(true);
    }
}

