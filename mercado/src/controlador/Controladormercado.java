/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoMercado;
import javax.swing.JOptionPane;
import modelo.Mercado;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import tela.manutencao.ManutencaoMercado;

/**
 *
 * @author Administrador
 */
public class Controladormercado {

    public static void inserir(ManutencaoMercado man){
        Mercado objeto = new Mercado();
       objeto.setVal_bolsa(Double.parseDouble(man.jtfvalor_bolsa.getText()));
       objeto.setNome_fan(man.jtfnome_fan.getText());
       objeto.setFundacao(LocalDate.parse(man.jtffundacao.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       objeto.setRazao_social(man.jtfrazao_social.getText());
       objeto.setNr_funci(Integer.parseInt(man.jtfnr_funci.getText()));
        boolean resultado = DaoMercado.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoMercado aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

