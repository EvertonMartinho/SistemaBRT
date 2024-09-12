// TransporteFactory.java
public abstract class TransporteFactory {
    public abstract Transporte criarTransporte();

    public void entregarProduto() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
// CarroFactory.java
public class CarroFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Carro();
    }
}

// MotoFactory.java
public class MotoFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Moto();
    }
}

// BicicletaFactory.java
public class BicicletaFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte() {
        return new Bicicleta();
    }
}
