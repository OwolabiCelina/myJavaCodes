package assignment;

import java.util.Scanner;

public class PersonalityTest2 {
    public static void main(String[] args) {
        banke();
        checkPersonality();
    }

    private static final int[][] test = new int[4][2];

    static void banke() {
        Scanner input = new Scanner(System.in);
        String response;

        test[0][0] = 0;
        test[0][1] = 0;
        test[1][0] = 0;
        test[1][1] = 0;
        test[2][0] = 0;
        test[2][1] = 0;
        test[3][0] = 0;
        test[3][1] = 0;


        for (int i = 0; i <= 20; i++) {
            System.out.println("Choose between A or B");
            switch (i) {
                case 1-> {
                    System.out.println("""
                                    1.
                            A. Expend energy, enjoy groups
                            B. Conserve energy, enjoy one-one
                            """);
                    response = input.nextLine();
                    if (response.equalsIgnoreCase("A")) {
                        test[0][0]++;
                    } else
                        test[0][1]++;
                }
                    case 2 -> {
                        System.out.println("""
                                        2.
                                A. interpret literally,
                                B. look for meaning and possibilities""");
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[1][0]++;
                        } else
                            test[1][1]++;
                    }
                    case 3 -> {
                        System.out.println("""
                                        3.
                                A. Logical, Thinking, Questioning
                                B. Empathetic, Feeling, Acomodating
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[2][0]++;
                        } else
                            test[2][1]++;

                    }
                    case 4 -> {
                        System.out.println("""
                                        4.
                                A. Organised, Orderly
                                B. Flexible, Adaptable
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[3][0]++;
                        } else
                            test[3][1]++;
                    }
                    case 5 -> {
                        System.out.println("""
                                        5.
                                A. More outgoing, Think out loud
                                B. More reserved, Think to yourself
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[0][0]++;
                        } else
                            test[0][1]++;
                    }
                    case 6 -> {
                        System.out.println("""
                                        6.
                                A. practical, realistic, experiential
                                B. imaginative, innovative,theoretical
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[1][0]++;
                        } else
                            test[1][1]++;
                    }
                    case 7 -> {
                        System.out.println("""
                                        7.
                                A.Candid, straight, forward, frank
                                B. Tactful, kind, encouraging
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[2][0]++;
                        } else
                            test[2][1]++;

                    }
                    case 8 -> {
                        System.out.println("""
                                        8.
                                 A. Plan, Schedule
                                 B. unplanned, spontaneous
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[3][0]++;
                        } else
                            test[3][1]++;
                    }
                    case 9 -> {
                        System.out.println("""
                                        9.
                                A. Seek many tasks, public activities, interaction with others
                                B. Seek private, solitary activities with quiet to concentrate
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[0][0]++;
                        } else
                            test[0][1]++;
                    }
                    case 10 -> {
                        System.out.println("""
                                        10.
                                A. Standard, Usual, Conventional
                                B. Different, Novel, Unique
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[1][0]++;
                        } else
                            test[1][1]++;
                    }
                    case 11 -> {
                        System.out.println("""
                                        11.
                                A. Firm, tend to criticize, hold the line
                                B.Gentle, tend to appreciate, concillate
                                 """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[2][0]++;
                        } else
                            test[2][1]++;

                    }
                    case 12 -> {
                        System.out.println("""
                                        12
                                A. Regulated, structured
                                B. Easygoing, "live" and "let live"
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[3][0]++;
                        } else
                            test[3][1]++;
                    }
                    case 13 -> {
                        System.out.println("""
                                        13.
                                A. External, communicative, express yourself
                                B. Internal, reticent, keep to yourself
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[0][0]++;
                        } else test[0][1]++;
                    }
                    case 14 -> {
                        System.out.println("""
                                        14
                                A. Focus on here-and-now
                                B. Look to the future, global perspective, "big picture"
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) test[1][0]++;
                        else test[1][1]++;
                    }
                    case 15 -> {
                        System.out.println("""
                                        15.
                                A. Tough-minded, just
                                B. Tender-hearted and merciful
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[2][0]++;
                        } else test[2][1]++;
                    }
                    case 16 -> {
                        System.out.println("""
                                       16.
                                A. Preparation, plan ahead
                                B. Go with the flow, adapt as you go
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[3][0]++;
                        } else test[3][1]++;
                    }
                    case 17 -> {
                        System.out.println("""
                                           17
                                A. Active, initiate
                                B. Reflective, deliberate
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[0][0]++;
                        } else test[0][1]++;
                    }
                    case 18 -> {
                        System.out.println("""
                                        18.
                                A. Facts, things, "what is"
                                B. Ideas, dreams, "what could be" philosophical
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[1][0]++;
                        } else test[1][1]++;
                    }
                    case 19 -> {
                        System.out.println("""
                                        19
                                A. Matter of fact, issue-oriented
                                B. Sensitive, people-oriented, compassionate
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("A")) {
                            test[2][0]++;
                        } else test[2][1]++;
                    }
                    case 20 -> {
                        System.out.println("""
                                        20
                                A. Control, govern
                                B. Latitude, freedom
                                """);
                        response = input.nextLine();
                        if (response.equalsIgnoreCase("a")) {
                            test[3][0]++;
                        } else test[3][1]++;
                    }
            }
        }
    }
    public static void checkPersonality(){
        if (test[0][0] > test[0][1] ){
            System.out.print("E");
        }
        else {
            System.out.print("I");
        }
        if (test[1][0] > test[1][1]) {
            System.out.print("S");
        }
        else {
            System.out.print("N");
        }
        if (test[2][0] > test[2][1]){
            System.out.print("T");
        }
        else{
            System.out.print("F");
        }
        if (test[3][0] > test[3][1]) {
            System.out.print("J");
        }
        else{
            System.out.print("P");
        }
    }
}
