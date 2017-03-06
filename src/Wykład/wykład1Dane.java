/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wykład;

import weka.classifiers.Classifier;
import weka.classifiers.lazy.IBk;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author Karolina Kopycka
 */
public class wykład1Dane {
    
    
    public static void main(String[] args) throws Exception {
        
        //Wczytywanie danych z weki
        Instances dane = DataSource.read("C:\\Program Files\\Weka-3-8\\data\\weather.numeric.arff");
        
        
        //Zwraca nam informację o braku danych :-1
        System.out.println("\n"+dane.classIndex());
        //Ustawienie ostatniej kolumny jako atrybutu
        dane.setClassIndex(dane.numAttributes()-1);
        //Liczba klas
        System.out.println("\n"+dane.numClasses());
        //Informacje o kolumnie która jest grupą?
        System.out.println("\n"+dane.classAttribute());
        
        //Tworzymy klasyfikator
        Classifier kNN = new IBk(3);
        kNN.buildClassifier(dane); //Już jest
        
        
        Instance w5 = (Instance) dane.get(5).copy();
        w5.setMissing(4);
        w5.setValue(2, 85);
     
        System.out.println("\n"+w5);
        int decyzja= (int) kNN.classifyInstance(w5);
        
      
        
        System.out.println("\n"+dane);
        
        Attribute atr =dane.classAttribute();
        
        System.out.println("\nDecyzja: "+decyzja);
        System.out.println("... to znaczy "+atr.value(decyzja));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
