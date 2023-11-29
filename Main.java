import objetosGenericos.*;

public class Main {
    
    public static void main(String[] args) {
        
        Capinha capinha = new Capinha("Preta");
        Tela outratela = new Tela(6.06);

        // O objeto tela faz parte da composição do iphone, ele já esta composto dentro da contrução do objeto "Celular"
        // pois todo celular precisa ter uma tela.

        // Pense assim: Se só destruirmos o objeto "iphone", o objeto tela dele tabém sera destruido, mas se nós destruirmos
        // o objeto tela que esta contido dentro de iphone, o objeto iphone não será destruido.
        Iphone iphone = new Iphone("Iphone 15", "Apple", 256, 6.06);

        iphone.setCapinha(capinha); // Agregação -> Estamos "agregando" o objeto capinha ao celular.
        iphone.setTela(outratela); // O que diferencia um do outro é que o objeto tela faz parte da composição do objeto celular.
    }
}
