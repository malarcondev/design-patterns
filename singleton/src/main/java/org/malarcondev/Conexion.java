package org.malarcondev;

public class Conexion {

    // Declaracion
    private static Conexion instancia;
    // privata static Conexion instancia = new Conexion();

    // Para evitar instancia mediante el operador new
    // Constructor vacio
    private Conexion() {
    }

    // Se crea metodo para obtener una instancia creada y utilizarla
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // Metodos de prueba
    public void conectar() {
        System.out.println("Me conecté a la BD");
    }

    public void desconectar() {
        System.out.println("Me desconecté de la BD");
    }
}


