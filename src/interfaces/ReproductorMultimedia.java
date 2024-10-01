package interfaces;

public class ReproductorMultimedia implements VideoClip {

    // Estado para saber si el video está en reproducción
    private boolean reproduciendo;
    private boolean enBucle;

    // Constructor
    public ReproductorMultimedia() {
        this.reproduciendo = false;
        this.enBucle = false;
    }

    // Implementación del método play
    @Override
    public void play() {
        if (!reproduciendo) {
            reproduciendo = true;
            enBucle = false;
            System.out.println("El video ha comenzado a reproducirse.");
        } else {
            System.out.println("El video ya está reproduciéndose.");
        }
    }

    // Implementación del método bucle
    @Override
    public void bucle() {
        if (!reproduciendo) {
            reproduciendo = true;
            enBucle = true;
            System.out.println("El video está en modo bucle infinito.");
        } else if (!enBucle) {
            enBucle = true;
            System.out.println("El video ahora está en modo bucle infinito.");
        } else {
            System.out.println("El video ya está en modo bucle infinito.");
        }
    }

    // Implementación del método stop
    @Override
    public void stop() {
        if (reproduciendo) {
            reproduciendo = false;
            enBucle = false;
            System.out.println("El video se ha detenido.");
        } else {
            System.out.println("El video ya está detenido.");
        }
    }
}