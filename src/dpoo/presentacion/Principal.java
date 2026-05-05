package dpoo.presentacion;

import dpoo.mundo.Parcial;

public class Principal {

    public Principal() {
        Parcial parcial = new Parcial();

        probarPotencia(parcial, 2, 10);
        probarPotencia(parcial, 3, 5);
        probarPotencia(parcial, 5, 0);   
        probarPotencia(parcial, 0, 5);   
        probarPotencia(parcial, 0, 0);   
        probarPotencia(parcial, -2, 3);  
        probarPotencia(parcial, -2, 4);  
        probarPotencia(parcial, 2, -3);  
        probarPotencia(parcial, 100, 9); 
        probarPotencia(parcial, -2, 33);
    }

    private void probarPotencia(Parcial parcial, int b, int e) {
        try {
            int resultado = parcial.potencia(b, e);
            System.out.println(b + "^" + e + " = " + resultado);
        } catch (Exception ex) {
            System.out.println(b + "^" + e + " error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Principal();
    }
}