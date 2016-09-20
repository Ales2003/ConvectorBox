
package ru.mail.ales_2003.convectorbox;
import java.io.*;
import java.util.*;
import ru.mail.ales_2003.convectorbox.compare.LengthCompare;
import ru.mail.ales_2003.convectorbox.compare.MultiSort;
import ru.mail.ales_2003.convectorbox.compare.WidthCompare;


/**
 *
 * @author admin
 */
public class ConvectorBox {
    ArrayList<Convector> convectorList = new ArrayList<Convector>();
    
    public static void main(String[] args) {
        new ConvectorBox().go();
    }
    
    public void go() {
        getConvectors();
        System.out.println("NOT SORTED ARRAYLIST==================================");
        printConvectors(convectorList);
        Collections.sort(convectorList);
        System.out.println("SORTED ARRAYLIST====================================");
        printConvectors(convectorList);
        
        TreeSet<Convector> convectorSet = new TreeSet<Convector>();
        convectorSet.addAll(convectorList);
        System.out.println("TREESET====================================");
        printConvectors(convectorSet);
        MultiSort ms = new MultiSort();
        LengthCompare lC = new LengthCompare();
        WidthCompare wC = new WidthCompare();
        ms.secondarySort(convectorList, lC, wC);
    }
    
    void getConvectors() {
        try {
            File file = new File("Convectors.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            //построчно получаем из файла строку и...
            while ((line = reader.readLine()) != null) {
                //применяем к стоке метод по ее разбиению на элементы(и добавлению в массив String),
                //преобразованию массива String в массив Integer, созданию на основе последнего объекта Convector
                // и добавление этого объекта в коллекцию convectorList
                addConvector(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    
    //метод принимает строку из файла "Convectors.csv", преобразует ее в объект и добавляет в коллекцию
    void addConvector(String lineToParse) {
        //разбиваем строку на лексемы, разделенные знаком ";"  и передаем в массив String
        String[] stringValues = lineToParse.split(";");
        //создаем пустой массив Integer длиной как массив String
        Integer[] intValues = new Integer[stringValues.length];
        //циклом foreach
        for(int i=0;i<stringValues.length;i++){
        // каждый элемент массива String  передаем в массив Integer
        intValues [i] = Integer.parseInt(stringValues[i]);
        }        
        //на основании созданного массива создаем объект Convector
        Convector nextConvector = new Convector(intValues[0], intValues[1], intValues[2], intValues[3], intValues[4]);
        //добавляем в список 
        convectorList.add(nextConvector);
    }

        public void printConvectors(Collection<Convector> convectors){
        
        for(Convector c: convectors){
        System.out.println(c);
        
        }
        
    
    }    
}