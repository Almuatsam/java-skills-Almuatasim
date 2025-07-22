public class PayrollCalculator {
    public static double calcPay(String type, double h, double r) {
        return switch (type) {
            case "FULL_TIME" -> h <= 40 ? h * r : 40 * r + (h - 40) * r * 1.5;
            case "PART_TIME" -> Math.min(h, 25) * r;
            case "CONTRACTOR" -> h * r;
            case "INTERN" -> Math.min(h, 20) * r * 0.8;
            default -> 0;
        };
    }

    public static double tax(double p) {
        double t = p <= 500 ? 0.1 : p <= 1000 ? 0.15 : p <= 2000 ? 0.2 : 0.25;
        return Math.max(0, p * t - 50);
    }

    public static void main(String[] a) {
        String[] t = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] h = {45, 20, 35, 15, 50}, r = {25, 18, 40, 12, 30};
        String[] n = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        double max = 0, min = Double.MAX_VALUE, total = 0; String maxN = "", minN = ""; int ot = 0;

        for (int i = 0; i < n.length; i++) {
            double p = calcPay(t[i], h[i], r[i]), tx = tax(p);
            System.out.printf("%s: Pay=%.2f Tax=%.2f\n", n[i], p, tx);
            if (p > max) { max = p; maxN = n[i]; }
            if (p < min) { min = p; minN = n[i]; }
            if (h[i] > 40) ot++; total += p;
        }

        System.out.printf("Top: %s $%.2f | Low: %s $%.2f | Avg: %.2f | OT: %d\n", maxN, max, minN, min, total / n.length, ot);
    }
}

