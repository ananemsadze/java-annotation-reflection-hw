public class Cat extends Animal {
    boolean hasKittens;

    public Cat(String gender, int age, boolean hasKittens) {
        super(gender, age);
        this.hasKittens = hasKittens;
    }

    @Override
    public void makeNoise(){
        System.out.println("Meow");
    }
}
