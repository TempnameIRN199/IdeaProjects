package services;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.CharBuffer;

public final class FileSrvc
{
	private String strBuff;
	private int readBytes, writtenBytes;
	
	public String getStrBuff()
	{ return strBuff; }

	public void setStrBuff(String strBuff)
	{ this.strBuff = strBuff;  }

	public int getReadBytes()
	{ return readBytes; }

	public void setReadBytes(int readBytes)
	{ this.readBytes = readBytes; }

	public int getWrittenBytes()
	{ return writtenBytes; }

	public void setWrittenBytes(int writtenBytes)
	{ this.writtenBytes = writtenBytes; }

	public FileSrvc()
	{
		readBytes = writtenBytes = 0;
		strBuff = "";
	}
	
	public void read(String filePath) throws IOException, FileNotFoundException
	{
		FileReader fileRdr = new FileReader(filePath);
		CharBuffer charBuff = CharBuffer.allocate(8192);
		
		while (fileRdr.read(charBuff) != -1)
		{
			charBuff.flip();
			
			this.strBuff += charBuff.toString();
			this.readBytes += charBuff.capacity();
			
			charBuff.clear();
		}
		
		fileRdr.close();
	}
	
	public void write(String filePath) throws IOException
	{
		FileWriter fileWrtr = new FileWriter(filePath);
		
		fileWrtr.write(this.strBuff);
		
		this.writtenBytes += strBuff.length();
		this.strBuff = "";
		
		fileWrtr.flush();
		fileWrtr.close();
	}
}
