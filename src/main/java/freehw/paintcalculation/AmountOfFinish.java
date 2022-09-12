package freehw.paintcalculation;


import freehw.paintcalculation.data.DyeData;
import freehw.paintcalculation.paint.Finish;


public class AmountOfFinish{


    public static float getBucketGrunt(){

        if(getAmountOfDyeFinish()< Finish.getFinishPaintBucket()){
            return Finish.getFinishPaintBucket();
        } else if (AmountOfFinish.getAmountOfDyeFinish()>Finish.getFinishPaintBucket()) {
            return AmountOfGrunt.round((getAmountOfDyeFinish()/Finish.getFinishPaintBucket()));
        }
        return -1;
    }

    // How many litters of finish need for constructions;
    public static float getAmountOfDyeFinish(){
        return (ClientPath.getMetalArea()/DyeData.getPolySpreadingRate()[getElementOfArrayFinish()])*DyeData.lossFactor;
    }

    //paint consumption per square meter
    public static int getElementOfArrayFinish(){
        for (int i =0; i<DyeData.getDryFinish().length;i++){
            if(DyeData.getDryFinish()[i]==ClientPath.getFinishThickness()){
                return i;
            }
        }
        return -1;
    }

}
