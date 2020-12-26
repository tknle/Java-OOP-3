
import edu.duke.*;
import java.io.*;
import java.util.Random;

public class RollTheDices {

    public void simulate( int rolls){
        Random rand = new Random();
        int [] counts = new int [13];
        
        for(int k=0; k<rolls ; k++){
            
            int d1 = rand.nextInt(6) +1;
            int d2 = rand.nextInt(6) +1;
            counts[d1+d2] +=1;
        }
         for(int k=2;k<12;k++){
             System.out.println(k+"'s\t" + counts[k] + "\t" + 100.0*counts[k]/rolls);
             
}
}
}