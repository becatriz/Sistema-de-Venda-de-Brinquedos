
package model;

import java.io.Serializable;


        

public class Cliente extends Pessoa implements Serializable   {

	private int cliId;

	private Brinquedo[] brinquedo;

	private Venda[] venda;

	public void realizarCompra(Brinquedo Produtos) {

	}

    public Cliente() {
    }

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public Brinquedo[] getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(Brinquedo[] brinquedo) {
        this.brinquedo = brinquedo;
    }

    public Venda[] getVenda() {
        return venda;
    }

    public void setVenda(Venda[] venda) {
        this.venda = venda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cliId;
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
        final Cliente other = (Cliente) obj;
        if (this.cliId != other.cliId) {
            return false;
        }
        return true;
    }
    
    

}
