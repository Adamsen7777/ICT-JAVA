/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ADAMSEN BRANAY
 */
class parent
{
    String parent_name;
    int parent_age;
    
    void get_parent()
    {
        System.out.println(parent_name+" is "+parent_age+" years old and father.");
    }
}

public class child extends parent{
    
    String name;
    int age;
    
    void get_age()
    {
        System.out.println(name+" is "+age+" years old." );
        
    }
    
}
