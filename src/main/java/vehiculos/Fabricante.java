package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    String nombre;
    Pais pais;
    static Map<Fabricante, Integer> ventasPorFabrica = new HashMap<>();

    public Fabricante(String nom, Pais p){
        this.nombre = nom;
        this.pais = p;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int valorMax = -1;
        Fabricante fabricaMayorVentas = null;

        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()) {
            int valorActual = entry.getValue();

            if (valorActual > valorMax){
                valorMax = valorActual;
                fabricaMayorVentas = entry.getKey();
            }
        }
        return fabricaMayorVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
