package controlStatement.loop;

public class LoopExercise {
    public static void main(String[] args) {

        char letters = 'G';
        switch (letters){
            case 'A':
                System.out.println("letter is A");
                break;
            case 'B':
                System.out.println("letter is B");
                break;
            case 'C':
                System.out.println("letter is C");
                break;
            case 'D':
                System.out.println("letter is D");
                break;
            case 'E':
                System.out.println("letter is E");
                break;
            case 'F': case 'G': case 'H':
                System.out.println("letter was F, or G, or H");
                System.out.println("The letter was " + letters);
                break;
            default:
                System.out.println("letter was not A, or B, or C, or D, or E");
                break;
        }
    }
}
