package lesson_4;

public enum PotionType {
    HEALING("Зелье исцеления", 50),
    STRONGEST_ATTACK("Зелье восстановление атак", 2);


    private final String displayName;
    private final int effectValue;

    PotionType(String displayName, int effectValue) {
        this.displayName = displayName;
        this.effectValue = effectValue;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void use(Hero hero) {
        if (this == PotionType.HEALING) {
            hero.heal(getEffectValue());
            System.out.println("Вы выпили " + getDisplayName() + ". Восcтановлено " + getEffectValue() + " HP.");
        } else if (this== PotionType.STRONGEST_ATTACK) {
            hero.addAnAttack(getEffectValue());
            System.out.println("Вы выпили " + getDisplayName() + ". Восстановлен " + getEffectValue() + " заряд сильнейшей атаки.");
        }
    }
}