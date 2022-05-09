public class Key {
    private static Integer KEY; //= (int)(Math.random()*100);

    public static void setKEY(int key) {
        KEY = key;
    }
    public static int getKEY() {
        return KEY;
    }
}
