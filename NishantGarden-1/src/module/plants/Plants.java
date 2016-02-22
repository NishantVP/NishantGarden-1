/**
 * COEN 275 OOAD - Individual Project
 * Automated Gardening System
 * 
 * By Nishant Phatangare (W1108022)
 */

/*
 * --About this class--
 * This is an Abstract Class defining all the properties that plant has
 * Different types of plant can extend this class to inherit common properties 
 */
package module.plants;

public abstract class Plants {
		
	private double growth; 
	// Value of growth defines how much has plant grown.
	// growth = 0 means its a seed, growth = 1 means its fully grown plant
	
	private double growthRate;
	// Rate at which this plant will grow each day
	
	private double maxArea;
	// Each plant will take some space in garden. This variable defines maximum space that this plant will take.
	
	//Constructors
	protected Plants()
	{
		this.growth = 0.0;
		this.growthRate = 0.01;
		//Default plant in a garden takes 100 days to grow from seed.
		this.maxArea = 0.25;
		//Default plant in a garden takes 0.25 sq.m area (i.e. 50 cm by 50 cm)
	}
	
	//Getters
	

}
