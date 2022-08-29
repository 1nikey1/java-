import java.awt.*;

public class JiCheng {
    public static void main(String[] args){
        Point p1,p2;
        Line l1,l2;
        Shape.width=3;
        p1=new Point(2,3);
        p2=new Point(3,4);
        l1=new Line(p1,p2,Color.red);
        l2=new Line(1,2,3,4,Color.blue);
        l1.show();
        l2.show();
        l2.hide();
        Rectangle rect;
        Square sq;
        rect=new Rectangle(p1,4,3,Color.blue);
        sq=new Square(p2,4, Color.green);
        rect.show();
        System.out.println("���Ϊ��"+rect.getArea());
        sq.show();
        System.out.println("���Ϊ��"+sq.getArea());
        sq.hide();
    }
}
class Shape{
    Color color;
    static int width;
    void show(){
        System.out.println("Shape.show():");
    }
    void hide(){
        System.out.println("Shape.hide():");
    }
}
class Line extends Shape{
    Point p1,p2;
    Line(Point p1,Point p2,Color color){
        this.p1=p1;
        this.p2=p2;
        this.color=color;
    }
    Line(int x1,int y1,int x2,int y2,Color color){
        p1=new Point(x1,y1);
        p2=new Point(x2,y2);
        this.color=color;
    }
    void show(){
        System.out.println("ֱ�ߵĶ˵�Ϊ��"+p1.x+"��"+p1.y+"���ͣ�"+p2.x+"��"+p2.y+"����ɫΪ"+color+"��ϸΪ"+width);
    }
}
class Rectangle extends Shape{
    Point p1;
    private double width,height;
    void setWidth(double width){
        this.width=width;
    }
    Rectangle(Point p1,double width,double height,Color color){
        this.p1=p1;
        this.width=width;
        this.height=height;
        this.color=color;
    }
    void show(){
        System.out.println("���ε�λ��Ϊ��"+p1.x+"��"+p1.y+"�����߳�Ϊ"+width+","+"��ɫΪ��"+color+"��ϸΪ��"+super.width+"���Ϊ��");
    }
    double getArea(){
        return width*height;
    }
}
class Square extends Rectangle{
    Square(Point p1,double width,Color color){
        super(p1,width,width,color);
    }
    void show(){
    }
}