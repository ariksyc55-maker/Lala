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
            if (this.type == PotionType.HEALING) {
                hero.heal(type.getEffectValue());
                System.out.println("Вы выпили " + type.getDisplayName() + ". Восстановлено " + type.getEffectValue() + " HP.");
            } else if (this.type == PotionType.STRONGEST_ATTACK) {
                hero.addAnAttack(type.getEffectValue());
                System.out.println("Вы выпили " + type.getDisplayName() + ". Восстановлен " + type.getEffectValue() + " заряд сильнейшей атаки.");
            }
            quantity--;
        }

    boolean isEmpty() {
        return quantity <= 0;
    }
}
