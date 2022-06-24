package model.heroes;

public class Hunter extends HeroSkillsDecorator{
    private Hero hero;

    public Hunter(Hero hero){
        this.hero = hero;
    }

    @Override
    public String abilities() {
        return hero.abilities() + " Skille: skradanie, strzelectwo";
    }
}
