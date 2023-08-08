package org.malarcondev;

public class Main {
    public static void main(String[] args) {
        // Instanciación por constructor prohíbido por ser "private"
        Conexion conexion = Conexion.getInstancia();
        conexion.conectar();
        conexion.desconectar();

        boolean resp = conexion instanceof Conexion;
        System.out.println(resp);
    }
}