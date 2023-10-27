package O2_DSA_intermediate.O1_27042022_intermediate_dsa_introduction_to_problem_solving;

public class Jailer3_binary_search {
    private static int getOpenDoorCount(int noOfDoors, int noOfRounds) {

        int min = 1;
        int max = noOfDoors;
        int noOfOpenDoors = 0;
        while(min <= max) {
            int mid = (min + max) / 2;
            if(mid * mid <= noOfRounds) {
                noOfOpenDoors = mid;
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }

        return noOfOpenDoors;
    }

    public static void main(String[] args) {
        System.out.println(getOpenDoorCount(100, 100));
    }

}
