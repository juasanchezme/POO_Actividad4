package Figuras;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz grafica
 * que permitira consultar un menu principal con tres figuras geometricas.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    // Un contenedor de elementos graficos
    private Container contenedor;
    // Botones para seleccionar una figura geometrica determinada
    private JButton cilindro, esfera, piramide;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras"); // Establece el titulo de la ventana
        setSize(350, 160); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece que el boton de cerrar permitira salir de la aplicacion
    }

    /**
     * Metodo que crea la ventana con sus diferentes componentes graficos
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el contenedor no tiene un layout

        // Establece el boton del cilindro
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23); // Establece la posicion del boton del cilindro
        // Agrega al boton un ActionListener para que gestione eventos del boton
        cilindro.addActionListener(this);

        // Establece el boton de la esfera
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23); // Establece la posicion del boton de la esfera
        // Agrega al boton un ActionListener para que gestione eventos del boton
        esfera.addActionListener(this);

        // Establece el boton de la piramide
        piramide = new JButton();
        piramide.setText("Piramide");
        piramide.setBounds(225, 50, 100, 23); // Establece la posicion del boton de la piramide
        // Agrega al boton un ActionListener para que gestione eventos del boton
        piramide.addActionListener(this);

        // Se añade cada componente grafico al contenedor de la ventana
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }

    /**
     * Metodo que gestiona los eventos generados en la ventana principal
     */
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) { // Si se pulsa el boton esfera
            VentanaEsfera ventanaEsfera = new VentanaEsfera(); // Crea la ventana de la esfera
            ventanaEsfera.setVisible(true); // Establece que se visualice la ventana de la esfera
        }
        if (evento.getSource() == cilindro) { // Si se pulsa el boton cilindro
            VentanaCilindro ventanaCilindro = new VentanaCilindro(); // Crea la ventana del cilindro
            ventanaCilindro.setVisible(true); // Establece que se visualice la ventana del cilindro
        }
        if (evento.getSource() == piramide) { // Si se pulsa el boton piramide
            VentanaPiramide ventanaPiramide = new VentanaPiramide(); // Crea la ventana de la piramide
            ventanaPiramide.setVisible(true); // Establece que se visualice la ventana de la piramide
        }
    }
}
