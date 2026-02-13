import java.util.ArrayList;
import java.util.List;

// 1.a A plane can only land when there is a strip of land of the same height X. Write something that given an array of land heights, can calculate how many landing spots are available
// 1.b Now alter 1.a so that the landing spots are chunked together. ex: x=2 {1,2,2,3,3,4,4,4,4} would give 3 because {1,|2,2|,|3,3|,|4,4,4,4|}
//                                                                                                                         1     2       3
// 1.c Some planes can only land when there is X amount of land at Y height. Create a method that can calculate the number of unique height patches the plane can land
// 2. Print out a map of the landing area with air = " ", land = "_" and the ground underneath = '@'
// 3.a Create a plane object that contains a name, height which the plane can land, and the amount of land needed for the plane to land
// 3.b Create a land object that contains the land height, land width (chunk length), starting index, and ending index

public class Landing {
    public static void main(String[] args) {
        List<Integer> landingZone = new ArrayList<>(List.of(9,9,8,7,6,6,6,6,5,2,2,2,3,4,1,1,9));

        //if ref and next are the same, set some boolean to true
        //store every pair where a boolean is true

        //print out a way to show that the plane can land when the boolean is true

        landingPosition(landingZone,6, 3);
    }

    public static void landingPosition (List<Integer> landingZone, int intLandHeight, int intLandWidth) {

        //1a
        /*
        int countLandings = 0;

        for (int i = 0; i < landingZone.size(); i++) {
            if (intLandHeight == landingZone.get(i)) {
                countLandings++;
            }
        }
        System.out.println(countLandings);*/

        //1b
//        int countLandings = 0;
//
//        for (int i = 0; i < landingZone.size(); i++) {
//            if (intLandHeight == landingZone.get(i)) {
//                for (int j = i; j <= landingZone.size() - 1; j++) {
//                    if (landingZone.get(i) != landingZone.get(j)) {
//                        i = j;
//                        countLandings++;
//                        break;
//                    }
//                    if (j == landingZone.size() - 1) {
//                        countLandings++;
//                    }
//                }
//            }
//        }
//        System.out.println(countLandings);








/*        int landHeight = intLandHeight;
        int countHeightLandings = 0;

        // initializing variables
        int countIterations = landingZone.toArray().length;
        int countLandings = 0; //number possible = 7
        //int[] arrLandings = {};



        //check to see if reference pointer and next pointer are the same number
        for (int i = 0; i < countIterations - 1; i++){
            int count = i + 1;
            int refNum = landingZone.get(i);
            int nextNum = landingZone.get(count);

            if ((refNum == intLandHeight) || (nextNum == intLandHeight)) {
                //countLandings++;
                //if (refNum == landHeight) {
                    countHeightLandings++;
                //}
                //arrLandings[i] = refNum;
                //arrLandings[count] = nextNum;
            }

        }
        System.out.println("You can land: " + countHeightLandings + " times.");*/
    }

}

