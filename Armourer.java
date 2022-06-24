package model.heroes;

public class Armourer extends HeroSkillsDecorator{
    private Hero hero;

    public Armourer(Hero hero){
        this.hero = hero;
    }

    @Override
    public String abilities() {
        return hero.abilities() + " Skille: naprawa eq";
    }
}
