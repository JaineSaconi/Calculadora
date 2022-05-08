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
public class Divisao extends Values{

    public Divisao(double val1, double val2){
        super(val1,val2);
    }

    Divisao(){}
    @Override
    public void Calcular() {
        setResult(getVal1()/ getVal2());
    }
    
    
}