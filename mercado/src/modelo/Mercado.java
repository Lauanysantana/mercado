/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Mercado {
   private Double val_bolsa;
   private int nr_funci;
   private LocalDate fundacao;
   private String razao_social;
   private String nome_fan;

    public Double getVal_bolsa() {
        return val_bolsa;
    }

    public void setVal_bolsa(Double val_bolsa) {
        this.val_bolsa = val_bolsa;
    }

    public int getNr_funci() {
        return nr_funci;
    }

    public void setNr_funci(int nr_funci) {
        this.nr_funci = nr_funci;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fan() {
        return nome_fan;
    }

    public void setNome_fan(String nome_fan) {
        this.nome_fan = nome_fan;
    }

    @Override
    public String toString() {
        return "Mercado{" + "nome_fan=" + nome_fan + '}';
    }
   
}
