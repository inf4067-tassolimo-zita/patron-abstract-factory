package modifie.abstractfactory;

/** Fabrique concrete de la famille 1. */
public class ProduitFactory1 implements IProduitFactory {
    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
