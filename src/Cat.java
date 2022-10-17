public class Cat extends Animal {
    boolean hasKittens;

    public Cat(String gender, int age, boolean hasKittens) {
        super(gender, age);
        this.hasKittens = hasKittens;
    }

    @Override
    @RunImmediately(times = 2)
    public void makeNoise(){
        System.out.println("Meow");
    }

    public boolean isHasKittens() {
        return hasKittens;
    }

    public void setHasKittens(boolean hasKittens) {
        this.hasKittens = hasKittens;
    }

}
