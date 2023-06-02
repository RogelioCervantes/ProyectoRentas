import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
/*
 * @author Rogelio Cervantes Castellon
 */
public class Solicitud {
    String nombresol, sexosol, idviv, passsol;
    ImageIcon fotosol;

    public Solicitud(String nombresol, String sexosol, String idviv, String passsol, ImageIcon fotosol) {
        this.nombresol = nombresol;
        this.sexosol = sexosol;
        this.idviv = idviv;
        this.passsol = passsol;
        this.fotosol = fotosol;
    }
    
    public int insertar(Conexion cnx) {
        try {
            String sql = "INSERT INTO solicitudes VALUES(?,?,?,?,?,?)"; // Cada interrogación es una columna de la tabla.
            PreparedStatement ps = cnx.con.prepareStatement(sql);
            // Los datos van en el orden como están en la tabla
            ps.setString(1, null); // Es null porque la clave primaria es auto incrementable.
            ps.setString(2, nombresol);
            ps.setString(3, sexosol);
            ps.setBinaryStream(4, cnx.ImagenBytes(fotosol));
            ps.setString(5, idviv);
            ps.setString(6, passsol);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return 0;
        }
    }
}
