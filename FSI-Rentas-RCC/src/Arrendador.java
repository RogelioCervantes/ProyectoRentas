
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/*
 * @author Rogelio Cervantes Castellon
 */
public class Arrendador {
    String idador, nombreador, sexoador, telador, direccion, passador;
    ImageIcon fotoador;

    public Arrendador(String idador, String nombreador, String sexoador, String telador, String direccion, String passador, ImageIcon fotoador) {
        this.idador = idador;
        this.nombreador = nombreador;
        this.sexoador = sexoador;
        this.telador = telador;
        this.direccion = direccion;
        this.passador = passador;
        this.fotoador = fotoador;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO arrendador VALUES(?,?,?,?,?,?,?)"; // Cada interrogación es una columna de la tabla.
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            // Los datos van en el orden como están en la tabla
            ps.setString(1, null); // Es null porque la clave primaria es auto incrementable.
            ps.setString(2, nombreador);
            ps.setString(3, sexoador);
            ps.setString(4, telador);
            ps.setString(5, direccion);
            ps.setBinaryStream(6, cnx.ImagenBytes(fotoador));
            ps.setString(7, passador);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
    
    public int actualizar(Conexion cnx) {
        try {
            String sql = "UPDATE arrendador SET nombreador=?,sexoador=?,telador=?,direccion=?,fotoador=?,passador=? "
                    + "WHERE idarrendador=?";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, nombreador);
            ps.setString(2, sexoador);
            ps.setString(3, telador);
            ps.setString(4, direccion);
            ps.setBinaryStream(5, cnx.ImagenBytes(fotoador));
            ps.setString(6, passador);
            ps.setString(7, idador);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return 0;
        }
    }
    
    public int eliminar(Conexion cnx) {
        try {
            String sql = "DELETE FROM arrendador WHERE arrendador.idarrendador=?;";
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            ps.setString(1, idador);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return 0;
        }
    }
}
