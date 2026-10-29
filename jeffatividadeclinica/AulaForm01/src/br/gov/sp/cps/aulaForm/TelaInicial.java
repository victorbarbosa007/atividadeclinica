
package br.gov.sp.cps.aulaForm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel lblCabecalho;
    private JLabel lblBoasVindas;
    private JButton btnNovaConsulta;

    public TelaInicial() {

        setTitle("Clínica Médica - Início");
        setSize(460, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        lblCabecalho = new JLabel("Sistema de Atendimento Médico");
        lblCabecalho.setHorizontalAlignment(JLabel.CENTER);

        lblBoasVindas = new JLabel("Bem-vindo à clínica!");
        lblBoasVindas.setHorizontalAlignment(JLabel.CENTER);

        btnNovaConsulta = new JButton("Novo agendamento");

        JPanel painelSuperior = new JPanel(new BorderLayout());
        painelSuperior.add(lblCabecalho, BorderLayout.CENTER);

        JPanel painelCentro = new JPanel(new BorderLayout());
        painelCentro.add(lblBoasVindas, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel(new FlowLayout());
        painelInferior.add(btnNovaConsulta);

        add(painelSuperior, BorderLayout.NORTH);
        add(painelCentro, BorderLayout.CENTER);
        add(painelInferior, BorderLayout.SOUTH);

        btnNovaConsulta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                TelaAgendamento novaTela = new TelaAgendamento();
                novaTela.setVisible(true);

                dispose();
            }
        });
    }

    public static void main(String[] args) {

        TelaInicial inicio = new TelaInicial();
        inicio.setVisible(true);
    }
}
