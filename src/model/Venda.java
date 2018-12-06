package model;

import java.io.Serializable;
import java.util.Date;

public class Venda implements Serializable{

    private int vdaId;

    private Date data;

    private int formaPag;

    private int situacao;

    public Venda() {
    }

    public int getVdaId() {
        return vdaId;
    }

    public void setVdaId(int vdaId) {
        this.vdaId = vdaId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(int formaPag) {
        this.formaPag = formaPag;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.vdaId;
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
        final Venda other = (Venda) obj;
        if (this.vdaId != other.vdaId) {
            return false;
        }
        return true;
    }
    
}
