import java.util.Arrays;

public class tableau16012025 {


    public static void main(String[] args) throws Exception {


    String table[ ] = new String[]{"Paris","Tokyo","Londres","Madrid","New York"};
    String tabled2[][] = new String[][]{
        
        {"Paris","Lyon","Marseille"},
        {"Londres","Manchester","Liverpool"},
        {"Madrid","Barcelone","valence"},
    };

    
    /*
    for(int i=0; i < table.length; i++){
        
        System.out.println("cellule n°"+i+" :"+ table[i]);

    } */

     int y = 0;

     for (String i : table) { 

        System.out.println("cellule n°"+y+" :"+ i);

        y++;

     } 

     table[3]=table[4];

    System.out.println(Arrays.toString(table));
    System.out.println(tabled2[0][2]);


    }

}
