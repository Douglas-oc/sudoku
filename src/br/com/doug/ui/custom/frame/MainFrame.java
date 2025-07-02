package br.com.doug.ui.custom.frame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(final Dimension dimension, final JPanel mainPanel){
        super("Sudoku"); // titulo
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // define o que acontece ao clicar para fechar a janela, nesse caso encerra a aplicação
        this.setVisible(true);
        this.setLocationRelativeTo(null); // dessa maneira ele fica centralizado na tela
        this.setResizable(false); // não permite que seja redimensionado
        this.add(mainPanel);
    }
}
