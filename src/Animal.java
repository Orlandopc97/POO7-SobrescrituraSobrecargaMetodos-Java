//SOBRECARGA DE MÉTODOS
public class Animal {

    //Atributos
    private int idAnimal;
    private String descripcion;

    //Constructores

    //Metodos getters and setters

    //Otros metodos
    //3 metodos con el mismo nombre lo que los diferencia son los parametros que pide

    public void hacerSonido(){
        System.out.println("El animal hace sonido");
    }

    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + " hace sonido");
    }

    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal: " + nombreAnimal + " hace un sonido de tipo " + tipoSonido);
    }
}
