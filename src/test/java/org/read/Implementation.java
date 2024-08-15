package org.read;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Implementation 
{
public static void main(String[] args) throws StreamWriteException, DatabindException, IOException
{
File file = new File("C:\\Users\\hp\\eclipse-workspace\\Serialization_API\\src\\test\\resources\\WriteJsonFile.json");
ObjectMapper objectMapper = new ObjectMapper();
ArrayList<Batter> batter = new ArrayList();
Batter batter5 = new Batter("1001", "Regular");
Batter batter4 = new Batter("1002", "Chocolate");
Batter batter3 = new Batter("1003", "Blueberry");
Batter batter2 = new Batter("1004", "Devil's Food");
batter.add(batter2);
batter.add(batter3);
batter.add(batter4);
batter.add(batter5);
Batters batters = new Batters(batter );
ArrayList<Topping> topping = new ArrayList();
topping.add(new Topping("5001", "Java"));
topping.add(new Topping("5002", "Selenium"));
topping.add(new Topping("5003", "python"));
Root root = new Root("0001", "donut", "Cake", 0.55, batters , topping );
objectMapper.writeValue(file, root);
System.out.println("hi");
System.out.println("hello");


}
}