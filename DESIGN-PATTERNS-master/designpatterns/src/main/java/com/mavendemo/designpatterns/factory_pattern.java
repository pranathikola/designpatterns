package com.mavendemo.designpatterns;
interface Shape {
	   void draw();
	}
class Rectangle implements Shape {

	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
	}
class Square implements Shape {

	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
	}
class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	         
	      else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
	}
public class factory_pattern {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape1.draw();

	      //get an object of Square and call its draw method.
	      Shape shape2 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape2.draw();

	}

}


