/** трёхмерный класс точки **/
public class Point3d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** координата Z **/
    private double zCoord;


    /** конструктор инициализации **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** конструктор по умолчанию **/
    public Point3d() {
        this(0,0,0);
    }


    /** Возвращение координаты X **/
    public double getX() {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY() {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ() {
        return zCoord;
    }


    /** Установка значения координаты X **/
    public void setX(double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y **/
    public void setY(double val) {
        yCoord = val;
    }
    /** Установка значения координаты Z **/
    public void setZ(double val) {
        zCoord = val;
    }


    /** Сравнение значений двух объектов Point3 **/
    public boolean equalsPoint3d(Point3d second) {
        // Возвращаем результат сравнения значений трёх полей объектов
        return (this.xCoord == second.xCoord && this.yCoord == second.yCoord && this.zCoord == second.zCoord);
    }

    /** Вычисление расстояния между двумя точками **/
    public double distantTo(Point3d point3d) {
        return Math.round(Math.sqrt((Math.pow(point3d.xCoord - this.xCoord, 2)) + (Math.pow(point3d.yCoord - this.yCoord, 2)) + (Math.pow(point3d.zCoord - this.zCoord, 2))) * 100.0) / 100.0;
    }
}