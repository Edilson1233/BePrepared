package com.bbm.beprepared.model.enums;

public enum Severity {

    BAIXA("Baixa severidade, danos mínimos"),
    MODERADA("Severidade moderada, alguns danos"),
    ALTA("Alta severidade, danos significativos"),
    CATASTROFICA("Catástrofe, danos extremos e perda de vidas");

    private String descricao;

    Severity(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
