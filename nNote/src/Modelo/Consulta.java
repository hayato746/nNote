package Modelo;

import Controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.sqlite.SQLiteConnection;

public class Consulta extends Conexion {

    /**
     * Constructor for objects of class Operaciones
     */
    private DefaultListModel modeloLista = new DefaultListModel();

    public Consulta() {
        // initialise instance variables
    }

    public boolean insertar(String sql) {
        boolean valor = true;
        conectar();
        try {
            consulta.executeUpdate(sql);
        } catch (SQLException e) {
            valor = false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                consulta.close();
                conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return valor;
    }

    public ResultSet consultar(String sql) {
        conectar();
        ResultSet resultado = null;
        try {
            resultado = consulta.executeQuery(sql);

        } catch (SQLException e) {
            System.out.println("Mensaje:" + e.getMessage());
            System.out.println("Estado:" + e.getSQLState());
            System.out.println("Codigo del error:" + e.getErrorCode());
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        } /*finally {
        try {
        consulta.close();
        conexion.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        }*/
        return resultado;
    }

    public DefaultListModel llenarList(int id) {
        conectar();
        ResultSet rs = null;
        try {
            rs = consulta.executeQuery("select titulo, contenido from nota where id_usuario = " + id + " order by fecha desc");
            while (rs.next()) {
                modeloLista.addElement(rs.getString("titulo"));
            }
            return modeloLista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        } finally {
            try {
                consulta.close();
                conexion.close();
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public String login(String user, String pass){
        try {
            //consulta("dasda" + user + "" +  pass + "");
        } catch (Exception e) {
        }
        return null;
    }

    public void crearUsuario(Usuario usuario) {
        insertar("insert into usuario (nombre, apellidos, usuario, contrasenia) values('" + usuario.getNombre()
                + "','" + usuario.getApellidos()
                + "','" + usuario.getUsuario()
                + "','" + usuario.getContrasenia() + "');");
    }
    
    public void crearNota(Nota nota) {
        int id = nota.getId();
        insertar("insert into nota (titulo, contenido, id_usuario) values('" + nota.getTitulo()
                + "','" + nota.getContenido() + "', " + id + ");");
    }

    /*public void totalNota(DefaultTableModel tableModel) {
     ResultSet resultado = null;
     tableModel.setRowCount(0);
     tableModel.setColumnCount(0);
     String sql = "select * from nota";
     try {
     resultado = consultar(sql);
     if (resultado != null) {
     int numeroColumna = resultado.getMetaData().getColumnCount();
     for (int j = 1; j <= numeroColumna; j++) {
     tableModel.addColumn(resultado.getMetaData().getColumnName(j));
     }
     while (resultado.next()) {
     Object[] objetos = new Object[numeroColumna];
     for (int i = 1; i <= numeroColumna; i++) {
     objetos[i - 1] = resultado.getObject(i);
     }
     tableModel.addRow(objetos);
     }
     }
     } catch (SQLException e) {
     } finally {
     try {
     consulta.close();
     conexion.close();
     if (resultado != null) {
     resultado.close();
     }
     } catch (Exception e) {
     e.printStackTrace();
     }
     }
     }*/
}
