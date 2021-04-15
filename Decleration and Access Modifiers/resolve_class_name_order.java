/**
Priority give by compiler while resolving class name
•	Explicit class import
•	Classes present in current working directory.
•	Implicit class import.
*/
 import java.util.Date;
import java.sql.*;
class resolve_class_name_order
{
    /**
    Date also present in sql package but in this case util package Date will be considered.
     */
        public static void main(String args[])
        {
            Date d=new Date();
            System.out.println("I am object of :"+d.getClass().getName());
        }
    
}