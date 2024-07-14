package algoritmos;

import java.util.ArrayList;
import modelos.ComponenteModel;
import modelos.DiscoModel;
import modelos.PlacaMadreModel;
import modelos.RamModel;
import modelos.TarjetaGraficaModel;

public class Recomendaciones {
    private ComponentesService componentesService;

    public Recomendaciones() {
        componentesService = new ComponentesService();
    }
    
    public ArrayList<ComponenteModel> recomendacionDisco(DiscoModel disco) {
        ArrayList<ComponenteModel> recomendaciones = new ArrayList<>();

        ArrayList<RamModel> rams = componentesService.getAllRams();
        ArrayList<TarjetaGraficaModel> tarjetasGraficas = componentesService.getAllTarjetasGraficas();
        ArrayList<PlacaMadreModel> placasMadre = componentesService.getAllPlacasMadre();

        for (PlacaMadreModel placa : placasMadre) {
            if(disco.getInterface().equalsIgnoreCase("SATA") && placa.isCompatibleWithSATA()){
                recomendaciones.add(new ComponenteModel("Placa Madre", placa.getName(), placa.getSocket(), placa.getQuantity()));
            } else if(disco.getInterface().equalsIgnoreCase("NVMe") && placa.isCompatibleWithNVMe()){
                recomendaciones.add(new ComponenteModel("Placa Madre", placa.getName(), placa.getSocket(), placa.getQuantity()));
            }
        }
        
//        for (TarjetaGraficaModel tarjeta : tarjetasGraficas) {
//            
//        }
        
//        for (RamModel ram : rams) {
//            
//        }
        
        return recomendaciones;
    }
    
    public ArrayList<ComponenteModel> recomendacionRam(RamModel ram) {
        ArrayList<ComponenteModel> recomendaciones = new ArrayList<>();

        ArrayList<DiscoModel> discos = componentesService.getAllDiscos();
        ArrayList<TarjetaGraficaModel> tarjetasGraficas = componentesService.getAllTarjetasGraficas();
        ArrayList<PlacaMadreModel> placasMadre = componentesService.getAllPlacasMadre();

        for (PlacaMadreModel placa : placasMadre) {
            if(ram.getType().equalsIgnoreCase(placa.getRamType()) && placa.getMaxRam() > ram.getCapacity()){
                recomendaciones.add(new ComponenteModel("Placa Madre", placa.getName(), placa.getSocket(),placa.getQuantity()));
            }
        }
        
//        for (TarjetaGraficaModel tarjeta : tarjetasGraficas) {
//            
//        }
        
//        for (DiscoModel disco : discos) {
//            
//        }
        
        return recomendaciones;
    }
    
    public ArrayList<ComponenteModel> recomendacionPlaca(PlacaMadreModel placa) {
        ArrayList<ComponenteModel> recomendaciones = new ArrayList<>();

        ArrayList<RamModel> rams = componentesService.getAllRams();
        ArrayList<TarjetaGraficaModel> tarjetasGraficas = componentesService.getAllTarjetasGraficas();
        ArrayList<DiscoModel> discos = componentesService.getAllDiscos();

        for (RamModel ram : rams) {
            if((placa.getRamType().equalsIgnoreCase(ram.getType())) && (placa.getMaxRam() > ram.getCapacity())){
                recomendaciones.add(new ComponenteModel("RAM", ram.getName(), ram.getType(),ram.getQuantity()));
            }
        }
        
        for (TarjetaGraficaModel tarjeta : tarjetasGraficas) {
            if(placa.getPCIe() == tarjeta.getPCIe()){
                recomendaciones.add(new ComponenteModel("Tarjeta Grafica", tarjeta.getName(), tarjeta.getTypeMemory(),tarjeta.getQuantity()));
            }
        }
        
        for (DiscoModel disco : discos) {
            if(disco.getInterface().equalsIgnoreCase("SATA") && placa.isCompatibleWithSATA()){
                recomendaciones.add(new ComponenteModel("Disco", disco.getName(), disco.getType(),disco.getQuantity()));
            }else if(disco.getInterface().equalsIgnoreCase("NVMe") && placa.isCompatibleWithNVMe()){
                recomendaciones.add(new ComponenteModel("Disco", disco.getName(), disco.getType(),disco.getQuantity()));
            }
        }
        
        return recomendaciones;
    }
    
    public ArrayList<ComponenteModel> recomendacionTarjeta(TarjetaGraficaModel tarjeta) {
        ArrayList<ComponenteModel> recomendaciones = new ArrayList<>();

        ArrayList<RamModel> rams = componentesService.getAllRams();
        ArrayList<DiscoModel> discos = componentesService.getAllDiscos();
        ArrayList<PlacaMadreModel> placasMadre = componentesService.getAllPlacasMadre();

        for (PlacaMadreModel placa : placasMadre) {
            if(placa.getPCIe() == tarjeta.getPCIe()){
                recomendaciones.add(new ComponenteModel("Placa Madre", placa.getName(), placa.getSocket(), placa.getQuantity()));
            }
        }
        
//        for (RamModel ram : rams) {
//            
//        }
        
//        for (DiscoModel disco : discos) {
//            
//        }
        
        return recomendaciones;
    }
}