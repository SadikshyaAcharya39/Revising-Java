package level6;

public class Animals {

    public void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

class Lion extends Animals {

    @Override
    public void makeSound(){
        System.out.println("Roar");
    }
}

class Tiger extends Animals{
    @Override
    public void makeSound(){
        System.out.println("Grow");
    }
}

class Elephant extends Animals{
    @Override
    public void makeSound(){
        System.out.println("Trumpet");
    }
}

class Bird extends Animals{
    @Override
    public void makeSound(){
        System.out.println("Chirp");
    }
}

class Zoo{
    public static void main(String[] args) {

//        Animals animals = new Animals();
//        animals.makeSound();

        Animals lion = new Lion();
        lion.makeSound();

        Animals tiger = new Tiger();
        tiger.makeSound();

        Animals elephant = new Elephant();
        elephant.makeSound();

        Animals bird = new Bird();
        bird.makeSound();

    }
}
