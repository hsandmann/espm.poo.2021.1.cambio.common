package br.espm.poo.cambio.common.datatype;

import java.util.Date;

public class Cotacao {

    private String id;
    private Moeda moeda;
    private Double valor;
    private Date data;

    public String getId() {
        return id;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public Double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
