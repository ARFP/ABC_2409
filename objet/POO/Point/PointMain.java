public class PointMain {
    public static void main(String[] args) {


        Point point = new Point(12, 48);
        System.out.println("\nCoordonnées de départ :\n"+point.toString());

        point.modifCoord(25, 8);
        System.out.println("\nModification des coordonnées :\n"+point.toString());
        point.symmetrieOrd();
        System.out.println("\nSymmétrie par rapport aux oordonnées :\n"+point.toString());
        point.symmetrieAbs();
        System.out.println("\nSymmétrie par rapport aux abscisses :\n"+point.toString());
        point.symmetrieOrg();
        System.out.println("\nSymmétrie par rapport à l'origine :\n"+point.toString());
        point.echange();
        System.out.println("\nPermutation des coordonnées :"+point.toString());
    }
}
