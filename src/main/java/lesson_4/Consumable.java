package lesson_4;

public class Consumable { //
    private PotionType type;
    private int quantity;

    public Consumable(PotionType type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public PotionType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void use(Hero hero) {
        switch (this.type) {
            case HEALING:
                hero.heal(this.getQuantity() * 50);
                break;
            case STRONGEST_ATTACK:
                int currentUsed = hero.getUsedStrongestAttacks();
                if (currentUsed > 0) {
                    hero.setUsedStrongestAttacks(currentUsed - 1);
                    System.out.println(hero.getName() + " восстановил 1 сильнейшую атаку!");
                } else {
                    System.out.println(hero.getName() + " и так имеет максимальное количество сильнейших атак!");
                }
                break;
        }
        this.quantity--;
    }

    boolean isEmpty() {
        return quantity <= 0;
    }
}
