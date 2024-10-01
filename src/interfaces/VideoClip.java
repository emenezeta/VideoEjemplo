package interfaces;

public interface VideoClip {
    // Comienza la reproducción del video
    public void play();
    
    // Reproduce el clip en un bucle, un loop infinito
    public void bucle();
    
    // Detiene la reproducción del video
    public void stop();
}