package com.codes.designpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainMethod {

	public static void main(String[] args) throws ClassNotFoundException,
	NoSuchMethodException, SecurityException, InstantiationException, 
	IllegalAccessException, IllegalArgumentException, 
	InvocationTargetException, CloneNotSupportedException, IOException
	{
		//for ways to  breaking of singleton
		//1 Reflection
		Class<?> singletonClass=Class.forName("com.codes.designpattern.Singleton");
		Constructor<Singleton> constructor=
				(Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s=constructor.newInstance(); 
		
		//2 Object clone
		Singleton b=s.clone();
		
		//3 Serialization and deserizlization
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("D://abc.txt"));
	    os.writeObject("test");
	    os.close();
	    ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D://abc.txt"));
	    Singleton instance=(Singleton)ois.readObject();
	    ois.close();
	
	}

}
