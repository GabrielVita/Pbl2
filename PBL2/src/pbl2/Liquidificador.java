/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

/**
 *
 * @author ANGELO
 */
public class Liquidificador extends Eletrodomestico {
    private Tampa tampinha;

    public Tampa getTampinha() {
        return tampinha;
    }

    public void setTampinha(Tampa tampinha) {
        this.tampinha = tampinha;
    }
    public void desconto10(){
        this.preco=this.preco*0.9;
    }
}
