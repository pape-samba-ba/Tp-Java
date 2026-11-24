public class InformationEtudiant {
    public static void main(String[] args) {
        String nom_complet;
        int age;
        double moyenne_generale;
        char premier_lettre_prenom;
        boolean status_inscription;
           
        nom_complet = "Mariama D Cisse";
        age = 20;
        moyenne_generale = 15.5;
        premier_lettre_prenom = 'M';
        status_inscription = true;

        System.out.println("Nom complet : " + nom_complet);
        System.out.println("Âge : " + age);
        System.out.println("Moyenne générale : " + moyenne_generale);
        System.out.println("Première lettre du prénom : " + premier_lettre_prenom);
        System.out.println("Statut d'inscription : " + status_inscription);

    }
}