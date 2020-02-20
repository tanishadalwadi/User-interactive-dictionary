


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.HashMap;
/**
 *
 * @author tanis
 */
public enum Dataofdictionary { 

    Ar("Arrow", "[noun]", "Here is one arrow: <IMG> -=>> </IMG>"),
    Daj1("Distinct", "[adjective]", "Familiar. Worked in Java."),
    Daj2("Distinct", "[adjective]", "Unique. No duplicates. Clearly different or of a different kind."),
    Dav1("Distinct", "[adverb]", "Uniquely. Written \"distinctly\"."),
    Dn1("Distinct", "[noun]", "A keyword in this assignment."),
    Dn2("Distinct", "[noun]", "A keyword in this assignment."),      
    Dn3("Distinct", "[noun]", "A keyword in this assignment."),
    Dn4("Distinct", "[noun]", "An advanced search option."),
    Dn5("Distinct", "[noun]", "Distinct is a parameter in this assignment."),
    Phaj1("Placeholder", "[adjective]","To be updated..."),
    Phaj2("Placeholder", "[adjective]","To be updated..."),
    Phav1("Placeholder", "[adverb]",  "To be updated..."),
    Phc1("Placeholder", "[conjunction]", "To be updated..."),
    Phi1("Placeholder", "[interjection]", "To be updated..."),
    Phn1("Placeholder", "[noun]", "To be updated..."),
    Phn2("Placeholder", "[noun]", "To be updated..."),
    Phn3("Placeholder", "[noun]", "To be updated..."),
    Phprep1("Placeholder", "[preposition]", "To be updated..."),
    Phpro1("Placeholder", "[pronoun]", "To be updated..."),
    Phv("Placeholder", "[verb]", "To be updated..."),
    csc340aj1("CSC340", "[adjective]", "C++ version of CSC210 + CSC220 + more."),
    csc340n1("CSC340", "[noun]", "A CS upper division course."),
    csc340n2("CSC340", "[noun]",  "Many hours outside of class."),
    csc340n3("CSC340", "[noun]", "Programming Methodology."),
    csc220v("CSC220", "[verb]",  "To create data structures."),
    csc220ad("CSC220", "[adjective]", "Ready to create complex data structures."),
    Bn1("Book", "[noun]", "A set of pages."),
    Bn2("Book", "[noun]", "A written work published in printed or electronic form."),
    Bv1("Book", "[verb]", "To arrange for someone to have a seat on a plane."),
    Bv2("Book", "[verb]", "To arrange something on a particular date."),
    Adverdnoun("Adverb", "[noun]", "Adverb is a word that adds more information about place, time, manner, cause or degree to a verb, an adjective, a phrase or another adverb."),
    Adjectivenoun("Adjective", "[noun]", "Adjective is a word that describes a person or thing, for example big, red and clever in a big house, red wine and a clever idea."),
    Interjectionnoun("Interjection", "[noun]", "Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),
    Nounnoun("Noun", "[noun]", "Noun is a word that refers to a person, (such as Ann or doctor), a place (such as Paris city) or a thing, a quality or an activity (such as plant, sorrow or tennis.");
    private String ky="";
    private String ps="";
    private String def="";

    
    Dataofdictionary(String ky,String ps, String def ) {
        this.ky = ky;
        this.ps = ps;
        this.def = def;
    }
    
    public String getkey()
    {
        return this.ky;
    }
    
   
    public String getps()
    {
        return this.ps;
    }
    public String getdef()
    {
        return this.def;
    }
    public String tostring()
    {
        return this.getkey()+ this.getps()+ ":" +this.getdef();
    }
    
    public static HashMap<Dataofdictionary,String> getMap1(){
        HashMap<Dataofdictionary,String> map1 = new HashMap<Dataofdictionary,String>();
   {  
        for (Dataofdictionary dt : Dataofdictionary.values()) {
                map1.put(dt, dt.getkey());       
        }
   }
    
   return map1;
}
    
   public static HashMap<Dataofdictionary,String> getMap3(){
        HashMap<Dataofdictionary,String> map3 = new HashMap<Dataofdictionary,String>();
         // HashMap<String, ArrayList<Dataofdictionary>> mymap = new HashMap<String, ArrayList<Dataofdictionary>>();
   {  
        for (Dataofdictionary dt : Dataofdictionary.values()) {
                map3.put(dt,dt.getdef());  
        }
   }
   return map3;
}
    
    
       public static HashMap<Dataofdictionary,String> getMap2(){
        HashMap<Dataofdictionary,String> map2 = new HashMap<Dataofdictionary,String>();
   {  
        for (Dataofdictionary dt : Dataofdictionary.values()) {

                map2.put(dt, dt.getps());  
        }
   }
   return map2;
}
}


    
  
