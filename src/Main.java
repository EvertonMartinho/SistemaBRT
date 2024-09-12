public class Main {
    public static void main(String[] args) {
        TransporteFactory carroFactory = new CarroFactory();
        carroFactory.entregarProduto();

        TransporteFactory motoFactory = new MotoFactory();
        motoFactory.entregarProduto();

        TransporteFactory bicicletaFactory = new BicicletaFactory();
        bicicletaFactory.entregarProduto();
    }
}
