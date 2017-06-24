package ejerciciogrupoalumno;

/**
 *
 * @author JUAN
 */
public class Grupo {
    
    private Alumno[] alumnos = null;
    
    public Grupo() {
        alumnos = new Alumno[5];
        
        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();
        }
    }
}
