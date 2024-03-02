// Main class
class GFG {
 
    // Declaring and initializing string
    String name = "BhushanSoftware";
 
    // Main driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try {
            Class cls = Class.forName("GFG");
            // Creating object of main class
            // using instance method
            GFG obj = (GFG)cls.newInstance();
            // Print and display
            System.out.println(obj.name);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
 
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
 
            e.printStackTrace();
        }
    }
}