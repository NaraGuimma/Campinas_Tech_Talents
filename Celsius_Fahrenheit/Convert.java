import java.util.Scanner;

class Convert {

  public double Celsius(double temp){

    return ((temp-32)/1.8);

  }

  public double Fahrenheit(double temp){
    return ((temp*1.8) + 32);
  }
}
