/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Poeta;
public interface poetaDao {
    
    public void insertarpoeta (Poeta poeta);
    public void modificarpoeta (Poeta poeta);
    public void eliminarpoeta(Poeta poeta);
    public List<Poeta> mostrarpoeta();
    
}
