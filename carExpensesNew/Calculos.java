class Calculos {

  public double Calculos_KM(double dist, double gas){

    double expense = dist/gas;
    return (expense);

  }

  public double Calculos_M(double dist, double gas){

    double expense = (dist * 0.001) / gas; 
    return (expense);

  }  
}
