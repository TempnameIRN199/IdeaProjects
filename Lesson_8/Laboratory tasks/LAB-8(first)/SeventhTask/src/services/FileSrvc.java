package services;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.CharBuffer;

import java.util.Map;
import java.util.HashMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
    public Map<String, Integer> filter(Map<String, String> replacementValues)
    {
        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, String> entry : replacementValues.entrySet())
        {
            String target = entry.getKey();
            String replacement = entry.getValue();
            int count = 0;

            // Count occurrences and replace the target string with the replacement string
            int index = strBuff.indexOf(target);
            while (index != -1)
            {
                count++;
                strBuff = strBuff.substring(0, index) + replacement + strBuff.substring(index + target.length());
                index = strBuff.indexOf(target, index + replacement.length());
            }

            // Add to the result map
            result.put(target, count);
        }

        return result;
    }
}
