public class Lab1 {
    public static void main(String[] args) {
        /* Ввод координат точек */
        Point3d first = new Point3d(1,2,3);
        Point3d second = new Point3d(4,5,6);
        Point3d thirst = new Point3d(7,8,9);


        /* Проверка на совпадения и вывод площади треугольника, вершинами которого являются введённые точки */
        if (!first.equalsPoint3d(second) && !second.equalsPoint3d(thirst) && !thirst.equalsPoint3d(first)) {
            System.out.println(computerArea(first, second, thirst));
        }
        else {
            System.out.println("Две из трёх точек совпадают, пожалуйста проверте введённые данные");
        }
    }


    /* Метод высчитывающий площадь треугольника по формуле Герона */
    public static double computerArea(Point3d first, Point3d second, Point3d thirst) {
        double a = first.distantTo(second);
        double b = second.distantTo(thirst);
        double c = thirst.distantTo(first);
        double p = (a + b + c) / 2;

        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}
