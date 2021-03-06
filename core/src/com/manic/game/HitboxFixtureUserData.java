package com.manic.game;

import java.util.HashMap;

import com.manic.game.moves.Hitbox;
//import com.manic.game.moves.HitboxGroup;
//import com.manic.game.entities.Character;
import com.manic.game.entities.HitboxEntity;

/**
 * 
 * @class HitboxFixtureUserData
 * 
 * @brief An object that holds hitbox fixture user data
 * 
 * This is meant to be given to a Hitbox's Fixture as user data
 * 
 * This also allows you to access the fixture's entity
 * and hitbox directly through methods in the user data
 * 
 * @author Gabe Tucker
 * 
 * @contact gst06@roadrunner.com
 *
 */
public class HitboxFixtureUserData {

	private String entityID;
	
	private String hboxID;
	
	
	public HitboxFixtureUserData ( String eID , String hID ){
		
		setEntityID (eID);
		
		setHboxID (hID);
		
	}
	
	
	public void setEntityID ( String eID )
	{
		entityID = eID;
	}
	
	
	public void setHboxID ( String hID )
	{
		hboxID = hID;
	}
	

	public String getEntityID ()
	{
		
		return entityID;
		
	}
	
	
	public String getHitboxID ()
	{
		
		return hboxID;
		
	}
	
	
	//This takes the "global" hashmap of all characters and uses it to get the hitbox
	public Hitbox getHitbox( HashMap < String , HitboxEntity > hsh )
	{
		
		HitboxEntity ch = hsh.get( entityID );
		
		
		return ch.getHitbox(hboxID);
		
	}
	
	public HitboxEntity getEntity ( HashMap < String , HitboxEntity > hsh )
	{
		
		return hsh.get( entityID );
		
	}
	
	
}
