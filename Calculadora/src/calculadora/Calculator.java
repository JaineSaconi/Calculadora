/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.security.InvalidParameterException;

/**
 *
 * @author jaine
 */
public class Calculator {
    
  public void calculate(Calcular calcular){
      if(calcular == null){
          throw new InvalidParameterException("Nao e possivel calcular");
      }
      
      calcular.Calcular();
  }
    
}
