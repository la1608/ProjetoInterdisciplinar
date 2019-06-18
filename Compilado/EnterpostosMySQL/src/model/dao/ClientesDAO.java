/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.mysql.jdbc.PreparedStatement;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mode.bean.Clientes;


/**
 *
 * @author serpa
 */
public class ClientesDAO {
    
    public void create(Clientes c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO cliente (RazaoSocial,NomeFantasia,Pessoa,CPF,CNPJ,InscricaoMunicipal,Referencia,Telefone,Email,Endereco,Cidade,Bairro,OrgaoPublico,Microempresa,InscricaoEstadual)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,c.getRazaoSocial());
            stmt.setString(2,c.getNomeFantasia());
            stmt.setString(3,c.getPessoa());
            stmt.setString(4,c.getCPF());
            stmt.setString(5,c.getCNPJ());
            stmt.setString(6,c.getInscricaoMunicipal());
            stmt.setString(7,c.getReferencia());
            stmt.setString(8,c.getTelefone());
            stmt.setString(9,c.getEmail());
            stmt.setString(10,c.getEndereco());
            stmt.setString(11,c.getCidade());
            stmt.setString(12,c.getBairro());
            stmt.setString(13,c.getOrgaoPublico());
            stmt.setString(14,c.getMicroempresa());
            stmt.setString(15,c.getInscricaoEstadual());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Clientes> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> cliente = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Clientes clientes = new Clientes();
                
                clientes.setCodigo(rs.getInt("codigo"));
                clientes.setRazaoSocial(rs.getString("RazaoSocial"));
                clientes.setNomeFantasia(rs.getString("NomeFantasia"));
                clientes.setPessoa(rs.getString("Pessoa"));
                clientes.setCPF(rs.getString("CPF"));
                clientes.setCNPJ(rs.getString("CNPJ"));
                clientes.setInscricaoMunicipal(rs.getString("InscricaoMunicipal"));
                clientes.setReferencia(rs.getString("Referencia"));
                clientes.setTelefone(rs.getString("Telefone"));
                clientes.setEmail(rs.getString("Email"));
                clientes.setEndereco(rs.getString("Endereco"));
                clientes.setCidade(rs.getString("Cidade"));
                clientes.setBairro(rs.getString("Bairro"));
                clientes.setOrgaoPublico(rs.getString("OrgaoPublico"));
                clientes.setMicroempresa(rs.getString("Microempresa"));
                clientes.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                cliente.add(clientes);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cliente;
    }
    
    
    public void update(Clientes c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE cliente SET RazaoSocial = ?,NomeFantasia = ?,Pessoa = ?,CPF = ?,CNPJ = ?,InscricaoMunicipal = ?,Referencia = ?,Telefone = ?,Email = ?,Endereco = ?,Cidade = ?,Bairro = ?,OrgaoPublico = ?,Microempresa = ?,InscricaoEstadual = ? WHERE codigo = ?");
            stmt.setString(1,c.getRazaoSocial());
            stmt.setString(2,c.getNomeFantasia());
            stmt.setString(3,c.getPessoa());
            stmt.setString(4,c.getCPF());
            stmt.setString(5,c.getCNPJ());
            stmt.setString(6,c.getInscricaoMunicipal());
            stmt.setString(7,c.getReferencia());
            stmt.setString(8,c.getTelefone());
            stmt.setString(9,c.getEmail());
            stmt.setString(10,c.getEndereco());
            stmt.setString(11,c.getCidade());
            stmt.setString(12,c.getBairro());
            stmt.setString(13,c.getOrgaoPublico());
            stmt.setString(14,c.getMicroempresa());
            stmt.setString(15,c.getInscricaoEstadual());
            stmt.setInt(16, c.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
     public void delete(Clientes c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM cliente WHERE codigo = ?");
            stmt.setInt(1, c.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
     
     public List<Clientes> readForName(String name){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> cliente = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM cliente WHERE NomeFantasia LIKE ?");
            stmt.setString(1, "%"+name+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Clientes clientes = new Clientes();
                
                clientes.setCodigo(rs.getInt("codigo"));
                clientes.setRazaoSocial(rs.getString("RazaoSocial"));
                clientes.setNomeFantasia(rs.getString("NomeFantasia"));
                clientes.setPessoa(rs.getString("Pessoa"));
                clientes.setCPF(rs.getString("CPF"));
                clientes.setCNPJ(rs.getString("CNPJ"));
                clientes.setInscricaoMunicipal(rs.getString("InscricaoMunicipal"));
                clientes.setReferencia(rs.getString("Referencia"));
                clientes.setTelefone(rs.getString("Telefone"));
                clientes.setEmail(rs.getString("Email"));
                clientes.setEndereco(rs.getString("Endereco"));
                clientes.setCidade(rs.getString("Cidade"));
                clientes.setBairro(rs.getString("Bairro"));
                clientes.setOrgaoPublico(rs.getString("OrgaoPublico"));
                clientes.setMicroempresa(rs.getString("Microempresa"));
                clientes.setInscricaoEstadual(rs.getString("InscricaoEstadual"));
                cliente.add(clientes);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return cliente;
    }
}
