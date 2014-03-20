/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author Carlos
 * fecha: 20/03/2014
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alumno 1");
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	// Soy octavio y modifico el archivo de Carlos
    }
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");

	// Soy octavio y modifico el archivo tambien aqui
	// modificaciones alumno 1
        System.out.println("Alumno 1 inserta esta sentencia");
    }
    public void testGitAux(){
        // metodo rama testing
        Sytem.out.println("Metodo de testing");
    }
}
