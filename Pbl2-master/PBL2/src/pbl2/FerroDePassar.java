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
public class FerroDePassar extends Eletrodomestico {
    
    @Override
    public double calcDesc(int mes){
        if(mes==5){
            this.preco=this.preco*0.85;
        }
        return 0.0;
    }
    @Override
    public boolean validVoltagem(int voltagem){
       switch(voltagem){
           case 110: 
               this.setVoltagem(voltagem);
               return true;
           case 220:
               this.setVoltagem(voltagem);
               return true;
           case 5:
               this.setVoltagem(voltagem);
               return true;
       }
       return false;
   }
}
