package model.heroes;

public class Assassin extends HeroSkillsDecorator{
    private Hero hero;

    public Assassin(Hero hero){
        this.hero = hero;
    }

    @Override
    public String abilities() {
        return hero.abilities() + " Skille: skradanie, trucizna, walka wrecz";
    }
}
