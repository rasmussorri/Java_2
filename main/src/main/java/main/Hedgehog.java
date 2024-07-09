package main;

public class Hedgehog {
    String name;
    int age;

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void Speak(String hedgehogSays){
        if(hedgehogSays.isEmpty()){
            System.out.println("Olen " + name + " ja ikäni on " + age + " vuotta, mutta antaisitko silti syötteen?");
        }
        else{
            System.out.println(name + ": " + hedgehogSays);
        }
    }

    public void Run(int laps){
        while(laps > 0){
            System.out.println(name + " juoksee kovaa vauhtia!");
            laps --;
        }
    }
}
