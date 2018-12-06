package model;

import java.io.Serializable;

public class Brinquedo implements Serializable {
    
    
    //Atributos
    private int codigo;

    private String descricao;

    private double preco;

    private Brinquedo brinquedo;

  
    //Construtor
    public Brinquedo() {
    }
    
    
    //Metodos acessores
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Brinquedo getBrinquedo() {
        return brinquedo;
    }
    
      public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setBrinquedo(Brinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }
    
    
    //Identificar a chave primaria
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Brinquedo other = (Brinquedo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

}
