
package main;
import models.ModelCalculadora;
import views.ViewCalculadora;
import controllers.ControllerCalculadora;

/**
 *
 * @author ManuelAlonsoMH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelCalculadora modelCalculadora = new ModelCalculadora();
        ViewCalculadora viewCalculadora = new ViewCalculadora();
        ControllerCalculadora controllerCalculadora = new ControllerCalculadora(modelCalculadora, viewCalculadora); 
    }
    
}
