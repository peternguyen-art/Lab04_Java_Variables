public class Main {
    public static void main(String [] args){
        int intOperandA = 2;
        int intOperandB = 34;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;
        intSum = intOperandA + intOperandB;
        intDifference = intOperandB - intOperandA;
        intProduct = intOperandA*intOperandB;
        intQuotient = intOperandB/intOperandA;
        intModulo = intOperandB % intOperandA;
        System.out.println("Integer intOperandA is "+intOperandA);
        System.out.println("Integer intOperandB is "+intOperandB);
        System.out.println("Sum of the integers is "+intSum);
        System.out.println("Different of the two integers is "+intDifference);
        System.out.println("Quotient of the two integers is "+intQuotient);
        System.out.println("Modulo of the two integers is "+intModulo);
    }
}
