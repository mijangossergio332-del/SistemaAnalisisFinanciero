package modelo;

public class Sesion {

    public static int idUsuario;
    public static int idRol;

    public static String usuario;
    public static String rol;

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        Sesion.idUsuario = idUsuario;
    }

    public static int getIdRol() {
        return idRol;
    }

    public static void setIdRol(int idRol) {
        Sesion.idRol = idRol;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Sesion.usuario = usuario;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Sesion.rol = rol;
    }
}
