public class App {

    public static void main(String[] args) throws Exception {
        double[] leftValue = { 100.0d, 260.0d, 11.0d, 225.0d };
        double[] rightValue = { 50.0d, 100.0d, 15.0d, 200.0d };
        String[] option = { "a", "s", "m", "d" };
        double[] result = new double[option.length];
        for (int i = 0; i < option.length; i++) {
            result[i] = execute(option[i], leftValue[i], rightValue[i]);
        }
        for (double currenResult : result) {
            System.out.println(currenResult);
        }
    }

    static double execute(String optionString, double leftVal, double rightVal) {
        double result;
        switch (optionString) {
            case "a":
                result = leftVal + rightVal;
                break;
            case "s":
                result = leftVal - rightVal;
                break;
            case "m":
                result = leftVal * rightVal;
                break;
            case "d":
                result = rightVal != 0 ? rightVal / leftVal : 0.0d;
                break;

            default:
                System.out.println("Invalid option!");
                result = 0.0d;
                break;

        }
        return result;
    }
}
