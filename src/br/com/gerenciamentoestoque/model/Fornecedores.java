package br.com.gerenciamentoestoque.model;


public class Fornecedores extends Clientes{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}