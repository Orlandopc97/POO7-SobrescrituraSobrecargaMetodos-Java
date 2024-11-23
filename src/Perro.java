//SOBRESCRITURA DE MÉTODOS
//clase que estiende de AnimalAbstract, clase abstracta
public class Perro extends AnimalAbstract {

    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;

    //Constructores

    //Métodos getters and setters

    //Método que extiende de AnimalAbstract

    //Sobrescribir metodo
    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y ladro: Guau Guau");
    }
}
