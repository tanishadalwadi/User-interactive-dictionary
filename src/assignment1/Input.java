/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner; 
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author tanis
 */
public class Input {
    public void getInput(){
        System.out.println("! Loading data...");
        System.out.println("! Loading completed...");
        System.out.println("-----DICTIONARY 340 JAVA-----");
        System.out.println();
        String[] values = null;
        String value = "";
        Scanner t = new Scanner(System.in);
        
        
        
        while(!value.equalsIgnoreCase("!Q"))
        {
            t.useDelimiter("\n");
            System.out.print("Search:");
            value = t.nextLine();
            values = value.split(" ");
            menu(values);
        }
        
        System.out.println("-----THANK YOU-----");
        System.exit(0);
        
     }
    
    private static HashMap sortByValues(HashMap map) { 
       List list = new LinkedList(map.entrySet());
       // Defined Custom Comparator here
       Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
               return ((Comparable) ((Map.Entry) (o1)).getValue())
                  .compareTo(((Map.Entry) (o2)).getValue());
            }
       });
       HashMap sortedHashMap = new LinkedHashMap();
       for (Iterator it = list.iterator(); it.hasNext();) {
              Map.Entry entry = (Map.Entry) it.next();
              sortedHashMap.put(entry.getKey(), entry.getValue());
       } 
       return sortedHashMap;
  }
    
    public HashSet<String> buildHashSet(){
        HashSet<String> partsOfSpeech = new HashSet<String>();
        partsOfSpeech.add("noun");
        partsOfSpeech.add("preposition");
        partsOfSpeech.add("adverb");
        partsOfSpeech.add("verb");
        partsOfSpeech.add("interjection");
        partsOfSpeech.add("conjuction");
        partsOfSpeech.add("adjective");
        partsOfSpeech.add("pronoun");
        return partsOfSpeech;
}
    
    public HashMap<Dataofdictionary,String> getDistinct(HashMap<Dataofdictionary,String> map){
        HashMap <Dataofdictionary,String> distinctMap = new HashMap<Dataofdictionary,String>();
 for (Map.Entry<Dataofdictionary,String> entry : map.entrySet())
 {
     if(distinctMap.containsValue(entry.getValue())){
         continue;
     }
     else
     {
         distinctMap.put(entry.getKey(), entry.getValue());
 }
   
 }

    return distinctMap;
    }
    
    public <K, V> K getKey(Map<K, V> map, V value) {
    for (Entry<K, V> entry : map.entrySet()) {
        if (entry.getValue().equals(value)) {
            return entry.getKey();
        }
    }
    return null;
}
    public void menu(String[] values){
        
        HashSet<String> speech = buildHashSet();
        HashMap< Dataofdictionary,String> data1 = Dataofdictionary.getMap1();
        HashMap< Dataofdictionary,String> data2 = Dataofdictionary.getMap2();
        HashMap< Dataofdictionary,String> data3 = Dataofdictionary.getMap3();
        HashMap<Dataofdictionary,String> sortedMap = sortByValues(data2);
        HashMap<Dataofdictionary,String> hm = new HashMap<Dataofdictionary,String>();
        HashMap<Dataofdictionary,String> distinctMap = new HashMap<Dataofdictionary,String>();
        int flag = 0;
       
        System.out.println("|");
 
            if (values.length == 1){
                if(values[0].equalsIgnoreCase("!Q")) 
           {
               System.out.println("-----THANK YOU-----");
               System.exit(0);
           }
                else{
                for (Dataofdictionary key : sortedMap.keySet()) {
                   if (values[0].equalsIgnoreCase( data1.get(key))){   
                    System.out.println(data1.get(key)+" "+data2.get(key)+" "+data3.get(key));
                            flag =1;
                   } 
            }
                
                
           
        }
            }
        else if (values.length == 2){  
            if (!speech.contains(values[1]) && ( !values[1].equalsIgnoreCase("distinct"))){
        System.out.println("<2nd argument must be a part of speech or \"distinct\">");
        
        }else{
                if (values[1].equalsIgnoreCase("distinct")){
                    
                    for(Dataofdictionary key : data3.keySet()) {
                   if (values[0].equalsIgnoreCase( data1.get(key))){
                       hm.put(key,data3.get(key));
                       flag = 1;
                   }
                   }
                    Set<String> valueSet = new HashSet<String>(hm.values());
                    if(valueSet.size() != 1){
                    distinctMap = getDistinct(hm);
                    for (Dataofdictionary key1 : sortedMap.keySet()){
                     for (Dataofdictionary key2 : distinctMap.keySet()){
                         if (key1.equals(key2)){
                              System.out.println(data1.get(key1)+" "+sortedMap.get(key1)+" "+distinctMap.get(key1));
                            }
                        
                     }
                     }
                    
                    }else{
                       for(Dataofdictionary key : data2.keySet()) {
                   if (values[0].equalsIgnoreCase( data1.get(key))){
                       hm.put(key,data2.get(key));
                       flag = 1;
                   }
                   }
                    
                    distinctMap = getDistinct(hm); 
                    for (Dataofdictionary key1 : sortedMap.keySet()){
                     for (Dataofdictionary key2 : distinctMap.keySet()){
                         if (key1.equals(key2)){
                             flag = 1;
                              System.out.println(data1.get(key1)+" "+sortedMap.get(key1)+" "+data3.get(key1));
                            }
                        
                     }
                     }
                   
                    }
                }
                     else{
                    for(Dataofdictionary key : data2.keySet()) {
                      if ((values[0].equalsIgnoreCase( data1.get(key))) && (("["+values[1]+"]").equalsIgnoreCase(data2.get(key)))) {
                       {flag = 1;
                           System.out.println(data1.get(key)+" "+data2.get(key)+" "+data3.get(key));
                       }
                   }
                }
                    
            }
        }
    
    }
        else if(values.length == 3){
             if (!speech.contains(values[1]) && ( !values[1].equalsIgnoreCase("distinct"))){
        System.out.println("<2nd argument must be a part of speech>");
        
             }
        else if(values[2].equalsIgnoreCase("distinct")){
            
                    for(Dataofdictionary key : data2.keySet()) {
                   if ((values[0].equalsIgnoreCase( data1.get(key))) && (("["+values[1]+"]").equalsIgnoreCase(data2.get(key)))){
                       flag = 1;
                       hm.put(key,data3.get(key));
                    }
                   }
                    distinctMap = sortByValues(getDistinct(hm));
                    for (Dataofdictionary key : distinctMap.keySet()){
                        System.out.println(data1.get(key)+" "+data2.get(key)+" "+data3.get(key));
                    }
                }   
        }
        
if(flag != 1){
    System.out.println("<Not found>");
}
System.out.println("|");
    }
}


