package Entidades;

public class Productos {

    private String nombre;
    private String color;
    private String tamano;
    private int edad;
    private String marca;
    private String categoria;
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Productos(String nombre, String color, String tamano, int edad, String marca, int precio) {
        this.nombre = nombre;
        this.color = color;
        this.tamano = tamano;
        this.edad = edad;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", color=" + color + ", tamano=" + tamano + ", edad=" + edad + ", marca=" + marca + ", categoria=" + categoria + ", precio=" + precio + '}';
    }

 

}

        
   
    