
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // Almacena el numero de letras que se toman de cada nombre
    private static final int LETRAS_1 = 3;
    // Almacena el numero de letras que se toman de cada nombre
    private static final int LETRAS_2 = 2;
    // Almacena el nombre de la persona
    private String nombre;
    // Almacena el primer apellido de la persona
    private String primerApellido;
    // Almacena el primer apellido de la madre de la persona
    private String apellidoMadre;
    // Almacena la ciudad de nacimiento de la persona
    private String ciudadNacimiento;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        nombre = null;
        primerApellido = null;
        apellidoMadre = null;
        ciudadNacimiento = null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String generateStarWarsName(String nombre, String primerApellido, String apellidoMadre, String ciudadNacimiento)
    {
        String nombreGenerado = primerApellido.substring(0,LETRAS_1) + nombre.substring(0,LETRAS_1);
        String apellidoGenerado = apellidoMadre.substring(0,LETRAS_2) + ciudadNacimiento.substring(0,LETRAS_1);
        return nombreGenerado + " " + apellidoGenerado;
    }    
}
