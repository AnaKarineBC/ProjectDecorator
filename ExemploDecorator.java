// Classe para executar o exemplo com as novas combinações
public class ExemploDecorator {
    public static void main(String[] args) {
        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescricao() + ": R$ " + bebida.getPreco());

        Bebida bebidaComLeite = new LeiteDecorator(bebida);
        System.out.println(bebidaComLeite.getDescricao() + ": R$ " + bebidaComLeite.getPreco());

        Bebida bebidaComChocolate = new ChocolateDecorator(bebidaComLeite);
        System.out.println(bebidaComChocolate.getDescricao() + ": R$ " + bebidaComChocolate.getPreco());

        Bebida bebidaComChantilly = new ChantillyDecorator(bebidaComChocolate);
        System.out.println(bebidaComChantilly.getDescricao() + ": R$ " + bebidaComChantilly.getPreco());

        Bebida bebidaComAcucar = new AcucarDecorator(bebidaComChantilly);
        System.out.println(bebidaComAcucar.getDescricao() + ": R$ " + bebidaComAcucar.getPreco());
    }
}
