package br.edu.ifpb.core.domain.produto;


import java.math.BigDecimal;
import java.util.Objects;

public class Produto {
    private int id;
    private String descricao;
    private BigDecimal valor;

    public Produto(int id, String descricao, BigDecimal valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return id == produto.id && descricao.equals(produto.descricao) && valor.equals(produto.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, valor);
    }
}
