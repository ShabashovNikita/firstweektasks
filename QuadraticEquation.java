package firsttask;

public class QuadraticEquation {
    private final int a;
    private final int b;
    private final int c;
    private final Discriminant discriminant;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = new Discriminant();
;
    }

    public Answer getAnswer() {
        Answer answer = new Answer((-b + Math.sqrt(discriminant.getValue())) / 2, (-b - Math.sqrt(discriminant.getValue())) / 2);
        return answer;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 2;
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        equation.getAnswer();
        System.out.println(equation.getAnswer().getAns1());
        System.out.println(equation.getAnswer().getAns2());
    }

    private class Discriminant {
        private final int d = b * b - 4 * a * c;

        public int getValue() {
            return d;
        }
    }
}
