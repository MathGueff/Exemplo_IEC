/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_iec;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Exemplo_IEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número 1");
        var n1 = sc.nextInt();
        System.out.println("Digite um número 2");
        var n2 = sc.nextInt();
        System.out.println("Digite a operacaaaaaaaaao");
        var operacao = sc.next();
        if(operacao.equals("+")){
            System.out.println("O resultado é: " + n1 + n2);
        }
        else{
            System.out.println("O resultado é: " + (n1 - n2));
        }
    }
}
    
