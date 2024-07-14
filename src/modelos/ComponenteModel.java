package modelos;

/**
 *
 * @author U22244028
 */
public class ComponenteModel {
    private String tipoComponente;
    private String nombre;
    private String tipo;
    private int cantidad;

    public ComponenteModel(String tipoComponente, String nombre, String tipo, int cantidad) {
        this.tipoComponente = tipoComponente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
