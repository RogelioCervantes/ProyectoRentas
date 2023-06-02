
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * @author Rogelio Cervantes Castellon
 */
public class Pago {
    Date fecha;
    int monto;
    String idpago, idcon;

    public Pago(Date fecha, int monto, String idpago, String idcon) {
        this.fecha = fecha;
        this.monto = monto;
        this.idpago = idpago;
        this.idcon = idcon;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO pago VALUES(?,?,?,?)";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, null);
            ps.setDate(2, fecha);
            ps.setInt(3, monto);
            ps.setString(4, idcon);
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE pago SET fechapago=?,monto=?,contrato_idcontrato=? "
                    + "WHERE idpago=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setDate(1, fecha);
            ps.setInt(2, monto);
            ps.setString(3, idcon);
            ps.setString(4, idpago);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int eliminar(Conexion cnx) {
        try {
            String sql = "DELETE FROM pago WHERE pago.idpago=?;";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idpago);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return 0;
        }
    }
}
