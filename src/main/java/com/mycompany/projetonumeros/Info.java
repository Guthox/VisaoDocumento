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
    
    private static List<Integer> lista;
    private static final int TAMANHO = 8;
    private static int valor;
    
    
    public static void encher(int[] valoresOrdenados){
       lista = new ArrayList<>();
        for (int i = 0; i < TAMANHO; i++){
           lista.add(valoresOrdenados[i]);
       }
    }
    
    public static void deletar(){
        lista = new ArrayList<>();
    }
    
    // Retorna a posicao.
    // -1 Se não estiver
    public static int achar(int valor){
        for (int i = 0; i < TAMANHO; i++){
            if (lista.get(i) == valor){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean esta(int valor){
        return lista.contains(valor);
    }
    
    public static void guardarValor(int valorGuarda){
        valor = valorGuarda;
    }
    
    public static int pegarValor(){
        return valor;
    }

    
    
}   
