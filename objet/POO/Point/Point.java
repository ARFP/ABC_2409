public class Point {
    
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }


    public String toString() {


        String result = "Absicesse :"+this.x+"\nOrdonnée :"+this.y;

        return "\n**************************\n"+result+"\n**************************\n";
    }

    public void modifCoord(double changex, double changey) {

        this.x = changex;
        this.y = changey;
    }


    public void symmetrieOrd() {

        this.x*=(-1); 
    }

    public void  symmetrieAbs() {
        this.y*=(-1);
    }

    public void symmetrieOrg() {

        this.symmetrieOrd(); 
        this.symmetrieAbs();
    }

    public void echange() {

        double temp;
        temp = this.x;
        this.x = this.y;
        this.y = temp;
        
    }
}
