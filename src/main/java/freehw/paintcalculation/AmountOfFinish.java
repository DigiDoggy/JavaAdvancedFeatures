package freehw.paintcalculation;


import freehw.paintcalculation.data.DyeData;
import freehw.paintcalculation.data.Storage;
import freehw.paintcalculation.paint.Finish;



public class AmountOfFinish{

    public static float getBucketFinish(){
        if(getAmountOfDyeFinish()< Finish.getFinishPaintBucket()){
            return Finish.getFinishPaintBucket();
        } else if (AmountOfFinish.getAmountOfDyeFinish()>Finish.getFinishPaintBucket()) {
            return Operation.round((getAmountOfDyeFinish()%Finish.getFinishPaintBucket()));
        }
        return -1;
    }

    public static float getLitersToFinishStorage(){
        Storage.addFinishStorage(Operation.roundDecimalPoint(Finish.getFinishPaintBucket()-(getAmountOfDyeFinish()%Finish.getFinishPaintBucket())));
        return Operation.roundDecimalPoint(Finish.getFinishPaintBucket()-(getAmountOfDyeFinish()%Finish.getFinishPaintBucket()));
    }

    // How many litters of finish need for constructions;
    public static float getAmountOfDyeFinish(){
        float withoutErrors =Operation.roundDecimalPoint(ClientPath.getMetalArea()/DyeData.getPolySpreadingRate()[getElementOfArrayFinish()]);
        return withoutErrors+Operation.roundDecimalPoint(ClientPath.getMetalArea()/DyeData.getPolySpreadingRate()[getElementOfArrayFinish()])*DyeData.lossFactor;
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

    // Finish info
    public static void getFinishIfo(){
        System.out.println("How much finish is needed to work on the project: " + getAmountOfDyeFinish());
        System.out.println("How many buckets of paint are required to paint a project: " + getBucketFinish());
        System.out.println("How much soil will go to the warehouse: " + getLitersToFinishStorage());



    }


}
