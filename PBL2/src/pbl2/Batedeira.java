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
public class Batedeira extends Eletrodomestico implements Helicoidal{
    private int quanthelice1;
    private double calcMedia;

    public double getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(double calcMedia) {
        this.calcMedia = calcMedia;
    }
    

    public int getQuanthelice1() {
        return quanthelice1;
    }

    public void setQuanthelice1(int quanthelice1) {
        this.quanthelice1 = quanthelice1;
    }
    @Override
    public double calcDesc(int mes){
        if(mes==12){
            this.preco=this.preco*0.8;
        }
        return 0.0;
    }
    @Override
    public void calcMediaLitro(double quant, double capacidade){
       this.calcMedia=quant/(quanthelice1*capacidade);
    }
    
}
