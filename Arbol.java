 class Arbol {
    
    String nombre;
    String especie;
    float altura;
    int edad;
    float diametro;
     
    void curar()
    {
        System.out.println("el tallo del arbol sirve como un remedio de curacion natural");
    }
    void purificar()
    {
        System.out.println("las hojas del arbol purifican el aire contaminado mediante la fotosintesis");
    }
    public static void main(String [] args){
        Arbol arbol1 = new Arbol();
        
        arbol1.nombre = "Sakura";
        arbol1.especie = "cerezo";
        arbol1.altura = 2.34f;
        arbol1.diametro = 4.54f;
        arbol1.edad = 15;

        System.out.println("El nombre del arbol es: "+arbol1.nombre);
        System.out.println("El especie del arbol es: "+arbol1.especie);
        System.out.println("La altura del arbol es: "+arbol1.altura);
        System.out.println("El diametro del arbol es: "+arbol1.diametro);
        System.out.println("La edad del arbol es: "+arbol1.edad);
        arbol1.purificar();
        arbol1.curar();

    } 
}
