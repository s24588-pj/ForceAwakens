package model.heroes;

public class Mage extends HeroSkillsDecorator{
    private Hero hero;

    public Mage(Hero hero){
        this.hero = hero;
    }

    @Override
    public String abilities() {
        return hero.abilities() + " Skille: czarowanie, eliksiry";
    }
}
