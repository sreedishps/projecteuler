import java.util.HashMap;

public class Problem062 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (Long i = 1l; i <= 100000l; i++) {
            if (i % 100 == 0)
                System.out.println("Checking " + i);
            String cube = MathHelper.sortedDigits(i * i * i);
            if (cube.equals(MathHelper.sortedDigits(8384l * 8384 * 8384))) {
                System.out.println(i*i*i);
                break;
            }
            if (!hm.containsKey(cube)) {
                hm.put(cube, 0);
            }

            hm.put(cube, hm.get(cube) + 1);
            if (hm.get(cube) == 5) {
                System.out.println(i);
                break;
            }
        }
    }
}
