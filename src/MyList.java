import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Сделать собственную коллекцию, в которой будет
помещаться до 3 однотипных Животных,
которые при добавлении автоматически сортируются по весу
 */
public class MyList <Animal>{

    Animal firstAnimal;
    Animal secondAnimal;
    Animal thirdAnimal;

//    List<Animal> tempList;
    ArrayList<Animal> tempList;

    //MyArray<Animal> eMyArray = new MyArray<Animal>{firstE, secondE; thirdE;};
//    MyArray<Animal>[] eMyArray = new MyArray<Animal>[]{firstE, secondE, thirdE};
//    Animal[] eMyArray = new Animal[]{firstE, secondE, thirdE};


    public MyList(){
        firstAnimal = null; secondAnimal = null; thirdAnimal =null;
        tempList = new ArrayList<>(Arrays.asList(firstAnimal, secondAnimal, thirdAnimal));
    }

    public int getCount(){

        int count =0;

        for (Animal a:tempList) {
            if(a!=null) count++;
        }
        return count;
    }

//    public void put (Animal an){
//        if(getCount() == 0)
//            firstAnimal =an;
//        else if (getCount()==1){
//            sort2(an);
//        }
//        else if (getCount()==2) {
//            sort3(an);
//        }
//        else
//            System.out.println("коллекция заполнена полностью");
//
//        tempList = new ArrayList<>(Arrays.asList(firstAnimal, secondAnimal, thirdAnimal));
//    }

    public void put (Animal an){
        if(getCount() == 0)
            firstAnimal = an;
        else if (getCount()==1){
            if (firstAnimal==null) firstAnimal = an;
            else secondAnimal = an;
        }
        else if (getCount()==2) {
            if (firstAnimal==null) firstAnimal = an;
            else if (secondAnimal==null) secondAnimal = an;
            else thirdAnimal = an;
        }
        else
            System.out.println("коллекция заполнена полностью");

        tempList = new ArrayList<>(Arrays.asList(firstAnimal, secondAnimal, thirdAnimal));
        tempList.sort();
        tempList.sort((x, y)-> Integer.compare (x.weight, y.weight()));
        tempList.sort(Comparator.comparingInt(Animal::weight));
//        tempList.sort((x, y)-> Double.compare (x.weight, y.weight()));
//        tempList.sort(Comparator.comparingDouble(Animal::weight));
    }


//    void sort2(Animal a){
//        Animal temp = null;
//        if(firstAnimal != null)  temp = firstAnimal;
//        else if(secondAnimal != null)  temp = secondAnimal;
//        else if(thirdAnimal != null)  temp = thirdAnimal;
//
////        if (a.weight <= temp.weight) {firstAnimal = a; secondAnimal = temp;}
////        else {firstAnimal = temp; secondAnimal = a;}
//
//        if (a<= temp) {firstAnimal = a; secondAnimal = temp;}
//        else {firstAnimal = temp; secondAnimal = a;}
//    }
//
//    private void sort3(Animal an) {
//
//    }

}
