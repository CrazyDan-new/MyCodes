package data;

public class LeftAnimal extends Animal{

    @Override
    public boolean move() {
        int k=-1;
        boolean successMove=false;
        Point p=getPoint();                                 //动物当前所在点
        for(int i=0;i< allCanPoint.length ;i++){            //寻找p点的位置索引
            if(allCanPoint[i].equals(p)){
                k=i;
                break;
            }
        }
        if(k== allCanPoint.length-1){                       //已经在最右边的点位置
            return false;
        }
        if(allCanPoint[k+1].isHaveAnimal()==false){         //前面的位置上没有动物
            this.setAtPoint(allCanPoint[k+1]);              //动物到达allCanPoint[k+1]
            successMove=true;
            p.setAtPointAnimal(null);                       //p点位置无动物
            return successMove;
        }
        if((k+1)==allCanPoint.length-1){                    //前面的位置上已经是到达终点的动物
            return false;
        }
        if(allCanPoint[k+2].isHaveAnimal()==false){         //前方隔位上没有动物
            this.setAtPoint(allCanPoint[k+2]);              //动物到达allCanPoint[k+2]
            successMove=true;
            p.setAtPointAnimal(null);                       //p点位置无动物
            return successMove;
        }
        return successMove;
    }
}
