package complements.commeenc; 
public class Premier { 
    private static boolean estPremier(final int nb) { 
        if (nb == 1) { return false; } 
        for (int i=2; i<= nb/2; i++) { 
           if (nb%i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
    public static void main(String[] args) { 
        int nombre = Console.readInt("Entrez_un_nombre_entier"); 
        System.out.println("Le nombre" + nombre + "est_il_premier ?"); 
        System.out.print("Le_nombre_" + nombre); 
        if (estPremier(nombre)) { 
            System.out.println("est␣premier"); 
        } else { 
            System.out.println("n’est_pas_premier"); 
        } 
    } 
}
