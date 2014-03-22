class Calculadora{

  private native double SumaC(double operador_1, double operador_2);
  private native double RestaC(double operador_1, double operador_2);
  private native double MultiplicacionC(double operador_1, double operador_2);
  private native double DivisionC(double operador_1, double operador_2);


  public double Sumar(double operador_1, double operador_2){
    return SumaC(operador_1, operador_2);
  }
 
  public double Restar(double operador_1, double operador_2){
    return RestaC(operador_1, operador_2);
  }

  public double Multiplicar(double operador_1, double operador_2){
    return MultiplicacionC(operador_1, operador_2);
  }

  public double Dividir(double operador_1, double operador_2){
    return DivisionC(operador_1, operador_2);
  }
  static {
    System.loadLibrary("Calculadora");
  }
}