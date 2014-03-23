class Calculadora{

  // Definicion de los metodos nativos, estos estan implementados en el Lenguaje c, en el archivo Calculadora.c
  private native double SumaC(double operador_1, double operador_2);
  private native double RestaC(double operador_1, double operador_2);
  private native double MultiplicacionC(double operador_1, double operador_2);
  private native double DivisionC(double operador_1, double operador_2);


  // Metodo "Sumar" llama al metodo nativo "SumarC"
  public double Sumar(double operador_1, double operador_2){
    return SumaC(operador_1, operador_2);
  }
 

  // Metodo "Restar" llama al metodo nativo "RestarC"
  public double Restar(double operador_1, double operador_2){
    return RestaC(operador_1, operador_2);
  }


  // Metodo "Multiplicar" llama al metodo nativo "MultiplicarC"
  public double Multiplicar(double operador_1, double operador_2){
    return MultiplicacionC(operador_1, operador_2);
  }

  // Metodo "Dividir" llama al metodo nativo "DividirC"
  public double Dividir(double operador_1, double operador_2){
    return DivisionC(operador_1, operador_2);
  }
  static {
    System.loadLibrary("Calculadora");
  }
}
