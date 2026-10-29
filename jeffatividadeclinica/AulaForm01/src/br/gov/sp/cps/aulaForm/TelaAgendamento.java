
package br.gov.sp.cps.aulaForm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.gov.sp.cps.controllers.ConsultaController;

public class TelaAgendamento extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel lblTitulo;
    private JLabel lblPaciente;
    private JLabel lblArea;

    private JTextField txtPaciente;
    private JTextField txtArea;

    private JButton btnSalvar;
    private JButton btnApagar;
    private JButton btnRetornar;

    public TelaAgendamento() {

        setTitle("Cadastro de Consulta");
        setSize(520, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        lblTitulo = new JLabel("Agendamento Médico");
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);

        lblPaciente = new JLabel("Nome do paciente:");
        lblArea = new JLabel("Especialidade médica:");

        txtPaciente = new JTextField();
        txtArea = new JTextField();

        JPanel painelDados = new JPanel(
                new GridLayout(2, 2, 10, 15));

        painelDados.add(lblPaciente);
        painelDados.add(txtPaciente);
        painelDados.add(lblArea);
        painelDados.add(txtArea);

        btnSalvar = new JButton("Confirmar");
        btnApagar = new JButton("Limpar campos");
        btnRetornar = new JButton("Voltar ao início");

        JPanel painelAcoes = new JPanel(new FlowLayout());

        painelAcoes.add(btnSalvar);
        painelAcoes.add(btnApagar);
        painelAcoes.add(btnRetornar);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.add(painelDados, BorderLayout.CENTER);

        add(lblTitulo, BorderLayout.NORTH);
        add(painelPrincipal, BorderLayout.CENTER);
        add(painelAcoes, BorderLayout.SOUTH);

        ConsultaController controller = new ConsultaController(
                txtPaciente, txtArea, this);

        btnSalvar.addActionListener(controller.acaoConfirmar());
        btnApagar.addActionListener(controller.acaoLimpar());
        btnRetornar.addActionListener(controller.acaoVoltar());
    }
}
