package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

//public HashMap<MenuItem, String> addItem = new HashMap<>();

// public String removeMenuItem(Map<MenuItems, String> mapObj, String item) {
//     String result = "";
//     for (Map.entry(<MenuItems, String> entry: mapObj.entrySet()){
//             MenuItems searchKey=entry.getKey();
//     if (searchKey.getName().equalsIgnoreCase(item)) {
//         mapObk.remove(searchKey);
//         result = "Item removed";
//     } else {
//         result = "Item unavailable to remove";
//     }
//         }
//             } return result;
// }

//    public void addItem(MenuItem newItem) {
//        Menu.items.add(newItem);
//    }


    public static void isNew(MenuItem input) {
        if (input.isNew == true) {
            System.out.println("New menu item!");
        } else System.out.println("Item not new.");
//                    arraylist.get.i
        }



    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


