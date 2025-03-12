/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.estrutura.ListaEncadeadaSimples;
import model.estrutura.No;


/**
 *
 * @author FATEC ZONA LESTE
 */
public class ListaEncadeadaSimplesController {
    
    public String teste() throws Exception {
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        
        lista.append(1);
        lista.append(2);
        lista.append(3);
        
        lista.remove(2);
        
        return lista.toString();
    }
}
