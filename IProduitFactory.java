package modifie.abstractfactory;

/** Fabrique abstraite : une methode de creation par type de produit. */
public interface IProduitFactory {
    public ProduitA getProduitA();
    public ProduitB getProduitB();
}
