package data;

public abstract class Animal {
    String name;
    Point[] allCanPoint;        //全部点位置
    Point point;                //动物当前所在的点位置
    ViewForAnimal animalView;   //动物的外观视图
    public void setAtPoint(Point p){
        if(p!=null){
            point=p;
            point.setHaveAnimal(true);
            point.setAtPointAnimal(this);
        }
    }

    public Point getPoint(){
        return point;
    }

    public void setAllCanPoint(Point[] point){
        allCanPoint=point;
    }

    public void setAnimalView(ViewForAnimal animalView){
        this.animalView=animalView;
        animalView.setAnimal(this);
    }

    public ViewForAnimal getAnimalView(){
        return animalView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean move();
}
