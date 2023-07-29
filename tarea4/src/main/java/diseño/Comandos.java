package diseño;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


public class Comandos {
    
    
        public void actualizarUsuario(String usuario, Setters usuarioActualizado){
      
        String query = "UPDATE Regist SET "
            + "Usuario=?, Nombre=?, Apellido=?,"
            + " Telefono=?, Email=?, Pass=?"
            + " WHERE Usuario ='" + usuario + "'";
        
        try {
           
            Connection cn = MyConnection.getConnection();
        
            PreparedStatement pst = cn.prepareStatement(query);

            pst.setString(1, usuarioActualizado.getUsu());
            pst.setString(2, usuarioActualizado.getNomb());
            pst.setString(3, usuarioActualizado.getApel());
            pst.setInt(4, usuarioActualizado.getTel());
            pst.setString(5, usuarioActualizado.getEmail());
            pst.setString(6, usuarioActualizado.getPass());
            
            pst.executeUpdate();
            
            System.out.println("usuario actualizado con exito.");
        } catch (SQLException e) {
            System.err.println(
                "Error" +e
            );
        } 
    }
    
   
    public void eliminar(String usuario){
        
        String query = "DELETE FROM Regist WHERE Usuario='" + usuario +"'";
        
        try {
            
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            pst.executeUpdate();
            
            System.out.println("Usuario eliminado.");
        } catch (SQLException e) {
            System.err.println(
                "Error" +e
            );
        } 
    }
        public Setters obtener(String usuario){
        Setters usuarioBuscado = null;
        String query = "SELECT * FROM Regist WHERE usuario='" + usuario +"'";
        
        try {
          
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
           
            if (rs.next()) {
                
                    usuarioBuscado = new Setters();
                    usuarioBuscado.setUsu(rs.getString("usuario"));
                    usuarioBuscado.setNomb(rs.getString("nombre"));
                    usuarioBuscado.setApel(rs.getString("apellido"));
                    usuarioBuscado.setTel(rs.getInt("telefono"));
                    usuarioBuscado.setEmail(rs.getString("correo"));
                    usuarioBuscado.setPass(rs.getString("contrasennia"));
            } else {
                System.out.println("Usuario no registrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el usuario\n" + e);
        }
        
        return usuarioBuscado;
    }
    
    public  LinkedList<Setters> obtener(){
   
        LinkedList<Setters> listaUsuarios = new LinkedList<>();
        String query = "SELECT * FROM Regist";
        
        try {
            Connection cn = MyConnection.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                     Setters actualUsuario = new Setters();
                    
                    
                    actualUsuario.setUsu(rs.getString("Usuario"));
                    actualUsuario.setNomb(rs.getString("Nombre"));
                    actualUsuario.setApel(rs.getString("Apellido"));
                    actualUsuario.setTel(rs.getInt("Telefono"));
                    actualUsuario.setEmail(rs.getString("Email"));
                    actualUsuario.setPass(rs.getString("Pass"));
                    
                    listaUsuarios.add(actualUsuario);
                }
            } else {
                System.out.println("No hay ningun usuario registrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener lista de usuarios\n" + e);
        }
                
        
        return listaUsuarios;
    }
}
