/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksploracja;

import java.util.Arrays;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Karolina Kopycka
 */
public class Eksploracja {
    Instances dane;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //sout +tabualcja
        
        System.out.println("Hello world - tu eksploracja");
        
        //Pobieranie danych
        String filename = "C:\\Program Files\\Weka-3-8\\data\\weather.numeric.arff";
        DataSource source = new DataSource(filename);
        Instances mojeDane = source.getDataSet();
        
        //Wyświetlanie danych
        System.out.println("Dane: ");
       // System.out.println(mojeDane); //całość danych
        
       Instance wiersz0 = mojeDane.firstInstance();
       
       
        System.out.println("Początek "+mojeDane.firstInstance()); //pierwszy wiersz
        System.out.println("Koniec "+mojeDane.lastInstance()); //ostatni wiersz
        
        System.out.println("\nLiczba danych: "+mojeDane.numInstances());
        System.out.println("\nAtrybuty w liczbie: "+mojeDane.numAttributes());
       
        for(int i=0;i<mojeDane.numAttributes();i++){
            System.out.println(i+". "+mojeDane.attribute(i));
            Attribute atr= mojeDane.attribute(i);
            System.out.println(i+" "+atr.name());
            
            if (atr.isNominal()) {
                System.out.println("Typ danych nominalne");
            } else {
                System.out.println("Typ danych numeryczne");
            }
        }
        
        //Zapisywanie danych w posataci liczbowej
        System.out.println("Dane - jako liczby: ");
        System.out.println(Arrays.toString(wiersz0.toDoubleArray()));
        
        }
        
        
    }
    

