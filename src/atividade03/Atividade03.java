/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;
import Classes.*;
import java.io.FileNotFoundException;

/**
 *
 * @author izabe
 */
public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArquivoSaida arqSaida = new ArquivoSaida();
        try {
            
                 String nomeArquivo = "entrada.txt";
                 Entrada entrada = new Entrada(nomeArquivo);
            
                 if (entrada.getS() == 1){
                     TabelaHashLinear tHashL = new TabelaHashLinear(entrada.getM());
            
                     for (int j=0; j<entrada.getN();j++){
                         tHashL.insere(entrada.getVet()[j]);
                     }
               
                     Saida nSaida = new Saida("Endereçamento Aberto - Sondagem Linear",entrada.getM(),entrada.getN(),tHashL.getColisoes());
                     arqSaida.addSaida(nSaida);
                 } else if(entrada.getS() == 2){
                         TabelaHashDupla tHashD = new TabelaHashDupla(entrada.getM());
                         
                         for (int j=0; j<entrada.getN();j++){
                            tHashD.insere(entrada.getVet()[j]);
                         }
                         
                         Saida nSaida = new Saida("Endereçamento Aberto - Sondagem Dupla",entrada.getM(),entrada.getN(),tHashD.getColisoes());
                         arqSaida.addSaida(nSaida);
                     } else {
                         System.out.println("Valor de S não é válido!");
                     }
                 
             
            arqSaida.gravaSaidas();
            System.out.println("Arquivo Gravado!");
    
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
