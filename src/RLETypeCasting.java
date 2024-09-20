public class RLETypeCasting {
    public static void main(String[] args) {
        int userScore = 300;
        int maxScore = 500;
        float percentage;

        percentage = ((float) userScore / maxScore) * 100.0f;
        System.out.println(percentage);
    }
}
