/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.List;
import model.Poema;
/**
 *
 * @author Usuario1
 */
public interface poemaDao {
    public void insertarpoema (Poema poema);
    public void modificarpoema (Poema poema);
    public void eliminarpoema(Poema poema);
    public List<Poema> mostrarpoema();
    
}
