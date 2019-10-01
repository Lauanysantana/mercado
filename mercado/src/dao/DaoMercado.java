/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Mercado;
import java.sql.Date;
/**
 *
 * @author Administrador
 */
public class DaoMercado {
    public static boolean inserir(Mercado objeto) {
        String sql = "INSERT INTO mercado (valor_bolsa, nr_funci, fundacao, razao_social, nome_fanta) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getNr_funci());
            ps.setString(2, objeto.getRazao_social());
            ps.setDate(3, Date.valueOf(objeto.getFundacao()));
            ps.setDouble(4, objeto.getVal_bolsa());
            ps.setString(5, objeto.getNome_fan());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean alterar(Mercado objeto) {
        String sql = "UPDATE produto SET nome_fan = ?, valor_bolsa = ?, nr_funci = ?, razao_social = ?, fundacao = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            objeto.setVal_bolsa(Integer.parseInt(man.jtfvalor_bolsa.getText())); 
            ps.setString(2, objeto.getDescricao());
            ps.setInt(3, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
