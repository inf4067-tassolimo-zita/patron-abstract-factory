package modifie.abstractfactory;

public class Client {
    /** La famille (categorie) n'est connue qu'a l'execution. */
    static IProduitFactory choisirFabrique(String famille) {
        switch (famille) {
            case "1": return new ProduitFactory1();
            case "2": return new ProduitFactory2();
            case "3": return new ProduitFactory3();
            default: throw new IllegalArgumentException("Famille inconnue : " + famille);
        }
    }

    /** Le client ne manipule que les types abstraits. */
    static void utiliser(IProduitFactory fabrique) {
        ProduitA produitA = fabrique.getProduitA();
        ProduitB produitB = fabrique.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }

    public static void main(String[] args) {
        String[] familles = args.length > 0 ? args : new String[] {"1", "2", "3"};
        for (String f : familles) {
            System.out.println("Utilisation de la fabrique de la famille " + f);
            utiliser(choisirFabrique(f));
        }
    }
}
