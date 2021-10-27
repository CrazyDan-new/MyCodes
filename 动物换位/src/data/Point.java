package data;

public class Point {
    int x,y;
    boolean haveAnimal;
    Animal animal=null;

    public boolean isHaveAnimal(){
        return haveAnimal;
    }

    public void setHaveAnimal(boolean boo){
        haveAnimal=boo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAtPointAnimal(Animal animal){
        this.animal=animal;
        if(animal!=null){
            haveAnimal=true;
        }else{
            haveAnimal=false;
        }
    }

    public Animal getAtPointAnimal(){
        return animal;
    }
}
