
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * @author Rogelio Cervantes Castellon
 */
public class Contrato {
    String idcon, duracion, montocon, observaciones, idviv, idtario;
    Date fechainicio, fechasig;

    public Contrato(String idcon, String duracion, String montocon, String observaciones, String idviv, String idtario, Date fechainicio, Date fechasig) {
        this.idcon = idcon;
        this.duracion = duracion;
        this.montocon = montocon;
        this.observaciones = observaciones;
        this.idviv = idviv;
        this.idtario = idtario;
        this.fechainicio = fechainicio;
        this.fechasig = fechasig;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO contrato VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setString(2, duracion);
            ps.setString(3, montocon);
            ps.setString(4, observaciones);
            ps.setDate(5, fechainicio);
            ps.setDate(6, fechasig);
            ps.setString(7, idviv);
            ps.setString(8, idtario);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE contrato SET duracion=?,montocon=?,observaciones=?,fechainicio=?,fechasig=?,vivienda_idvivienda=?,arrendatario_idarrendatario=?"
                    + "WHERE idcontrato=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, duracion);
            ps.setString(2, montocon);
            ps.setString(3, observaciones);
            ps.setDate(4, fechainicio);
            ps.setDate(5, fechasig);
            ps.setString(6, idviv);
            ps.setString(7, idtario);
            ps.setString(8, idcon);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int eliminar(Conexion cnx) {
        try {
            String sql = "DELETE FROM contrato WHERE contrato.idcontrato=?;";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idcon);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizarObservaciones(Conexion cnx) {
        try {
            String sql = "UPDATE contrato SET observaciones=? "
                    + "WHERE idcontrato=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, observaciones);
            ps.setString(2, idcon);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizaFecha(Conexion cnx) {
        try {
            String sql = "UPDATE contrato SET fechasig=? "
                    + "WHERE idcontrato=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setDate(1, fechasig);
            ps.setString(2, idcon);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
}
