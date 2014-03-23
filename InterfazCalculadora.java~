import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class InterfazCalculadora
{
    /** La ventana */
    private JFrame ventana;
    
    /** El botón */
    private JButton boton_suma, boton_resta, boton_multiplicacion, boton_division, boton_resetear;
    
    /** El campo de texto */
    private JTextField entrada_operador_1, entrada_operador_2, resultado;
    private JLabel operador;

    private Calculadora calculadora;

    public InterfazCalculadora()
    {
        // Nueva ventana. Se el pone un FlowLayout para que el botón y campo
        // de texto quede alineados.
  
        calculadora = new Calculadora();
        ventana = new JFrame("Calculadora Java - JNI - C");

  
        ventana.setSize(800, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        entrada_operador_1 = new JTextField(20);
        entrada_operador_1.setSize(150,20);
        entrada_operador_1.setLocation(100,100);
        ventana.getContentPane().add(entrada_operador_1);

        entrada_operador_2 = new JTextField(20);
        entrada_operador_2.setSize(150,20);
        entrada_operador_2.setLocation(325,100);
        ventana.getContentPane().add(entrada_operador_2);

        resultado = new JTextField(20);
        resultado.setSize(100,20);
        resultado.setLocation(600,100);
        ventana.getContentPane().add(resultado);

        operador = new JLabel("Op");
        operador.setSize(50,20);
        operador.setLocation(275,100);
        ventana.getContentPane().add(operador);


        boton_suma = new JButton("+");
        boton_suma.setSize(100,25);
        boton_suma.setLocation(100,200);
        ventana.getContentPane().add(boton_suma);

        boton_suma.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                double res = calculadora.Sumar(Double.parseDouble(entrada_operador_1.getText().toString()), Double.parseDouble(entrada_operador_2.getText().toString()));
                resultado.setText(Double.toString(res));
                operador.setText ("+");
        }});


        boton_resta = new JButton("-");
        boton_resta.setSize(100,25);
        boton_resta.setLocation(225,200);
        ventana.getContentPane().add(boton_resta);

        boton_resta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                double res = calculadora.Restar(Double.parseDouble(entrada_operador_1.getText().toString()), Double.parseDouble(entrada_operador_2.getText().toString()));
                resultado.setText(Double.toString(res));
                operador.setText ("-");
        }});



        boton_multiplicacion = new JButton("*");
        boton_multiplicacion.setSize(100,25);
        boton_multiplicacion.setLocation(350,200);
        ventana.getContentPane().add(boton_multiplicacion);

        boton_multiplicacion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                double res = calculadora.Multiplicar(Double.parseDouble(entrada_operador_1.getText().toString()), Double.parseDouble(entrada_operador_2.getText().toString()));
                resultado.setText(Double.toString(res));
                operador.setText ("*");
        }});


        boton_division = new JButton("/");
        boton_division.setSize(100,25);
        boton_division.setLocation(475,200);
        ventana.getContentPane().add(boton_division);

        boton_division.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                double res = calculadora.Dividir(Double.parseDouble(entrada_operador_1.getText().toString()), Double.parseDouble(entrada_operador_2.getText().toString()));
                resultado.setText(Double.toString(res));
                operador.setText ("/");
        }});


        boton_resetear = new JButton("Resetear");
        boton_resetear.setSize(100,25);
        boton_resetear.setLocation(600,200);
        ventana.getContentPane().add(boton_resetear);

        boton_resetear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                resultado.setText ("");
                operador.setText ("Op");
                entrada_operador_1.setText("");
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
