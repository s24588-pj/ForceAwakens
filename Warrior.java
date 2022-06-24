package model.heroes;

public class Warrior extends HeroSkillsDecorator{
    private Hero hero;

    public Warrior(Hero hero){
        this.hero = hero;
    }

    @Override
    public String abilities() {
        return hero.abilities() + " Skille: walka wrecz, mieczem, toporem, wlocznia";
    }
}
