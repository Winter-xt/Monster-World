package domain;

public class MonsterTest {
    public static void main(String[] args) {
        Monster pika = new Monster("Pika", 100);
        Integer i = pika.takeDamage(20);
        Integer i1 = pika.takeDamage(100);
        Integer heal = pika.heal(10);
        Integer heal1 = pika.heal(100);
        Integer hp = pika.getHp();
        boolean dead = pika.isDead();
    }
}
