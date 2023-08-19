package com.example;

import java.util.Scanner;


public class Eleitor {
    public static void main(String[] args) {
    Pessoa cidadao = new Pessoa();
       System.out.println("Digite sua data de nascimento");
       Scanner scandata = new Scanner(System.in);
        cidadao.setdataNascimento(scandata.nextLine());
        scandata.close();
        System.out.println(cidadao.getdataNascimento());
    }
    

}
