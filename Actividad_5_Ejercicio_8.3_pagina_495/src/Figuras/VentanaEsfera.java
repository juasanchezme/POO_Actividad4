package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase denominada VentanaEsfera define una ventana para
 * ingresar los datos de una esfera y calcular su volumen y superficie.
 * @version 1.2/2020
 */
public class VentanaEsfera extends JFrame implements ActionListener {
    // Un contenedor de elementos graficos
    private Container contenedor;
    /* Etiquetas estaticas para identificar los campos de texto a ingresar
    y calcular */
    private JLabel radio, volumen, superficie;
    private JTextField campoRadio; // Campo de texto a ingresar
    private JButton calcular; // Boton para realizar los calculos numericos

    /**
     * Constructor de la clase VentanaEsfera
     */
    public VentanaEsfera() {
        inicio();
        setTitle("Esfera"); // Establece el titulo de la ventana
        setSize(280, 200); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setResizable(false); // Establece que el boton de cerrar permitira salir de la aplicacion
    }

    /**
     * Metodo que crea la ventana con sus diferentes componentes graficos
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el contenedor no tiene un layout

        // Establece la etiqueta y campo de texto para el radio de la esfera
        radio = new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20, 20, 135, 23); // Establece la posicion de la etiqueta de radio de la esfera

        campoRadio = new JTextField();
        // Establece la posicion del campo de texto de radio de la esfera
        campoRadio.setBounds(100, 20, 135, 23);

        // Establece el boton para calcular el volumen y superficie de la esfera
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 50, 135, 23); // Establece la posicion del boton calcular

        // Agrega al boton un ActionListener para que gestione eventos del boton
        calcular.addActionListener(this);

        // Establece la etiqueta y el valor del volumen de la esfera
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        // Establece la posicion de la etiqueta de volumen de la esfera
        volumen.setBounds(20, 90, 135, 23);

        // Establece la etiqueta y el valor de la superficie de la esfera
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        // Establece la posicion de la etiqueta de superficie de la esfera
        superficie.setBounds(20, 120, 135, 23);

        // Se añade cada componente grafico al contenedor de la ventana
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    /**
     * Metodo que gestiona los eventos generados en la ventana de la
     * esfera
     * @throws Exception Excepcion al ingresar un campo nulo o
     * error en formato de numero
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) { // Si se pulsa el boton Calcular
            boolean error = false;
            try {
                // Se obtiene y convierte el valor numerico del radio
                double radio = Double.parseDouble(campoRadio.getText());
                Esfera esfera = new Esfera(radio); // Se crea un objeto Esfera

                // Se muestra el volumen
                volumen.setText("Volumen (cm3): " + String.format("%.2f", esfera.calcularVolumen()));

                // Se muestra la superficie
                superficie.setText("Superficie (cm2): " + String.format("%.2f", esfera.calcularSuperficie()));
            } catch (Exception e) {
                error = true; // Si ocurre una excepcion
            } finally {
                if (error) { // Si ocurre una excepcion, se muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
