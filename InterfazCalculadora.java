import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane; 

// Clase que impleta una interfaz grafica para utilizar una calculadora sencilla (+, - , *, /)
public class InterfazCalculadora
{
    // Definicion de los componentes para la interfaz
    private JFrame ventana;
    private JButton boton_suma, boton_resta, boton_multiplicacion, boton_division, boton_resetear;
    private JTextField entrada_operador_1, entrada_operador_2, resultado;
    private JLabel operador, titulo, texto_igual;
    private double operador_1, operador_2, resul;

    // Creacion del Objeto calculadora, esta clase esta escrita en java, pero utiliza metodos nativos del Lenguaje C
    private Calculadora calculadora;

    // Constructor de la clase
    public InterfazCalculadora()
    {
        // Inicializacion de la clase calculadora
        calculadora = new Calculadora();

        // Creacion de la ventana y sus propiedades
        ventana = new JFrame("Calculadora Java - JNI - C");
        ventana.setSize(800, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        titulo = new JLabel("Calculadora Basica: Java - JNI - C");
        titulo.setSize(250,20);
        titulo.setLocation(275,50);
        ventana.getContentPane().add(titulo);

        entrada_operador_1 = new JTextField(20);
        entrada_operador_1.setSize(150,20);
        entrada_operador_1.setLocation(100,100);
        ventana.getContentPane().add(entrada_operador_1);

        operador = new JLabel("Op");
        operador.setSize(50,20);
        operador.setLocation(275,100);
        ventana.getContentPane().add(operador);

        entrada_operador_2 = new JTextField(20);
        entrada_operador_2.setSize(150,20);
        entrada_operador_2.setLocation(325,100);
        ventana.getContentPane().add(entrada_operador_2);

        texto_igual = new JLabel("  =");
        texto_igual.setSize(25,20);
        texto_igual.setLocation(500,100);
        ventana.getContentPane().add(texto_igual);

        resultado = new JTextField(20);
        resultado.setSize(150,20);
        resultado.setLocation(550,100);
        ventana.getContentPane().add(resultado);

        BotonSuma();
        BotonResta();
        BotonMultiplicacion();
        BotonDivision();
        BotonResetear();
  
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);   
    }


    private void BotonSuma()
    {
        // Boton para la operacion suma
        boton_suma = new JButton("+");
        boton_suma.setSize(100,25);
        boton_suma.setLocation(100,200);
        ventana.getContentPane().add(boton_suma);

        boton_suma.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            if(ValidadEntradas())
            {
                resul = calculadora.Sumar(Operador1(), Operador2());
                resultado.setText(Double.toString(resul));
                operador.setText("+");
            }
        }});
    }

    private void BotonResta()
    {
        // Boton para la operacion resta
        boton_resta = new JButton("-");
        boton_resta.setSize(100,25);
        boton_resta.setLocation(225,200);
        ventana.getContentPane().add(boton_resta);

        boton_resta.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            if(ValidadEntradas())
            {
                resul = calculadora.Restar(Operador1(), Operador2());
                resultado.setText(Double.toString(resul));
                operador.setText("-");
            }
        }});
    }


    private void BotonMultiplicacion()
    {
        // Boton para la operacion multiplicacion
        boton_multiplicacion = new JButton("*");
        boton_multiplicacion.setSize(100,25);
        boton_multiplicacion.setLocation(350,200);
        ventana.getContentPane().add(boton_multiplicacion);

        boton_multiplicacion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            if(ValidadEntradas())
            {
                resul = calculadora.Multiplicar(Operador1(), Operador2());
                resultado.setText(Double.toString(resul));
                operador.setText("*");
            }
        }});
    }


    private void BotonDivision()
    {
        // Boton para la operacion division
        boton_division = new JButton("/");
        boton_division.setSize(100,25);
        boton_division.setLocation(475,200);
        ventana.getContentPane().add(boton_division);

        boton_division.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            if(ValidadEntradas())
            {
                resul = calculadora.Dividir(Operador1(), Operador2());
                resultado.setText(Double.toString(resul));
                operador.setText("/");
            }
        }});
    }


    private void BotonResetear()
    {
        // Boton para la operacion resetear
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
    }


    private double Operador1()
    { 
        return Double.parseDouble(entrada_operador_1.getText().toString());
    }


    private double Operador2()
    { 
        return Double.parseDouble(entrada_operador_2.getText().toString());
    }


    private boolean ValidadEntradas()
    {
      if(entrada_operador_1.getText().equals("") || entrada_operador_2.getText().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Se denen colocar los 2 operandos!", "Error", JOptionPane.ERROR_MESSAGE);
          return false;
      }
      else
        return true;
    }


    // Main Principal de la calculadora, Instancia la clase InterfazCalculadora
    public static void main(String [] args)
    {
        new InterfazCalculadora();
    }
}
