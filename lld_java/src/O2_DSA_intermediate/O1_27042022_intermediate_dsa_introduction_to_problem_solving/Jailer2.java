package O2_DSA_intermediate.O1_27042022_intermediate_dsa_introduction_to_problem_solving;

//- There is a circular jail with 100 cells numbered from 1 to 100.
//- Each cell has an inmate and the door is initially locked.
//- One night the jailer gets drunk and he goes around the jail in circles.
//- In ‘ith round’ he goes to every door which is multiple of I and changes the state of the
//door. If the door is open, he will close it and vice versa.
//- He makes a total of 100 rounds, how many prisoners found their door open after 100
//rounds ?

public class Jailer2 {

    private static int getOpenDoorCount(int noOfDoors, int noOfRounds) {
        int i = 1;
        int noOfOpenDoors = 0;
        while(i * i <= noOfRounds) {
            noOfOpenDoors++;
            i++;
        }
        return noOfOpenDoors;
    }

    public static void main(String[] args) {
        System.out.println(getOpenDoorCount(100, 100));
        // System.out.println(getOpenDoorCount(10, 5));
    }

}
