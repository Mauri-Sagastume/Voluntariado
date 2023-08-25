package com.scys;

/* Importación de las librerías necesarias */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Definición de la clase Ventanueva que extiende de JFrame e implementa ActionListener */
public class Ventanueva extends JFrame implements ActionListener {
    JLabel la1, la2, la3;
    JTextField te1;
    JButton b1;
    JPasswordField Txtcon;
    String usuario, contra;
    FondoPanel fondo = new FondoPanel();

    public Ventanueva() {
        this.setContentPane(fondo);

        // Creación de la etiqueta "Iniciar"
        la1 = new JLabel("Iniciar ");
        la1.setBounds(420, 140, 220, 90);
        la1.setVisible(true);
        la1.setForeground(Color.white);
        la1.setFont(new Font("Arial", Font.PLAIN, 60));
        this.add(la1);

        // Creación de la etiqueta "Código:"
        la2 = new JLabel("Código:");
        la2.setBounds(50, 230, 100, 40);
        la2.setVisible(true);
        la2.setForeground(Color.white);
        la2.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(la2);

        // Creación del campo de texto para el código
        te1 = new JTextField();
        te1.setBounds(200, 230, 300, 50);
        te1.setVisible(true);
        te1.setForeground(Color.black);
        te1.setFont(new Font("Arial", Font.PLAIN, 40));
        this.add(te1);

        // Creación de la etiqueta "Contraseña:"
        la3 = new JLabel("Contraseña:");
        la3.setBounds(50, 335, 150, 40);
        la3.setVisible(true);
        la3.setForeground(Color.white);
        la3.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(la3);

        // Creación del campo de contraseña
        Txtcon = new JPasswordField();
        Txtcon.setBounds(200, 330, 300, 50);
        Txtcon.setVisible(true);
        Txtcon.setFont(new Font("Arial", Font.PLAIN, 40));
        this.add(Txtcon);

        // Creación del botón "Iniciar Sesión"
        b1 = new JButton("Iniciar Sesión");
        b1.setBounds(250, 400, 300, 50);
        b1.setVisible(true);
        b1.addActionListener(this);
        this.add(b1);

        // Configuración de la ventana
        this.setTitle("Proyecto1 - Módulo de Autenticación");
        this.setBounds(100, 100, 1000, 500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            usuario = te1.getText();
            contra = Txtcon.getText();
            if (usuario.equals("admin")) {
                if (contra.equals("admin")) {
                    JOptionPane.showMessageDialog(this, "Bienvenido Admin al sistema.");
                    Venprin prin = new Venprin();
                    this.dispose();
                    System.out.println("El usuario administrador ingreso al sistema correctamente");
                }
            }
            /* En esta parte se tiene que validar al profesor o alumno */
        }
    }

    /* Clase interna FondoPanel que extiende JPanel para mostrar imágenes de fondo */
    class FondoPanel extends JPanel {
        private Image imagen, imagen2;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/images.jpg")).getImage();
            imagen2 = new ImageIcon(getClass().getResource("/imagenes/principal.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(imagen2, 70, 20, 800, 130, this);
            setOpaque(false);
            super.paint(g);
        }
    }
}

