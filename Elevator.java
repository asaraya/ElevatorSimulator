package itcr.elevatorsimulator;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Elevator {
    ArrayList<Integer> QueueElevator = new ArrayList<>();
    int PisoActual = 1;
    boolean PuertasAbiertas = false;
    
    void viajar(int PisoAviajar){
        if(PuertasAbiertas == false){
            PisoActual = PisoAviajar;    
        }
        else{
            JOptionPane.showMessageDialog(null, "Error: Las puertas están abiertas. Por favor cerrar las puertas");
        }         
    }
}

