
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/*
 * @author Rogelio Cervantes Castellon
 */
public class Vivienda {
    String idviv, tipo, detalles, idador;
    ImageIcon fotoviv;

    public Vivienda(String idviv, String tipo, String detalles, String idador, ImageIcon fotoviv) {
        this.idviv = idviv;
        this.tipo = tipo;
        this.detalles = detalles;
        this.idador = idador;
        this.fotoviv = fotoviv;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO vivienda VALUES(?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, tipo);
            ps.setBinaryStream(3, cnx.ImagenBytes(fotoviv));
            ps.setString(4, detalles);
            ps.setString(5, idador);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE vivienda SET tipo=?,fotoviv=?,detalles=?,arrendador_idarrendador=? "
                    + "WHERE idvivienda=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, tipo);
            ps.setBinaryStream(2, cnx.ImagenBytes(fotoviv));
            ps.setString(3, detalles);
            ps.setString(4, idador);
            ps.setString(5, idviv);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int eliminar(Conexion cnx) {
        try {
            String sql = "DELETE FROM vivienda WHERE vivienda.idvivienda=?;";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idviv);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return 0;
        }
    }
}
