package freehw.paintcalculation;


import freehw.paintcalculation.data.DyeData;
import freehw.paintcalculation.paint.Grunt;
public class AmountOfGrunt{


     //kol-vo banok
     public static float getBucketGrunt(){

          if(getAmountOfDyeGrunt()<Grunt.getGruntPaintBucket()){
               return Grunt.getGruntPaintBucket();
          } else if (getAmountOfDyeGrunt()>Grunt.getGruntPaintBucket()) {
              return round((getAmountOfDyeGrunt()/Grunt.getGruntPaintBucket()));
          }
          return -1;
     }
     public static float round(float number){
          return Math.round(number);
     }


     // How many litters need for constructions;
     public static float getAmountOfDyeGrunt(){
          return (ClientPath.getMetalArea()/DyeData.getEpoSpreadingRate()[getElementOfArrayGrunt()])*DyeData.lossFactor;
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
}



