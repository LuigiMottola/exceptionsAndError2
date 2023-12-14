public class Main {
    public static void main(String[] args) {
        char charTest = 'j';
        charNumberController(charTest);
    }
    public static void charNumberController(char character){
        if (Character.isDigit(character)){
            System.out.println(character + "is a number");
        } else {
            throw new ArithmeticException(character + " is not a number");
        }
    }
}
