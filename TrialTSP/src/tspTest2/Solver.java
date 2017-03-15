package tspTest2;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Solver {
	ArrayList<City> cities = new ArrayList<City>();
	
	double distance = Double.POSITIVE_INFINITY;
	//double closest;
	public Solver(ArrayList<City> cities)
	{
		this.cities = cities;
	}
	
	ArrayList<City> result = new ArrayList<City>();

	
	public double getDistance(City cityA, City cityB)
	{
		return Point2D.distance(cityA.x, cityA.y, cityB.x, cityB.y);
	}
	
	public void Solution(){
		try
		{
		City currentCity = cities.get(0);
		City closest = cities.get(0);
		cities.remove(0);
		System.out.println(cities.toString());
		while(cities.size() > 0)
		{

			result.add(currentCity);
			for(City possibleCity:cities)
			{
				if(getDistance(currentCity,possibleCity)<distance)
				{
					 closest = possibleCity;				 
					distance = getDistance(currentCity, possibleCity);
				}
					
			}
			distance = Double.POSITIVE_INFINITY;
            int i = cities.indexOf(closest);
            System.out.print(i+", ");
            System.out.println("removed city: " + cities.remove(closest));
            System.out.println(cities.toString());
            currentCity = closest;
		}

			
		}
		catch(Exception e){System.out.println(e);}
		
	
	}
	public int getIndex(City itemName)
	{
		for(int i = 0; i < cities.size(); i++)
		{
			City city = cities.get(i);
			if(itemName.equals(city.getName()))
					{
						return i;
					}
		}
		return -1;
	}
}
