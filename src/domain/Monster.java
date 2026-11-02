package domain;

public class Monster {
    private String name;
    private Integer hp;
    private Integer maxHp;


    public Monster(String name, Integer maxHp) {
        this.name = name;
        this.hp = maxHp;
        this.maxHp = maxHp;
    }

    /**
     * 攻击
     *
     * @param damageNum
     * @return
     */
    public Integer takeDamage(Integer damageNum) {

        if (damageNum > this.hp) {
            this.hp = 0;
            return 0;
        } else if (damageNum < 0) {
            return heal(damageNum * -1);
        } else {
            this.hp -= damageNum;
            return hp;
        }
    }

    /**
     * 治疗
     * @param healNum
     * @return
     */
    public Integer heal(Integer healNum) {
        if (healNum + this.hp >= this.maxHp) {
            this.hp = this.maxHp;
            return this.maxHp;
        } else if (healNum < 0) {
            return takeDamage(healNum * -1);
        } else {
            this.hp += healNum;
            return hp;
        }

    }

    /**
     * 是否死亡
     * @return
     */
    public boolean isDead() {
        if (this.getHp() == 0) {
            return true;
        } else {
            return false;
        }
    }


    public String getName() {
        return name;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

}
