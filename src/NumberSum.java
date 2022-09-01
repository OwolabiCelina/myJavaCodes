public class NumberSum {
    public static void main(String[] args) {

//        for (int y = 99; y > 3; y += 3);
//        for (int i = 0; i != i +1; )
//    }
        System.out.println("x += y++");
        for (int x = 7; x <= 10; x++){
        for(int y = 3; y <= 11; y++){
            x += y++;
            System.out.println(x);
        }}


        System.out.println();
        System.out.println("y += x++");
        for (int x = 7; x <= 10; x++){
            for(int y = 3; y <= 11; y++){
                y += x++;
                System.out.println(x);
            }}
    }
}
