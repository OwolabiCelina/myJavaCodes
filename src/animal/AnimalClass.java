package animal;

public class AnimalClass {
    private String name;
    private String skinColor;
    private String type;
    private String sex;

    public AnimalClass(String name, String skinColor, String type, String sex){
        this.name = name;
        this.skinColor = skinColor;
        this.type = type;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String name(){

        return "My name is Dog";
    }
    public String Sex(){
        return "I am a male ";
    }
    public String skinColor(){
        return "I'm black in color";
    }
    public String type(){
        return "Am a land animal";
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s", name, skinColor, type, sex);
    }
}
