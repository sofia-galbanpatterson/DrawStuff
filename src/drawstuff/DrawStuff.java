/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;

/**
 *
 * @author sofialuzgalbanpatterson
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startUp();
    }

    private static void startUp() {
        ApplicationStarter.run("Sofia's Playground", new AdEnvironment()); 
    }
    
}
