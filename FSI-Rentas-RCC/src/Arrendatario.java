
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/*
 * @author Rogelio Cervantes Castellon
 */
public class Arrendatario {
    String idtario, nombretario, estatus, sexotario, passtario;
    ImageIcon fototario;

    public Arrendatario(String idtario, String nombretario, String estatus, String sexotario, String passtario, ImageIcon fototario) {
        this.idtario = idtario;
        this.nombretario = nombretario;
        this.estatus = estatus;
        this.sexotario = sexotario;
        this.passtario = passtario;
        this.fototario = fototario;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO arrendatario VALUES(?,?,?,?,?,?)"; // Cada interrogación es una columna de la tabla.
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            // Los datos van en el orden como están en la tabla
            ps.setString(1, null); // Es null porque la clave primaria es auto incrementable.
            ps.setString(2, nombretario);
            ps.setString(3, estatus);
            ps.setString(4, sexotario);
            ps.setBinaryStream(5, cnx.ImagenBytes(fototario));
            ps.setString(6, passtario);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE arrendatario SET nombretario=?,estatus=?,sexotario=?,fototario=?,passtario=? "
                    + "WHERE idarrendatario=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, nombretario);
            ps.setString(2, estatus);
            ps.setString(3, sexotario);
            ps.setBinaryStream(4, cnx.ImagenBytes(fototario));
            ps.setString(5, passtario);
            ps.setString(6, idtario);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int eliminar(Conexion cnx) {
        try {
            String sql = "DELETE FROM arrendatario WHERE arrendatario.idarrendatario=?;";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idtario);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizarEstatus(Conexion cnx) {
        try {
            String sql = "UPDATE arrendatario SET estatus=? "
                    + "WHERE idarrendatario=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idtario);
            ps.setString(2, estatus);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
}