import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class LandingPrint {

    public static void main(String[] args) {
        List<Integer> landingZone = new ArrayList<>(List.of(9,9,8,7,6,6,6,6,5,2,2,2,3,4,1,1,9));
        printLandscape(landingZone);
        System.out.println("-------------------------------------------------------------------");
        printLandscape(landGen(8,9));
    }

//0 for air " "
//1 for land "_"
//2 for under "@"


    public static void printLandscape(List<Integer> landingZone){
        System.out.println(findMax(landingZone));
        int[][] list = new int[landingZone.size()][findMax(landingZone)];
        for(int i = 0; i <= landingZone.size()-1; i++){
            int currentLocationHeight = landingZone.get(i);
            //fill above
            for (int j=findMax(landingZone) - currentLocationHeight-1; j>=0; j--){
                list[i][j] = 0;
            }
            //fill location
            list[i][findMax(landingZone)-currentLocationHeight] = 1;
            //fill below
            for (int j=findMax(landingZone)-1; j>findMax(landingZone)-currentLocationHeight; j--){
                list[i][j] = 2;
            }
        }
        printer(landingZone.size(),findMax(landingZone), list);
    }

    public static int findMax(List<Integer> landingZone){
        int max = -1;
        for(int i = 0; i <= landingZone.size()-1; i++){
            if(landingZone.get(i) > max){
                max = landingZone.get(i);
            }
        }
        return max;
    }

    public static void printer(int height, int length,int[][] list){
        for(int i=0; i<length; i++){
            for(int j=0; j<height; j++){
                printCharacterMapper(list[j][i]);
            }
            System.out.printf("%n");
        }
    }

    public static void printCharacterMapper(int value){
        if(value == 0){
            System.out.print(" ");
        }
        if(value == 1){
            System.out.print("_");
        }
        if(value == 2){
            System.out.print("@");
        }
    }

    // Method to where the problem is
    public static List<Integer> landGen(int landLength, int landHeight){
        List<Integer> landscape = new ArrayList<Integer>();

        //If I am not mistaken, if a list ranges from 1-10, it
        // will actually only take 1-9 because 10 is the bound.
        Random r = new Random();

        for(int i=0; i<landLength-1; i++){

            //Therefore, something to do with this random is taking the upper bound index
            //but not actually grabbing it because it's a number that is out of bounds

            //A fix is to add the "+1" so that it can reach the upper bound?
            landscape.add(r.nextInt(1, landHeight));
        }
        return landscape;
    }
}
