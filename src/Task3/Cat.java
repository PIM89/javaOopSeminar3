package Task3;

public class Cat extends Animal implements AnimalAction{
    final String type = "cat";
    private String breed;       // порода
    private String typeOfWool;  // тип шерсти

    public Cat(String name, String colour, int weight, int height, String breed,
               String typeOfWool, boolean gender) {
        super(name, colour, weight, height, gender);
        this.breed = breed;
        this.typeOfWool = typeOfWool;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println(this.getType() + " " + this.getName() + " мяучит");
    }
}
