/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jaine
 */
public class Values implements Calcular {
    
    @Getter @Setter public double val1;
    @Getter @Setter public double val2;
    @Getter @Setter public double result;
    
    Values(){}

    public Values(double n1, double n2){
        this.val1 = n1;
        this.val2 = n2;
    }
    
    @Override
    public void Calcular() {
    }
    
}
