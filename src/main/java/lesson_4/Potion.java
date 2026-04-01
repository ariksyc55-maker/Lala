package lesson_4;

public class Potion {
    private PotionType type;
    private int quantity;

    Potion(PotionType type, int quantity){
        this.type = type;
        this.quantity = quantity;
    }
    PotionType getType(){
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
    void use(Hero hero){
        hero.heal(type.getEffectValue());
        System.out.println("Вы выпили " + type.getDisplayName() + ". Восcтановлено " + type.getEffectValue() + " HP.");
        quantity--;
    }
    boolean isEmpty(){
        return quantity <= 0;
    }
}
