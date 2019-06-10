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
import mode.bean.Produtos;

/**
 *
 * @author serpa
 */
public class ProdutosDAO {
    
    public void create(Produtos p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO produtos (Nome,NomeReduzido,Fabricante,Familia,ClassABC,Tipo,Desconto,Situacao,CodigoBarras,Referencia,ReferenciaOriginal,TipoProducao)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getNomeReduzido());
            stmt.setString(3,p.getFabricante());
            stmt.setString(4,p.getFamilia());
            stmt.setString(5,p.getClassABC());
            stmt.setString(6,p.getTipo());
            stmt.setString(7,p.getDesconto());
            stmt.setString(8,p.getSituacao());
            stmt.setString(9,p.getCodigoBarras());
            stmt.setString(10,p.getReferencia());
            stmt.setString(11,p.getReferenciaOriginal());
            stmt.setString(12,p.getTipoProducao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Produtos> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produto = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produtos produtos = new Produtos();
                
                produtos.setCodigo(rs.getInt("codigo"));
                produtos.setNome(rs.getString("Nome"));
                produtos.setNomeReduzido(rs.getString("NomeReduzido"));
                produtos.setFabricante(rs.getString("Fabricante"));
                produtos.setFamilia(rs.getString("Familia"));
                produtos.setClassABC(rs.getString("ClassABC"));
                produtos.setTipo(rs.getString("Tipo"));
                produtos.setDesconto(rs.getString("Desconto"));
                produtos.setSituacao(rs.getString("Situacao"));
                produtos.setCodigoBarras(rs.getString("CodigoBarras"));
                produtos.setReferencia(rs.getString("Referencia"));
                produtos.setReferenciaOriginal(rs.getString("ReferenciaOriginal"));
                produtos.setTipoProducao(rs.getString("TipoProducao"));
                produto.add(produtos);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produto;
    }
    
    
    public void update(Produtos p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE produtos SET Nome = ?,NomeReduzido = ?,Fabricante = ?,Familia = ?,ClassABC = ?,Tipo = ?,Desconto = ?,Situacao = ?,CodigoBarras = ?,Referencia = ?,ReferenciaOriginal = ?,TipoProducao = ? WHERE codigo = ?");
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getNomeReduzido());
            stmt.setString(3,p.getFabricante());
            stmt.setString(4,p.getFamilia());
            stmt.setString(5,p.getClassABC());
            stmt.setString(6,p.getTipo());
            stmt.setString(7,p.getDesconto());
            stmt.setString(8,p.getSituacao());
            stmt.setString(9,p.getCodigoBarras());
            stmt.setString(10,p.getReferencia());
            stmt.setString(11,p.getReferenciaOriginal());
            stmt.setString(12,p.getTipoProducao());
            stmt.setInt(13, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
     public void delete(Produtos p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM produtos WHERE codigo = ?");
            stmt.setInt(1, p.getCodigo());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
     
     public List<Produtos> readForName(String name){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> produto = new ArrayList<>();
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM produtos WHERE Nome LIKE ?");
            stmt.setString(1, "%"+name+"%");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produtos produtos = new Produtos();
                
                produtos.setCodigo(rs.getInt("codigo"));
                produtos.setNome(rs.getString("Nome"));
                produtos.setNomeReduzido(rs.getString("NomeReduzido"));
                produtos.setFabricante(rs.getString("Fabricante"));
                produtos.setFamilia(rs.getString("Familia"));
                produtos.setClassABC(rs.getString("ClassABC"));
                produtos.setTipo(rs.getString("Tipo"));
                produtos.setDesconto(rs.getString("Desconto"));
                produtos.setSituacao(rs.getString("Situacao"));
                produtos.setCodigoBarras(rs.getString("CodigoBarras"));
                produtos.setReferencia(rs.getString("Referencia"));
                produtos.setReferenciaOriginal(rs.getString("ReferenciaOriginal"));
                produtos.setTipoProducao(rs.getString("TipoProducao"));
                produto.add(produtos);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produto;
    }
}
