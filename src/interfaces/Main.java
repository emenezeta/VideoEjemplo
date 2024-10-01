package interfaces;


    public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo ReproductorMultimedia
        ReproductorMultimedia reproductor = new ReproductorMultimedia();
        
        // Probar los métodos
        reproductor.play();     // Debería iniciar la reproducción
        reproductor.bucle();    // Cambiar a bucle infinito
        reproductor.stop();     // Detener la reproducción
    }
}