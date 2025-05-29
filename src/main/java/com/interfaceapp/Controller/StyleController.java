package com.interfaceapp.Controller;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class StyleController {

    // Estilo
    public void estilizarBotao(JButton botao, Color cor, int tamanhoFonte) {
        botao.setFocusPainted(false);
        botao.setBackground(cor);
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.BOLD, tamanhoFonte));
        botao.setOpaque(true);
        botao.setContentAreaFilled(true);
        botao.setBorderPainted(false);
    }

    public void estilizarTitulo(JLabel titulo, Color cor, int tamanhoFonte) {
        titulo.setFont(new Font("Arial", Font.BOLD, tamanhoFonte));
        titulo.setForeground(cor);
    }

    public void estilizarPanel(JPanel panel, Color cor) {
        panel.setBackground(cor);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 60, 20, 60));
    }

    public void estilizarJanela(JFrame janela, Color Fundo) {
        janela.setLayout(new BorderLayout(10, 10));
        janela.getContentPane().setBackground(Fundo);
    }

    public void estilizarTabela(JTable tabela, Color cor, int tamanhoFonte, int tamanhoFonteHeader, int espacamentoLateral, int espacamentoVertical) {
        tabela.setBackground(cor);
        tabela.setForeground(Color.WHITE);
        tabela.setFont(new Font("Arial", Font.PLAIN, tamanhoFonte));
        tabela.getTableHeader().setFont(new Font("Arial", Font.BOLD, tamanhoFonteHeader));
        tabela.getTableHeader().setBorder(BorderFactory.createEmptyBorder(espacamentoVertical, espacamentoLateral, espacamentoVertical, espacamentoLateral));
    }

    public void estilizarTextField(JTextField campo, Color cor, int tamanhoFonte) {
        campo.setForeground(cor);
        campo.setFont(new Font("Arial", Font.PLAIN, tamanhoFonte));
    }

    public void estilizarTextArea(JTextArea area, Color background, Color foreground, int fontSize) {
        area.setBackground(background);
        area.setForeground(foreground);
        area.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarPasswordField(JPasswordField field, Color background, int fontSize) {
        field.setBackground(background);
        field.setForeground(Color.WHITE);
        field.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarComboBox(JComboBox<?> combo, Color background, Color foreground, int fontSize) {
        combo.setBackground(background);
        combo.setForeground(foreground);
        combo.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarCheckBox(JCheckBox checkBox, Color background, Color foreground, int fontSize) {
        checkBox.setBackground(background);
        checkBox.setForeground(foreground);
        checkBox.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarRadioButton(JRadioButton radioButton, Color background, Color foreground, int fontSize) {
        radioButton.setBackground(background);
        radioButton.setForeground(foreground);
        radioButton.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarSlider(JSlider slider, Color trackColor, Color thumbColor) {
        slider.setBackground(trackColor);
        slider.setForeground(thumbColor);
    }

    public void estilizarProgressBar(JProgressBar progressBar, Color background, Color foreground) {
        progressBar.setBackground(background);
        progressBar.setForeground(foreground);
    }

    public void estilizarMenuBar(JMenuBar menuBar, Color background) {
        menuBar.setBackground(background);
    }

    public void estilizarMenu(JMenu menu, Color foreground, int fontSize) {
        menu.setForeground(foreground);
        menu.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarMenuItem(JMenuItem menuItem, Color foreground, int fontSize) {
        menuItem.setForeground(foreground);
        menuItem.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarTabbedPane(JTabbedPane tabbedPane, Color background, Color foreground, int fontSize) {
        tabbedPane.setBackground(background);
        tabbedPane.setForeground(foreground);
        tabbedPane.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarScrollPane(JScrollPane scrollPane, Border border) {
        scrollPane.setBorder(border);
    }

    public void estilizarToolTip(JToolTip toolTip, Color background, Color foreground, int fontSize) {
        toolTip.setBackground(background);
        toolTip.setForeground(foreground);
        toolTip.setFont(new Font("Arial", Font.PLAIN, fontSize));
    }

    public void estilizarBorda(JComponent component, Border border) {
        component.setBorder(border);
    }
}