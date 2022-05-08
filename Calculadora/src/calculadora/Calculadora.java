
package calculadora;
import java.security.InvalidParameterException;
import java.util.Scanner;
/**
 *
 * @author jaine
 */
public class Calculadora {

      public void calculate( Calcular calcular){
          if(calcular == null){
              throw new InvalidParameterException("Erro");
          }
          
          calcular.Calcular();
       
    }
}
