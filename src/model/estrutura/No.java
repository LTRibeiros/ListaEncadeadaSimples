/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.estrutura;

/**
 *
 * @author Particular
 */
public class No <T>{
    
    private T valor;
    private No<T> proximo;
    
    public No(T valor) {
        this.proximo = null;
        this.valor = valor;
    }
    
    public No(T valor, No<T> proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }
    
    public T getValor() {
        return valor;
}
    public void setValor() {
        this.valor = valor;
    }
    
    public No<T> getProximo() {
        return proximo;  
    }
    
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    public String toString() {
        return valor.toString();
    }
}
