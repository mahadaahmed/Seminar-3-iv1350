package se.kh.iv1350.pointofsale.model;

import se.kh.iv1350.pointofsale.dto.ItemDTO;
import se.kh.iv1350.pointofsale.integration.Printer;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sale that requires payment from customer.
 */

public class Sale {
    private LocalTime timeOfSale;
    private Receipt receipt;
    private int totalPrice;
    private int totalQuantityOfGoods;
    private ArrayList <ItemDTO> itemDTOArrayList = new ArrayList<ItemDTO>();
    private int changeAmount;
    private int taxForEntirePurchase;
    private int totalPriceAndTaxForEntirePurchase;
    private int amountOfMeatballs;
    private int amountOfPringles;

    /**
     * This is the object Sales constructor
     */
    public Sale()
    {
        timeOfSale = LocalTime.now();
        receipt = new Receipt(timeOfSale);
    }

    public int getAmountOfMeatballs() {
        return amountOfMeatballs;
    }

    public int getAmountOfPringles() {
        return amountOfPringles;
    }

    /**
     * Gets total price of sale excluding tax.
     * @return Total price of sale.
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * Gets total quantity of goods.
     * @return Total quantity of goods.
     */
    public int getTotalQuantityOfGoods() {
        return totalQuantityOfGoods;
    }

    /**
     * Gets tax for entire purchase.
     * @return Total tax for entire purchase.
     */
    public int getTaxForEntirePurchase() {
        return taxForEntirePurchase;
    }

    /**
     * Gets price of last item in list.
     * @return Price of last item in list.
     */
    public int getLastItemPriceInList()
    {
        return itemDTOArrayList.get(itemDTOArrayList.size() - 1).getPrice();
    }

    /**
     * Gets name of last item in list.
     * @return Name of last item in list.
     */
    public String getLastItemNameInList()
    {
        return itemDTOArrayList.get(itemDTOArrayList.size() - 1).getName();
    }

    /**
     * Gets the total price including tax
     * @return total price including tax
     */

    public int getTotalPriceAndTaxForEntirePurchase ()
    {
        return totalPriceAndTaxForEntirePurchase;
    }
