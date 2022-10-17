/** двумерный класс точки. **/
public class Point2d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;


    /** конструктор инициализации **/
    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    /** конструктор по умолчанию **/
    public Point2d() {
        this(0.0,0.0);
    }


    /** Возвращение координаты X **/
    public double getX() {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY() {
        return yCoord;
    }


    /** Установка значения координаты X **/
    public void setX(double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y **/
    public void setY(double val) {
        yCoord = val;
    }


    /** Сравнение значений двух объектов Point2 **/
    public boolean equalsPoint2d(Point2d second) {
        // Возвращаем результат сравнения значений двух полей объектов
        return (this.getX() == second.getX() && this.getY() == second.getY());
    }
}
