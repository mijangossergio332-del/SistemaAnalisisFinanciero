package Vista;

import conexion.Conexion;
import modelo.Sesion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnIngresar;

    public Login() {

        setTitle("Login");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        panel.add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 30, 150, 25);
        panel.add(txtUsuario);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(30, 70, 80, 25);
        panel.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 70, 150, 25);
        panel.add(txtPassword);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(120, 110, 100, 30);
        panel.add(btnIngresar);

        btnIngresar.addActionListener(e -> iniciarSesion());

        add(panel);
    }

    private void iniciarSesion() {

        String usuario = txtUsuario.getText();
        String password =
                String.valueOf(txtPassword.getPassword());

        try {

            Connection con = Conexion.conectar();

            String sql =
                    "SELECT u.id_usuario, u.id_rol, "
                    + "u.usuario, r.nombre_rol "
                    + "FROM usuarios u "
                    + "INNER JOIN roles r "
                    + "ON u.id_rol = r.id_rol "
                    + "WHERE u.usuario=? "
                    + "AND u.contrasena=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Sesion.setIdUsuario(
                        rs.getInt("id_usuario"));

                Sesion.setIdRol(
                        rs.getInt("id_rol"));

                Sesion.setUsuario(
                        rs.getString("usuario"));

                Sesion.setRol(
                        rs.getString("nombre_rol"));

                JOptionPane.showMessageDialog(
                        this,
                        "Bienvenido "
                        + Sesion.getUsuario()
                        + "\nRol: "
                        + Sesion.getRol());
                new VentanaPrincipal().setVisible(true);

                dispose();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Usuario o contraseña incorrectos");
            }

            con.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error: " + e.getMessage());
        }
    }
}