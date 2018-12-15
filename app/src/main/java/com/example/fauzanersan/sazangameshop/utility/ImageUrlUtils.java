package com.example.fauzanersan.sazangameshop.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();
    static ArrayList<String> cartListItemName = new ArrayList<>();
    static ArrayList<String> cartListItemPrice = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[] {
                "https://www.gimori.com/wp-content/uploads/2017/01/mgsv.jpg",
                "https://www.gimori.com/wp-content/uploads/2018/03/tob.jpg",
                "https://www.gimori.com/wp-content/uploads/2016/09/tropico-5.jpg",
                "https://www.gimori.com/wp-content/uploads/dbfz.jpg",
                "https://www.gimori.com/wp-content/uploads/2017/03/arma3.jpg",
                "https://www.gimori.com/wp-content/uploads/2016/09/ets2-340x340.jpg",
        };
        return urls;
    }

    public static String[] getFashionsUrls() {
        String[] urls = new String[]{
                "https://www.gimori.com/wp-content/uploads/2017/01/mgsv.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2018/03/tob.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/09/tropico-5.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/dbfz.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2017/03/arma3.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/09/ets2-340x340.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
        };
        return urls;
    }

    public static String[] getFashionItemsName(){
        String[]items_name = new String[]{
                "METAL GEAR SOLID V: THE PHANTOM PAIN",
                "Tales of Berseria",
                "Tropico 5",
                "DRAGON BALL FighterZ",
                "Arma 3",
                "Euro Truck Simulator 2"
        };
        return items_name;
    }

    public static String[] getFashionItemPrice(){
        String[] items_price = new String[]{
                "235.000",
                "460.000 ",
                "108.000 ",
                "590.000",
                "499.000",
                "128.000"
        };
        return items_price;
    }

    public static String[] getSportWearUrls() {
        String[] urls = new String[]{
                "https://www.gimori.com/wp-content/uploads/2016/11/farcry-primal.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/09/farcry-3.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/09/ascre-3.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/08/wd.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
        };
        return urls;
    }

    public static String[] getSportWearItemsName(){
        String[]items_name = new String[]{
                "Far Cry Primal",
                "Far Cry 3",
                "Assassin’s Creed III",
                "Watch_Dogs",
        };
        return items_name;
    }

    public static String[] getSportWearItemPrice(){
        String[] items_price = new String[]{
                "589.000",
                "269.000",
                "210.000",
                "303.000"
        };
        return items_price;
    }

    public static String[] getSmartPhoneUrls() {
        String[] urls = new String[]{
                "https://www.gimori.com/wp-content/uploads/ow-legendary-edition.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/11/diablo3.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/11/starcraft2-legacy.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2016/12/diablo3-battle-chest.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
                "https://www.gimori.com/wp-content/uploads/2017/06/diablo2.jpg?quality=98&strip=all&w=782"
        };
        return urls;
    }

    public static String[] getSmartphoneItemsName(){
        String[]items_name = new String[]{
                "Overwatch Legendary Edition",
                "Diablo 3",
                "StarCraft 2: Legacy of the Void",
                "Diablo 3 Battle Chest",
                "Diablo 2"
        };
        return items_name;
    }

    public static String[] getSmartphoneItemPrice(){
        String[] items_price = new String[]{
                "909.000",
                "270.000",
                "410.000",
                "410.000",
                "175.000",
        };
        return items_price;
    }

    public static String[] getElectronicUrls() {
        String[] urls = new String[]{
                "https://www.gimori.com/wp-content/uploads/2017/06/minecraft-win10.jpg",
                "https://www.gimori.com/wp-content/uploads/2018/03/forza-motorsport7.jpg",
                "https://www.gimori.com/wp-content/uploads/2018/04/aoede.jpg",
                "https://www.gimori.com/wp-content/uploads/fh4.jpg"
        };
        return urls;
    }

    public static String[] getelectronicItemsName(){
        String[]items_name = new String[]{
                "Minecraft Windows 10 Edition",
                "Forza Motorsport 7 Standard Edition",
                "Age of Empires: Definitive Edition",
                "Forza Horizon 4 Standard Edition"
        };
        return items_name;
    }

    public static String[] getElectronicItemPrice(){
        String[] items_price = new String[]{
                "355.000",
                "750.000",
                "265.000",
                "875.000",
        };
        return items_price;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0,wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri(){ return this.wishlistImageUri; }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri, String itemName, String itemPrice) {
        this.cartListImageUri.add(0,wishlistImageUri);
        this.cartListItemName.add(0,itemName);
        this.cartListItemPrice.add(0, itemPrice);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri(){ return this.cartListImageUri; }

    public ArrayList<String> getCartListItemName(){ return this.cartListItemName; }

    public ArrayList<String> getCartListItemPrice() {
        return this.cartListItemPrice;
    }
}
