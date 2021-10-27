package test;
import data.*;

//测试了data包内的各类
public class AppTest {
    public static void main(String[] args) {
        Point[] point=new Point[7];                         //创建7个点
        for(int i=0;i< point.length;i++){
            point[i]=new Point();
            point[i].setX(i);
            point[i].setY(10);
        }

        Animal[] left=new Animal[3];                        //三个左边动物
        Animal[] right=new Animal[3];                       //三个右边边动物
        for(int i=0;i<left.length;i++){                     //把左边动物放在点上
            left[i]=new LeftAnimal();
            left[i].setName("猫"+i);
            left[i].setAtPoint(point[i]);
            left[i].setAllCanPoint(point);
        }
        for(int i=0;i<right.length;i++){                    //把右边动物放在点上
            right[i]=new RightAnimal();
            right[i].setName("狗"+i);
            right[i].setAtPoint(point[4+i]);
            right[i].setAllCanPoint(point);
        }

        input(point);
        if(right[0].move()){
            input(point);
        }
        if(left[2].move()){
            input(point);
        }
        if(left[1].move()){
            input(point);
        }
        if(right[0].move()){
            input(point);
        }
        if(right[1].move()){
            input(point);
        }
        if(right[2].move()){
            input(point);
        }
        if(left[1].move()){
            input(point);
        }
        if(left[0].move()){
            input(point);
        }
        if(right[0].move()){
            input(point);
        }
        if(right[1].move()){
            input(point);
        }
        if(right[2].move()){
            input(point);
        }
        if(left[1].move()){
            input(point);
        }
        if(left[0].move()){
            input(point);
        }
        if(right[2].move()){
            input(point);
        }
    }

    static void input(Point[] point) {
        for(int i=0;i<point.length;i++){
            Animal animal=point[i].getAtPointAnimal();
            if(animal!=null){
                System.out.print(animal.getName());
            }else{
                System.out.print("空位");
            }
            System.out.print("|");
        }
        System.out.println();
    }


}
