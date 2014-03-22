import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class InterfazCalculadora
{
    /** La ventana */
    private JFrame ventana;
    
    /** El botón */
    private JButton boton_suma, boton_resta, boton_multiplicacion, boton_division, boton_resetear;
    
    /** El campo de texto */
    private JTextField entrada_operador1, entrada_operador_2, resultado;
    private JLabel operador;

    public InterfazCalculadora()
    {
        // Nueva ventana. Se el pone un FlowLayout para que el botón y campo
        // de texto quede alineados.
        ventana = new JFrame("Calculadora Java - JNI - C");

  
        ventana.setSize(800, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        entrada_operador1 = new JTextField(20);
        entrada_operador1.setSize(100,20);
        entrada_operador1.setLocation(100,100);
        ventana.getContentPane().add(entrada_operador1);

        entrada_operador_2 = new JTextField(20);
        entrada_operador_2.setSize(100,20);
        entrada_operador_2.setLocation(400,100);
        ventana.getContentPane().add(entrada_operador_2);

        resultado = new JTextField(20);
        resultado.setSize(100,20);
        resultado.setLocation(600,100);
        ventana.getContentPane().add(resultado);

        operador = new JLabel("Operador");
        operador.setSize(50,20);
        operador.setLocation(200,100);
        ventana.getContentPane().add(operador);


        boton_suma = new JButton("+");
        boton_suma.setSize(100,25);
        boton_suma.setLocation(100,200);
        ventana.getContentPane().add(boton_suma);

        boton_suma.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("Hola mundo");
                operador.setText ("+");
        }});


        boton_resta = new JButton("-");
        boton_resta.setSize(100,25);
        boton_resta.setLocation(200,200);
        ventana.getContentPane().add(boton_resta);

        boton_resta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("Hola mundo2");
                operador.setText ("-");
        }});



        boton_multiplicacion = new JButton("*");
        boton_multiplicacion.setSize(100,25);
        boton_multiplicacion.setLocation(300,200);
        ventana.getContentPane().add(boton_multiplicacion);

        boton_multiplicacion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("Hola mundo3");
                operador.setText ("*");
        }});


        boton_division = new JButton("/");
        boton_division.setSize(100,25);
        boton_division.setLocation(400,200);
        ventana.getContentPane().add(boton_division);

        boton_division.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("Hola mundo4");
                operador.setText ("/");
        }});


        boton_resetear = new JButton("Resetear");
        boton_resetear.setSize(100,25);
        boton_resetear.setLocation(500,200);
        ventana.getContentPane().add(boton_resetear);

        boton_resetear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("");
                operador.setText ("operador");
                entrada_operador1.setText("");
                entrada_operador_2.setText("");
        }});




        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);   

    }


    /** 
     * Crea una instancia de HolaMundoSwing
     * @param args
     */
    public static void main(String [] args)
    {
        new InterfazCalculadora();
        new Calculadora();
    }

}
