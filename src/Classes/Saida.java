/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author izabe
 */
public class Saida {
    
    private String metodo;
    private String valordeM;
    private String valordeN;
    private String colisoes;
   

    
    /**
     * Construtor vazio da classe Saida
     */
    public Saida(){
        
    }
    
    
    public Saida (String metodo, int valordeM, int valordeN,int colisoes){
        
        this.metodo = metodo;
        this.valordeM = Integer.toString(valordeM);
        this.valordeN = Integer.toString(valordeN);
        this.colisoes = Integer.toString(colisoes);      
        
    }

    /**
     * @return the metodo
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * @return the valordeM
     */
    public String getValordeM() {
        return valordeM;
    }

    /**
     * @return the colisoes
     */
    public String getColisoes() {
        return colisoes;
    }

    /**
     * @return the valordeN
     */
    public String getValordeN() {
        return valordeN;
    }
    
    

    
    
    

}
