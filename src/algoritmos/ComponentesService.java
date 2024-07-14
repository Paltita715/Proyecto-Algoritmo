package algoritmos;

import DAO.implementaciones.DiscoDAOImpl;
import DAO.implementaciones.PlacaMadreDAOImpl;
import DAO.implementaciones.RamDAOImpl;
import DAO.implementaciones.TarjetaGraficaDAOImpl;
import DAO.interfaces.DiscoDAO;
import DAO.interfaces.PlacaMadreDAO;
import DAO.interfaces.RamDAO;
import DAO.interfaces.TarjetaGraficaDAO;
import java.util.ArrayList;
import modelos.DiscoModel;
import modelos.PlacaMadreModel;
import modelos.RamModel;
import modelos.TarjetaGraficaModel;

public class ComponentesService {
    public ArrayList<DiscoModel> getAllDiscos() {
        DiscoDAO dao = new DiscoDAOImpl();
        try {
            return dao.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public ArrayList<RamModel> getAllRams() {
        RamDAO dao = new RamDAOImpl();
        try {
            return dao.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public ArrayList<TarjetaGraficaModel> getAllTarjetasGraficas() {
        TarjetaGraficaDAO dao = new TarjetaGraficaDAOImpl();
        try {
            return dao.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public ArrayList<PlacaMadreModel> getAllPlacasMadre() {
        PlacaMadreDAO dao = new PlacaMadreDAOImpl();
        try {
            return dao.readAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
