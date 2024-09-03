import java.util.ArrayList;  
import java.util.List;
public class OrderedItems {
	   
    List<Item> items=new ArrayList<Item>();  
      
    public void addItems(Item item){  
          
        items.add(item);  
    }  
    public int getCost(){  
          
        int cost=0;  
            for (Item item : items) {  
                cost+=item.price()*(100-item.discount())/100;  
             }  
        return cost;  
    }  
    public void showItems(){  
          
        for (Item item : items) {  
            System.out.println("Item is:" +item.name());  
            System.out.println("Size is:" +item.size());  
            System.out.println("Price is: " +item.price());  
              
        }  
    }  
}
