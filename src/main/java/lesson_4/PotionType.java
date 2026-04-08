package lesson_4;

public enum PotionType {
    HEALING("Зелье исцеления", 50);

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
}
