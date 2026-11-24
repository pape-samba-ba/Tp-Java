public class argument {
    public static void main(String[] args) {
    System.out.println(args[0]);
    int quantite = Integer.parseInt(args[2]);
    double prix = Double.parseDouble(args[1]);
    System.out.println("la quantite est "+quantite);
    System.out.println("le prix est " +prix);
    }
}