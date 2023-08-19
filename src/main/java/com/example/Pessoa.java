package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private LocalDate dataNascimento;

    public LocalDate getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(String dataNascimento) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd. MMM. YYYY");
        LocalDate x = LocalDate.parse(dataNascimento, dtf);
        this.dataNascimento = x;
    }

    public int idade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String eleitor() {
        String a;
        if (this.idade() < 16) {
            a = "Não é um eleitor";
        } else if (this.idade() > 17 && this.idade() < 71) {
            a = "Eleitor obrigatório";
        } else {
            a = "Eleitor facultativo";
        }
        return a;
    }

}
