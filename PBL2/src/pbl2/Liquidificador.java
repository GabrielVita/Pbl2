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
public class Liquidificador extends Eletrodomestico implements Helicoidal {
    private Tampa tampinha;
    private int quanthelice;
    private double formula;

    public double getFormula() {
        return formula;
    }

    public void setFormula(double formula) {
        this.formula = formula;
    }

    public int getQuanthelice() {
        return quanthelice;
    }

    public void setQuanthelice(int quanthelice) {
        this.quanthelice = quanthelice;
    }

    public Tampa getTampinha() {
        return tampinha;
    }

    public void setTampinha(Tampa tampinha) {
        this.tampinha = tampinha;
    }
   @Override
    public double calcDesc(int mes){
        if(mes==8){
            this.preco=this.preco*0.9;
        }
        return 0.0;
    }
    @Override
    public void calcMediaLitro(double quant, double capacidade){
       this.formula=quant/capacidade;
    }
}
