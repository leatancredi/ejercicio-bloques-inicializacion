package domain;
//hay dos tipos: bloques de inicializacion estatico y no estaticos, 
//los dos inician antes que el constructor
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion statico(se ejecuta antes que el contructor y
    //del bloque de inicializacion no estatico) se ejecuta cuando se carga la 
    //clase en memoria
    static{
        System.out.println("ejecucion bloque estatico");
        //no se puede usar el operador "this"
        ++Persona.contadorPersonas;
        //idPersona = 10; no se puede utilizar ya que no ese estatica
        
    }
    {
        System.out.println("ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;// cada vez que se cree un 
                                                    //objeto se aumenta la variable
    }
    //se ejecuta el constuctor para ver como inician los bloques
    public Persona(){
        System.out.println("ejecucion del constructor");
        
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
}
