package animal;

public class Dog extends AnimalClass{
    private String bite;

    public Dog(String name, String skinColor, String type, String sex, String bite) {
        super(name, skinColor, type, sex);
        this.bite = bite;
    }
    

}
