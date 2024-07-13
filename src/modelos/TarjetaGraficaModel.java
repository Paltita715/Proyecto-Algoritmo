package modelos;

public class TarjetaGraficaModel {
    private String graphicsCardId ;
    private int supplierId;
    private String name;
    private String Interface;
    private int memory;
    private String typeMemory;
    private int bandwidth;
    private int quantity;

    public String getGraphicsCardId() {
        return graphicsCardId;
    }

    public void setGraphicsCardId(String graphicsCardId) {
        this.graphicsCardId = graphicsCardId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String Interface) {
        this.Interface = Interface;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getTypeMemory() {
        return typeMemory;
    }

    public void setTypeMemory(String typeMemory) {
        this.typeMemory = typeMemory;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
