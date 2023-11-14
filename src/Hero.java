public class Hero {
    private  int   heroHelth;
    private  int heroDamage;
    private  String heroSuper;




    public String getHeroSuper() {
        return heroSuper;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroHelth() {
        return heroHelth;
    }


    public Hero(int heroHelth,int heroDamage , String heroSuper) {
        this.heroHelth = heroHelth;
        this.heroDamage = heroDamage;
        this.heroSuper = heroSuper;
    }
    public Hero(int heroHelth,int heroDamage ) {
        this.heroHelth = heroHelth;
        this.heroDamage = heroDamage;

    }

}
