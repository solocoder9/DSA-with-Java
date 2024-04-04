public class AnonymousArray {

    public static void sum(int[] arr) {
        int total = 0; 

        for (int num: arr) {
            total += num;
        }

        System.out.println(total);
    }

    public static void main(String[] args) {

        // Anonymous array
        sum(new int[] {10, 20, 30, 40});
    }
}
