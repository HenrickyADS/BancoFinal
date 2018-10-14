package model.bean;

public class Extrato {

    private Long id;
    private String operacao;
    private Double valor;
    private Long idContaCorrente;
    private String CPF_Titular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getidContaCorrente() {
        return idContaCorrente;
    }

    public void setIdConta(Long idConta) {
        this.idContaCorrente = idConta;
    }

    public String getCPF_Titular() {
        return CPF_Titular;
    }

    public void setCPF_Titular(String cpfResponsavel) {
        this.CPF_Titular = cpfResponsavel;
    }



}
