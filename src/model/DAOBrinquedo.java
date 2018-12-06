/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Dell
 */
public class DAOBrinquedo {
    
    
    public List<Brinquedo> getLista(){
            return Dados.listaBrinquedo;
    }
    
    public boolean salvar(Brinquedo obj){
        if (obj.getCodigo() == 0){
            Integer codigo = Dados.listaBrinquedo.size() +1;
            obj.setCodigo(codigo);
            Dados.listaBrinquedo.add(obj);
        }
        return true;
    }
    
    public boolean remover(Brinquedo obj){
        Dados.listaBrinquedo.remove(obj);
        return true;
    }
    
}
