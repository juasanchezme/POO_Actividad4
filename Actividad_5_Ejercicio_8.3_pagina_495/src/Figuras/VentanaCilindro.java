// Clase: VentanaCilindro
package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Esta clase denominada VentanaCilindro define una ventana para
 * ingresar los datos de un cilindro y calcular su volumen y superficie.
 * @version 1.2/2020
 */
public class VentanaCilindro extends JFrame implements ActionListener {
    // Un contenedor de elementos graficos
    private Container contenedor;
    // Etiquetas estaticas para identificar los campos de texto a ingresar y calcular
    private JLabel radio, altura, volumen, superficie;
    // Campos de texto a ingresar
    private JTextField campoRadio, campoAltura;
    // Boton para realizar los calculos numericos
    private JButton calcular;

    /**
     * Constructor de la clase VentanaCilindro
     */
    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro"); // Establece el titulo de la ventana
        setSize(280, 210); // Establece el tamano de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setResizable(false); // Establece que el boton de cerrar permitira salir de la aplicacion
    }

    /**
     * Metodo que crea la ventana con sus diferentes componentes graficos
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el contenedor no tiene un layout

        // Establece la etiqueta y campo de texto para el radio del cilindro
        radio = new JLabel();
        radio.setText("Radio (cms):");
        radio.setBounds(20, 20, 135, 23); // Establece la posicion de la etiqueta de radio del cilindro

        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23); // Establece la posicion del campo de texto de radio del cilindro

        // Establece la etiqueta y campo de texto para la altura del cilindro
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23); // Establece la posicion de la etiqueta de altura del cilindro

        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23); // Establece la posicion del campo de texto de altura del cilindro

        // Establece el boton para calcular el volumen y superficie del cilindro
        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(100, 80, 135, 23); // Establece la posicion del boton calcular

        // Agrega al boton un ActionListener para que gestione eventos del boton
        calcular.addActionListener(this);

        // Establece la etiqueta y el valor del volumen del cilindro
        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 110, 135, 23); // Establece la posicion de la etiqueta volumen del cilindro

        // Establece la etiqueta y el valor de la superficie del cilindro
        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 140, 135, 23); // Establece la posicion de la etiqueta superficie del cilindro

        // Se adicionan los campos de texto, etiquetas y boton al contenedor de la ventana
        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    /**
     * Metodo que gestionara los eventos de los componentes graficos
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            // Se obtiene el radio y la altura desde los campos de texto ingresados
            double radio = Double.parseDouble(campoRadio.getText());
            double altura = Double.parseDouble(campoAltura.getText());

            // Creacion de un objeto de la clase Cilindro
            Cilindro cilindro = new Cilindro(radio, altura);

            // Mostrar el volumen del cilindro en el ultimo campo de texto
            volumen.setText("Volumen (cm3): " + String.format("%.2f", cilindro.getVolumen()));

            // Mostrar la superficie del cilindro en el ultimo campo de texto
            superficie.setText("Superficie (cm2): " + String.format("%.2f", cilindro.getSuperficie()));
        }
    }
}