public class IncrementDecrementOperators{

    public static void main(String[] args){

        int number = 10;
        
        System.out.println("Original value : " + number);


        System.out.println("post increment value : " + number++);
        System.out.println("After post increment value : " + number);

        System.out.println("pre increment value : " + ++number);

        System.out.println("post Decrement value : " + number--);
        System.out.println("After post decrement  value : " + number);

        System.out.println("pre decrement value : " + --number);
    }
}