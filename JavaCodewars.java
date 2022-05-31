public class JavaCodewars {
    public static void main(String[] args) {
        System.out.println(digital_root(987));
    }


    //  TODO: Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this wayuntil a single-digit number is produced. The input will be a non-negative integer.
    public static int digital_root(int n) {
        String nToString = String.valueOf(n);
        String[] stringArr = nToString.split("");
        if (stringArr.length == 1) {
            return n;
        } else {
            int intArr[] = new int[stringArr.length];
            int multiTotal = 0;
            for (int i = 0; i < stringArr.length; i++) {
                intArr[i] = Integer.parseInt(stringArr[i]);
            }
            for (int i = 0; i < intArr.length; i++) {
                multiTotal += intArr[i];
            }
            return digital_root(multiTotal);
        }




    }
}
