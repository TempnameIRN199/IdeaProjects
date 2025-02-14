package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;
import java.io.FileNotFoundException;

public final class ArrayFileSrvc
{
	private String filePath;
	private int[] arr;
	
	public String getFilePath()
	{ return filePath; }

	public void setFilePath(String filePath)
	{ this.filePath = filePath; }

	public int[] getArr()
	{ return arr; }

	public void setArr(int[] arr)
	{ this.arr = arr; }

	public ArrayFileSrvc(String filePath)
	{
		this.filePath = filePath;
	}
	
	public void read() throws IOException, FileNotFoundException, ClassNotFoundException
	{
		ObjectInputStream currObjInStrm = new ObjectInputStream(new FileInputStream(filePath));
		
		arr = (int[]) currObjInStrm.readObject();
		
		currObjInStrm.close();
	}
	
	public void write() throws IOException, FileNotFoundException
	{
		ObjectOutputStream currObjOutStrm = new ObjectOutputStream(new FileOutputStream(filePath));
		
		currObjOutStrm.writeObject(arr);
		
		currObjOutStrm.flush();
		currObjOutStrm.close();
	}
}
