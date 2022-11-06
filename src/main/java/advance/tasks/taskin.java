package advance.tasks;

public class taskin {
    public static void main(String[] args) {

       Integer[] my_numbers = {1,2,3,4,5};

        System.out.println(find_total(my_numbers));
    }
    public static Integer find_total( Integer[] my_numbers ) {
       int number = 0;

       for (int i=0; i< my_numbers.length;i++){
           if(my_numbers[i]%2==0){
               number +=1;
           } else if (my_numbers[i]%2!=0 && my_numbers[i]!=5) {
               number+=3;
           }else if (my_numbers[i]==5){
               number+=5;
           }
       }


        return number ;
    }
}
