package negocio;

public class MainCarro {
    static void main() {
        Carro c1= new Carro();
        Carro c2=new Carro();
        c1.potencia=2;
        c1.velocidad=60;
        c2.potencia=7;
        c2.velocidad=140;

        System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        c1.acelerar();
        c1.acelerar();
        c1.frenar();
        System.out.println("La potencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        c2.frenar();
        System.out.println("La potencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);
    }
}
