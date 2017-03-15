package tspTest2;

import java.awt.geom.Point2D;

public class City extends Point2D.Double {
		private String name;
		
		//City created by point and data etc
		
		public City(String name, double x, double y)
		{
			super(x,y);
			this.name = name;
		}
		
		//Get city's name and returns the name or number associated
		
		public String getName()
		{
			return name;
		}
}
