
package br.gov.sp.cps.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.gov.sp.cps.aulaForm.TelaInicial;

public class ConsultaController {

    private JTextField txtPaciente;
    private JTextField txtArea;
    private JFrame janela;

    public ConsultaController(JTextField txtPaciente,
            JTextField txtArea, JFrame janela) {

        this.txtPaciente = txtPaciente;
        this.txtArea = txtArea;
        this.janela = janela;
    }

    public ActionListener acaoConfirmar() {

        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String paciente = txtPaciente.getText().trim();
                String area = txtArea.getText().trim();

                if (paciente.length() == 0 || area.length() == 0) {

                    JOptionPane.showMessageDialog(
                            janela,
                            "Informe o nome do paciente e a especialidade."
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            janela,
                            "Consulta registrada com sucesso!\n\n"
                            + "Nome: " + paciente
                            + "\nEspecialidade: " + area,
                            "Agendamento",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        };
    }

    public ActionListener acaoLimpar() {

        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                txtPaciente.setText("");
                txtArea.setText("");

                txtPaciente.requestFocusInWindow();
            }
        };
    }

    public ActionListener acaoVoltar() {

        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                TelaInicial inicio = new TelaInicial();
                inicio.setVisible(true);

                janela.dispose();
            }
        };
    }
}