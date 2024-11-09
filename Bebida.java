// Interface Bebida
interface Bebida {
    String getDescricao();
    double getPreco();
}

// Classe concreta Cafe que implementa Bebida
class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}

// Classe abstrata BebidaDecorator que implementa Bebida
abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco();
    }
}

// Decorador concreto para adicionar Leite
class LeiteDecorator extends BebidaDecorator {
    public LeiteDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}

// Decorador concreto para adicionar Açúcar
class AcucarDecorator extends BebidaDecorator {
    public AcucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Açúcar";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.5;
    }
}

// Decorador concreto para adicionar Chocolate
class ChocolateDecorator extends BebidaDecorator {
    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 3.0;
    }
}

// Decorador concreto para adicionar Chantilly
class ChantillyDecorator extends BebidaDecorator {
    public ChantillyDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 5.0;
    }
}

