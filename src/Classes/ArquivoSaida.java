/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author izabe
 */
public class ArquivoSaida {
    ArrayList<Saida> saidas = new ArrayList<>();
    private Formatter arquivo;
    
  
    private void abrir() {
        try {
            arquivo = new Formatter("saida.txt");
        }
        catch( SecurityException semPermissao) {
            System.err.println(" Sem permissao para escrever no arquivo ");
            System.exit(1); //exit(0) é sucesso, outro número significa que terminou com problemas
        }
        catch( FileNotFoundException arquivoInexistente ) {
            System.err.println(" Arquivo inexistente ou arquivo não pode ser criado");
            System.exit(1);
        }
    } 
    
    public ArquivoSaida(){
        
    }
    
    
    public void addSaida(Saida nSaida){
        saidas.add(nSaida);
    }
    
    public void gravaSaidas(){
        abrir();
        try {
            System.out.println("grava saida");
            arquivo.format("Metodo, Valor de M, Valor de N, Colisões,\n");
            for (int j=0; j<saidas.size(); j++){
            arquivo.format("%s, %s, %s, %s,\n",saidas.get(j).getMetodo(),saidas.get(j).getValordeM(),saidas.get(j).getValordeN(),saidas.get(j).getColisoes());
            }
            arquivo.close();
        }
        catch(FormatterClosedException formatoDesconhecido) {
            System.err.println("Erro ao escrever");
            return;
        }
        catch(NoSuchElementException excecaoElemento){
            System.err.println("Entrada invalida. Por exemplo, era pra ser uma string, mas foi um inteiro");
        }
    }
    
    public void fechar(){
        arquivo.close();
    }
    
}
