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
public class Adicao extends Values {

    public Adicao(double n1, double n2) {
        super(n1,n2);
    }

    Adicao(){}
    @Override
    public void Calcular() {
       setResult(getVal1() + getVal2());    }
    
    
}
