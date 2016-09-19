
package ru.mail.ales_2003.convectorbox.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.mail.ales_2003.convectorbox.Convector;
//добавить распечатку процесса 
/**
 *
 * @author admin
 */
public class MultiSort {
    ArrayList<Convector> convectors;

   //почему не работает???
   // public <T extends AbstractComparator> void multiCompare(ArrayList<Convector> convectors, <T> primaryCompare, <T> secondaryCompare){

    //метод для мультисортировки - на несколько уровней: сначала по одному признаку, потом среди отсортированного по второму...
    public void secondarySort(ArrayList<Convector> convectors, AbstractComparator  primaryCompare, AbstractComparator secondaryCompare){
        //проводим первичную сортировку
        primarySort(convectors, primaryCompare);
        //переменная для хранения индекса "головы" отсортированной по первому признаку группы одинаковых (по первому признаку) элементов
        int currentGroupHeadIndex = 0;
        //переменная для хранения "головы" (получаем по индексу)
        Convector currentGroupHeadConvector = convectors.get(currentGroupHeadIndex);
        //List tmpConvectors для хранения сортируемой по второму признаку группы   
        ArrayList<Convector> tmpConvectors = new ArrayList();
        //проходим по коллекции
        for(Convector c: convectors){
            //если объект совпадает с головой по признаку первичной сортировки
            if(primaryCompare.compare(currentGroupHeadConvector, c)== 0)
                //добавляем объект в tmpConvectors 
                tmpConvectors.add(c);
            //иначе
            else {
                //сортируем tmpConvectors по secondaryCompare
                Collections.sort(tmpConvectors, secondaryCompare);
                //готовим место в convectors для отсортирвоанного tmpConvectors, удалив часть объектов
                //??? Удаляем из convectors все объекты, которые есть в tmpConvectors
                convectors.removeAll(tmpConvectors);
                //возвращаем отсортированный по secondaryCompare tmpConvectors в  convectors
                convectors.addAll(currentGroupHeadIndex, tmpConvectors);
                //очищаем tmpConvectors
                tmpConvectors.clear();
                //перемещаем "голову" : меняем индекс
                currentGroupHeadIndex=convectors.indexOf(c);
            }  
        } 
            
    }

   
    
    
    //метод для проведения сортировки по первичному признаку
    public void primarySort (ArrayList<Convector> convectors, AbstractComparator  primaryCompare){
        Collections.sort(convectors, primaryCompare);
    }
    
}

