/** трёхмерный класс точки **/
public class Point3d extends Point2d {
    /** координата Z **/
    private double zCoord;


    /** конструктор инициализации **/
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    /** конструктор по умолчанию **/
    public Point3d() {
        this(0.0,0.0,0.0);
    }


    /** Возвращение координаты Z **/
    public double getZ() {
        return zCoord;
    }


    /** Установка значения координаты Z **/
    public void setZ(double val) {
        zCoord = val;
    }


    /** Сравнение значений двух объектов Point3 **/
    public boolean equalsPoint3d(Point3d second) {
        // Возвращаем результат сравнения значений трёх полей объектов
        return (equalsPoint2d(second) && this.getZ() == second.getZ());
    }


    /** Вычисление расстояния между двумя точками **/
    public double distantTo(Point3d point3d) {
        return Math.round(Math.sqrt((Math.pow(point3d.getX() - this.getX(), 2)) + (Math.pow(point3d.getY() - this.getY(), 2)) + (Math.pow(point3d.getZ() - this.getZ(), 2))) * 100.0) / 100.0;
    }
}