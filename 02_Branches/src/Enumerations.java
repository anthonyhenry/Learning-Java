public class Enumerations {
    // An enumeration type (enum) declares a name for a new type and possible values for that type
    // An enumeration declares a new data type that can be used like the built-in types like String
    public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER} // The items within the braces ("enumerators") are named constants

    public static void main(String[] args) {
        GroceryItem userItem;

        // When using an enumeration you must include both the enumeration type and the enumerator within that type
        userItem = GroceryItem.GR_APPLES;

        if(userItem == GroceryItem.GR_APPLES || userItem == GroceryItem.GR_BANANAS)
        {
            System.out.println("Fruit");
        }
        else if(userItem == GroceryItem.GR_JUICE || userItem == GroceryItem.GR_WATER)
        {
            System.out.println("Drink");
        }

    }
}
