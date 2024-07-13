package modelos;

public class PlacaMadreModel {
    private String motherboardId;
    private int supplierId;
    private String name;
    private String socket;
    private String ramType;
    private int maxRam;
    private int PCIe;
    private int storagePorts;
    private int quantity;

    public String getMotherboardId() {
        return motherboardId;
    }

    public void setMotherboardId(String motherboardId) {
        this.motherboardId = motherboardId;
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(int maxRam) {
        this.maxRam = maxRam;
    }

    public int getPCIe() {
        return PCIe;
    }

    public void setPCIe(int PCIe) {
        this.PCIe = PCIe;
    }

    public int getStoragePorts() {
        return storagePorts;
    }

    public void setStoragePorts(int storagePorts) {
        this.storagePorts = storagePorts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
