package level6;

public class JavaArrays {
    public static void main(String[] args) {

//        // Single Dimensional Array
//        int[] nums = {2, 3, 4, 5, 6, 6, 7, 8 };
//
//        // Using for loop
//
//        for(int i = 0; i <= nums.length - 1; i++){
//            System.out.println(nums[i]);
//        }
//
//        // Using for each loop
//        for(int numbers: nums){
//            System.out.println(numbers);
//        }

        // multi dimensional array
        int[][] numbs = { {1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}};

        // Using for loop
        for(int i = 0; i <= numbs.length - 1; i++){
            for(int j = 0; j <= numbs[i].length - 1; j++){
                System.out.println(numbs[i][j]);
            }
        }

        // Using for each loop

        for(int[] numbers: numbs){
            for(int number: numbers){
                System.out.println(number);
            }
        }

    }
}
