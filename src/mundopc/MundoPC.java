package mundopc;

import com.gm.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Raton raton1 = new Raton("Bluetooth", "Logitech");
        Teclado teclado1 = new Teclado("USB", "Logitech");
        Monitor monitor1 = new Monitor("Samsung", 17);
        Computadora computadora1 = new Computadora("Dell XPS", monitor1, teclado1, raton1);
        
        Raton raton2 = new Raton("Bluetooth", "HP");
        Teclado teclado2 = new Teclado("Bluetooth", "HP");
        Monitor monitor2 = new Monitor("HP", 13);
        Computadora computadora2 = new Computadora("HP Pavilion", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}
