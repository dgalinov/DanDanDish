public class Player {
    private int life;
    private String name;
    private int bullet;

    public Player(){
        this.life = 3;
        this.bullet = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBullet(){
        this.bullet++;
    }

    public void substractBullet(){
        this.bullet--;
    }

    public boolean hasBullet(){
        return this.bullet > 0;
    }

    public boolean isDead(){
        return this.life == 0;
    }

    public void substractLife(){
        this.life--;
    }

    @Override
    public String toString() {
        return "Player{" +
                "life=" + life +
                ", name='" + name + '\'' +
                ", bullet=" + bullet +
                '}';
    }
}
