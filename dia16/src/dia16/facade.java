/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia16;

// Facade (Fachada)
// Proporciona una interfaz simplificada a un conjunto de clases más complejas.

public class facade {
    static class Amplifier {
        void on() { System.out.println("Amplificador encendido."); }
    }

    static class DVDPlayer {
        void play() { System.out.println("Reproduciendo DVD."); }
    }

    static class HomeTheaterFacade {
        private Amplifier amp;
        private DVDPlayer dvd;

        public HomeTheaterFacade() {
            this.amp = new Amplifier();
            this.dvd = new DVDPlayer();
        }

        public void watchMovie() {
            amp.on();
            dvd.play();
        }
    }

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
}
