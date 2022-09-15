package freehw.paintcalculation;


import freehw.paintcalculation.data.DyeData;
import freehw.paintcalculation.data.Storage;
import freehw.paintcalculation.paint.Grunt;
public class AmountOfGrunt{


     //number of paint Bucket
     public static float getBucketGrunt(){

          if(getAmountOfDyeGrunt()<Grunt.getGruntPaintBucket()){
               return Grunt.getGruntPaintBucket();
          } else if (getAmountOfDyeGrunt()>Grunt.getGruntPaintBucket()) {
              return (Operation.round(getAmountOfDyeGrunt())%Grunt.getGruntPaintBucket());
          }
          return -1;
     }

     public static float getLitersToGruntStorage(){
          Storage.addToGruntStorage(Operation.roundDecimalPoint(Grunt.getGruntPaintBucket()-(getAmountOfDyeGrunt()%Grunt.getGruntPaintBucket())));
          return Operation.roundDecimalPoint(Grunt.getGruntPaintBucket()-(getAmountOfDyeGrunt()%Grunt.getGruntPaintBucket()));
     }


     // How many litters need for constructions;
     public static float getAmountOfDyeGrunt(){
          float withoutErrors=Operation.roundDecimalPoint((ClientPath.getMetalArea()/DyeData.getEpoSpreadingRate()[getElementOfArrayGrunt()]));
          return withoutErrors+Operation.roundDecimalPoint((ClientPath.getMetalArea()/DyeData.getEpoSpreadingRate()[getElementOfArrayGrunt()])*DyeData.lossFactor);
     }

     //paint consumption per square meter
     public static int getElementOfArrayGrunt(){
          for (int i =0; i<DyeData.getDryGrunt().length;i++){
               if(DyeData.getDryGrunt()[i]==ClientPath.getGruntThickness()){
                    return i;
               }
          }
          return -1;
     }

     public static void getGruntInfo(){
          System.out.println("How much soil is needed to work on the project: " + getAmountOfDyeGrunt());
          System.out.println("How many buckets of paint are required to paint a project: " + getBucketGrunt());
          System.out.println("How much soil will go to the warehouse: " + getLitersToGruntStorage());
     }

}



