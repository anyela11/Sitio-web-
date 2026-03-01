/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author wilchamer
 */
public class NumeroGanado {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("partido ganado:");
        int ganado = sc.nextInt();
        
        System.out.println("partido empatado:");
        int empatado = sc.nextInt();
        
        System.out.println("partido perdido:");
        int perdido = sc.nextInt();
        
        int puntaje =(ganado*3)+(empatado*1)+(perdido*0);
        
        System.out.println("puntaje total:"+ puntaje);
        
        
    }
    
}
