package model.bean;

public class Extrato {

    
    private String operacao;
    private Double valor;
    private String CPFTitular;
    private Long   idContaCorrente;

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCPFTitular() {
        return CPFTitular;
    }

    public void setCPFTitular(String CPFTitular) {
        this.CPFTitular = CPFTitular;
    }

    public Long getIdContaCorrente() {
        return idContaCorrente;
    }

    public void setIdContaCorrente(Long idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }
    
    
    

}