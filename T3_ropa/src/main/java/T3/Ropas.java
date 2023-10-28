/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T3;

/**
 *
 * @author joshi
 */
public class Ropas {
    private String prenda;
    private String talla;
    private String precio;

    public Ropas(String prenda, String talla, String precio) {
        this.prenda = prenda;
        this.talla = talla;
        this.precio = precio;
    }

    Ropas() {
        
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
     public String getTexto(){
        return (this.prenda + "|Talla: " + this.talla + " | Precio: " + 
                this.precio);
    }
               
}
