package lesson_1;

public class hello {
    public static void main(String[] args) {
        System.out.println();
        BMICalulater(1.72f ,72f);
    }

    private static void BMICalulater(float height, float weight) {
        float BMI = weight/( height*2 );
        if(BMI <= 18.5f) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5f & BMI <= 24.9f)
        {
            System.out.println("Normal weight");
        }
        else if (BMI >= 25f & BMI <= 29.9f)
        {
            System.out.println("Normal weight");
        } else
        {
            System.out.println("Obesity");
        }
    }
    private static void isNumberIsOdd(int number) {
        if(number % 2 != 0) {
            System.out.println(number + " is a Odd Number");
        } else
        {
            System.out.println(number + " is a Even Number");
        }
    }


}
