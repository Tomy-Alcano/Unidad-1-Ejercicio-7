import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Ficha personal");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(500,400);
            ventana.setLocationRelativeTo(null);

            JPanel panelPrincipal = new JPanel(new BorderLayout());

            JPanel panelFormulario = new JPanel(new GridLayout(6,2,10,10));
            panelFormulario.setBorder(
                    BorderFactory.createEmptyBorder(15,15,15,15));

            JTextField textNombre = new JTextField();
            JTextField textFecha = new JTextField();

            JComboBox<String> Provincia =
                    new JComboBox<>(new String[]{
                            "Mendoza",
                            "San Juan",
                            "Córdoba",
                            "Buenos Aires",
                            "Santa Fe",
                            "Neuquén"
                    });

            JComboBox<String> Estudios =
                    new JComboBox<>(new String[]{
                            "Primario",
                            "Secundario",
                            "Terciario",
                            "Universitario",
                            "Posgrado"
                    });

            JRadioButton botSoltero = new JRadioButton("Soltero/a");
            JRadioButton botCasado = new JRadioButton("Casado/a");

            ButtonGroup grupoEstado = new ButtonGroup();
            grupoEstado.add(botSoltero);
            grupoEstado.add(botCasado);

            JPanel panelEstado = new JPanel();
            panelEstado.add(botSoltero);
            panelEstado.add(botCasado);

            JCheckBox checkHijos = new JCheckBox("¿Tiene Hijos?");
            checkHijos.setSelected(false);

            panelFormulario.add(new JLabel("Nombre completo:"));
            panelFormulario.add(textNombre);

            panelFormulario.add(new JLabel("Fecha de nacimiento:"));
            panelFormulario.add(textFecha);

            panelFormulario.add(new JLabel("Provincia:"));
            panelFormulario.add(Provincia);

            panelFormulario.add(new JLabel("Nivel de Estudios:"));
            panelFormulario.add(Estudios);

            panelFormulario.add(new JLabel(""));
            panelFormulario.add(checkHijos);

            JPanel panelBotones = new JPanel();
            panelBotones.add(new JButton("Guardar Ficha"));
            panelBotones.add(new JButton("Cancelar"));

            panelPrincipal.add(panelFormulario, BorderLayout.CENTER);
            panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

            ventana.add(panelPrincipal);
            ventana.setVisible(true);
        });

    }
}
