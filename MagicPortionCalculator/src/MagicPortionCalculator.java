public class MagicPortionCalculator {
    public static  void main(String[] args){
        int magicEssence = 100;
        int dragonScale = 400;
        float uniCornHair = 8.9f;
         int convertUniCornHair = (int) uniCornHair;
         int portionPower = (dragonScale * convertUniCornHair) / magicEssence;
         System.out.println("The portion power is: " + portionPower);

    }
}
