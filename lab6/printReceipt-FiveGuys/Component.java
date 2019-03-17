  

public interface Component {

     void printDescription() ;
     double getsubTotal() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);

}
 
