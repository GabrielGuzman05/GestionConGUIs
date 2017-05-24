/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconguis;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestionConGUIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUIPersona frame = new GUIPersona();
        frame.setVisible(true);
        frame.setList(inicializarPersonas());
        GUIEstudiante frame2 = new GUIEstudiante();
        frame2.setVisible(true);
        frame2.setList(inicializarEstudiante());
    }
    
    public static ArrayList<Persona> inicializarPersonas(){
        ArrayList<Persona> personas = new ArrayList<>();
        for(int i=0;i<3;i++){
            Persona e = new Persona("Juan", "Perez", "188239004");
            personas.add(e);
        }
        return personas;
    }
    
    public static ArrayList<Persona> inicializarEstudiante(){
        ArrayList<Persona> personas = new ArrayList<>();
        for(int i=0;i<3;i++){
            Estudiante e = new Estudiante("Sample", ""+2000, "Juan", "Perez", "188239004");
            personas.add(e);
        }
        return personas;
    }
    
}
