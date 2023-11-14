
public class Main {
    public static void main(String[] args) {
        Hero heroew = new Hero(500, 50, "MAGICAL");
        System.out.println("Hero health: " + heroew.getHeroHelth() + "  Hero damage: "
                + heroew.getHeroDamage() + "   Hero SuperPower : " + heroew.getHeroSuper());
        Hero herow2 = new Hero(400, 40);
        System.out.println("Hero health: " + herow2.getHeroHelth() + "  Hero damage: "
                + herow2.getHeroDamage());

        System.out.println();

        Boss bosss = new Boss();
        bosss.setBossHealth(600);
        bosss.setBossDamage(60);
        bosss.setBossDefence("Phisical");

        System.out.println("Boss health: " + bosss.getBossHealth() + "   Boss damage: " + bosss.getBossDamage()
                + "  Boss Defence: " + bosss.getBossDefence());

        System.out.println();


        Hero[] arayssHer = greateHeroes();
        for (Hero hero : arayssHer) {
            System.out.println("Heroes health:   " + hero.getHeroHelth() + "  Heroes damage :    " + hero.getHeroDamage()
                    + "    Heroes damage :   " + hero.getHeroSuper());
        }
    }

    public static Hero[] greateHeroes() {
        Hero hero1 = new Hero(300, 30, "Magical");
        Hero hero2 = new Hero(350, 35, "Physical");
        Hero hero3 = new Hero(200, 20, "Kinetic");
        Hero[] arrays = {hero1, hero2, hero3};
        return arrays;


    }

}
