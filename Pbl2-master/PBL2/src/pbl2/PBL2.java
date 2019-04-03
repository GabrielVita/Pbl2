/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl2;

import javax.swing.JOptionPane;

/**
 *
 * @author ANGELO
 */
public class PBL2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        @SuppressWarnings("empty-statement")
        Liquidificador liquid = new Liquidificador();
        Tampa tamp = new Tampa();
        Batedeira bat = new Batedeira();
        FerroDePassar ferro = new FerroDePassar();
        
        if(JOptionPane.showInputDialog("Escolha: \n\n\n Loja \n Fabrica").equals("Loja")){
            liquid.setMarca(JOptionPane.showInputDialog("\nQual a marca do seu liquidificador?:"));
            liquid.setPreco(Double.parseDouble(JOptionPane.showInputDialog("\nQual o preço do seu liquidificador?")));
            while(!liquid.validVoltagem(Integer.parseInt(JOptionPane.showInputDialog("\nQual a voltagem do seu liquidificador?"))));
            tamp.setCor("\nQual a cor da tampado seu liquidificador?:");
            tamp.setDescricao("\nQual a descrição do seuliquidificador?");
            liquid.setTampinha(tamp);
            liquid.calcDesc(Integer.parseInt(JOptionPane.showInputDialog("\nQual o mês da compra?")));
            liquid.calcMediaLitro(25, 5);
            
            bat.setMarca(JOptionPane.showInputDialog("\nQual a marca da sua batedeira?:"));
            bat.setPreco(Double.parseDouble(JOptionPane.showInputDialog("\nQual o preço da sua batedeira?")));
            while(!bat.validVoltagem(Integer.parseInt(JOptionPane.showInputDialog("\nQual a voltagem da sua batedeira?"))));
            bat.setQuanthelice1(Integer.parseInt("\nQuantas hélices sua batedeira tem?"));
            liquid.calcDesc(Integer.parseInt(JOptionPane.showInputDialog("\nQual o mês da compra?")));
            liquid.calcMediaLitro(12, 5);
            
            ferro.setMarca(JOptionPane.showInputDialog("\nQual a marca da seu ferro?:"));
            ferro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("\nQual o preço da seu ferro?")));
            while(!ferro.validVoltagem(Integer.parseInt(JOptionPane.showInputDialog("\nQual a voltagem da seu ferro?"))));
            ferro.calcDesc(Integer.parseInt(JOptionPane.showInputDialog("\nQual o mês da compra?")));
      
        }
        JOptionPane.showMessageDialog(null,"Informação\n\n" + "Ferro:\n" + "Marca:\n" + ferro.getMarca() + "Preço:\n" + ferro.getPreco() + "Voltagem:\n" + ferro.getVoltagem() + "_______________________________________" + 
                "Batedeira:\n" + "Marca:\n" + bat.getMarca() + "Preço:\n" + bat.getPreco() + "Voltagem:\n" + bat.getVoltagem() + "Calculo:\n" + bat.getCalcMedia() + "_______________________________________" +
                "Liquidificador:\n" + "Marca:\n" + liquid.getMarca() + "Preço:\n" + liquid.getPreco() + "Voltagem:\n" + liquid.getVoltagem() + "Calculo:\n" + liquid.getFormula());
        
    }
    }
    
