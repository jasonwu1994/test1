package module37_42;

public class test {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.determineTriangleV1(-1, -1, -1));
        System.out.println(t.determineTriangleV1(1, 2, 1));
        System.out.println(t.determineTriangleV1(6, 6, 6));
        System.out.println(t.determineTriangleV1(6, 6, 5));
        System.out.println(t.determineTriangleV1(3, 4, 5));
        System.out.println(t.determineTriangleV1(3, 4, 6));
        System.out.println("===========================");
        System.out.println(t.determineTriangleV2(-1, -1, -1));
        System.out.println(t.determineTriangleV2(1, 2, 1));
        System.out.println(t.determineTriangleV2(6, 6, 6));
        System.out.println(t.determineTriangleV2(3, 4, 5));
		789
    }

    static class Triangle {
        public String determineTriangleV1(int a, int b, int c) {
            if ((a <= 0) || (b <= 0) || (c <= 0)) {
                return "Not a triangle";
            } else {
                if ((a + c <= b) || (a + c <= b) || (b + c <= a)) {
                    return "Not a triangle";
                } else {
                    if ((a == b) && (b == c)) {
                        return "Regular triangle";
                    }
                    if ((a == b) || (b == c) || (c == a)) {
                        return "Isosceles triangle";
                    }
                    if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
                        return "Right triangle";
                    }
                }
            }
            return "Be a triangle";
        }

        public String determineTriangleV2(int a, int b, int c) {
            String result = "";
            if ((a <= 0) || (b <= 0) || (c <= 0)) {
                result = "Not a triangle";
            } else {
                result = "Be a triangle";
                if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                    result = "Not a triangle";
                } else {
                    if ((a == b) || (b == c) || (c == a)) {
                        result = "Isosceles triangle";
                    }
                    if ((a == b) && (b == a)) {
                        result = "Regular triangle";
                    }
                    if ((a * a + b * b == c * c) || (b * b + c * c == a * a)
                            || (c * c + a * a == b * b)) {
                        result = "Right triangle";
                    }
                }
            }
            return result;
        }
    }
}