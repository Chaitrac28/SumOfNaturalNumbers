public class SumOfNaturalNumbers {
    public static void main(String[] arg){
        final int start = 5;
        final int end = 100;
        int sumOfNaturalNumbers =  (end - start + 1) * (start + end) / 2;
        System.out.printf("Sum Of Natural Number from %d until %d is %d", start, end , sumOfNaturalNumbers);  
    }
}
