package data;

import javax.swing.*;

public abstract class ViewForAnimal extends JPanel {
    public abstract void setAnimal(Animal animal);
    public abstract void setImage(String name);
    public abstract Animal getAnimal();
    public abstract void setAnimalViewLocation(int x,int y);
    public abstract void setAnimalViewSize(int w,int h);
}
