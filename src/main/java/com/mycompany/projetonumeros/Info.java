/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetonumeros;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Gutho
 */
public class Info {
    
    private List<Integer> lista;
    final int TAMANHO = 8;
    
    public Info(int[] valoresOrdenados){
       lista = new ArrayList<>();
        for (int i = 0; i < TAMANHO; i++){
           lista.add(valoresOrdenados[i]);
       }
    }
    
    public void deletar(){
        lista = new ArrayList<>();
    }
    
    // Retorna a posicao.
    // -1 Se não estiver
    public int achar(int valor){
        for (int i = 0; i < TAMANHO; i++){
            if (lista.get(i) == valor){
                return i;
            }
        }
        return -1;
    }
    
    public boolean esta(int valor){
        return lista.contains(valor);
    }
    
    
}   
