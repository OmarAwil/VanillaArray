public class VanillaArray {
    public static void main(String[] args) {
        int[] array = {1, 1, 11, 1111, 1111111};
        boolean isVanilla = true;
        char firstDigit = Integer.toString(array[0]).charAt(0);

        for (int num : array) {
            if (!Integer.toString(num).replace(firstDigit, ' ').trim().isEmpty()) {
                isVanilla = false;
                break;
            }
        }

        System.out.println("The array is vanilla: " + isVanilla);
    }
}
