/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author izabe
 */
public class Entrada {
    
    private int m;
    private int n;
    private int s;
    private int[] vet;
    
    public Entrada(String nomeArquivo) throws FileNotFoundException{
        leArquivo(nomeArquivo);
    }
    
    private void leArquivo(String nomeArquivo) throws FileNotFoundException{
         FileInputStream entrada = new FileInputStream(nomeArquivo);
         InputStreamReader entradaFormatada = new InputStreamReader(entrada);
         BufferedReader entradaString = new BufferedReader(entradaFormatada);
         
        try {
            String linha;
            linha = entradaString.readLine();
            linha = linha.trim();
            
            System.out.println(linha);
           
            String[] mns = linha.split("#");
            System.out.println(mns.length);
  
            for (int i =0; i< mns.length; i++) 
                System.out.println(mns[i] + " - " + i); 
            
            this.m = Integer.parseInt(mns[1].trim());
            this.n = Integer.parseInt(mns[2].trim());
            this.s = Integer.parseInt(mns[3].trim());
            System.out.println(this.m + "m " +this.n + "n " + this.s + "s");
            
            this.vet = new int[this.n];
            
            try{
            for(int i=0; i<getN(); i++){
                linha = entradaString.readLine();
                String valor = "";
                for (int j=0; j<linha.length(); j++){
                    if (linha.charAt(j)!= '#'){
                        valor = valor + linha.charAt(j);
                    }
                }
                vet[i] = Integer.parseInt(valor);  
            }
            }catch (NullPointerException ex){
                System.out.println("Valor de N não condiz com quantidade de valores em entrada.txt!");
            }
   
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
             
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @return the s
     */
    public int getS() {
        return s;
    }

    /**
     * @return the vet
     */
    public int[] getVet() {
        return vet;
    }
    
    
    
}
