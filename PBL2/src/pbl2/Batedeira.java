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
public class Batedeira extends Eletrodomestico{
    private int numhelice;
    private int quantL;

    public int getNumhelice() {
        return numhelice;
    }

    public void setNumhelice(int numhelice) {
        this.numhelice = numhelice;
    }
    
    public void desconto20(){
        this.preco=this.preco*0.8;
    }
}
