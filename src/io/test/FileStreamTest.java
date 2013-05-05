package io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{

		FileReader reader = new FileReader("E:\\TestFile\\newTest.txt");
		int i;
		while ((i = reader.read()) != -1)
		{
			System.out.print((char) i);

		}

		BufferedReader bufferedReader = new BufferedReader(reader);
		String s;
		int i2;
		while ((i2 = bufferedReader.read()) != -1)
		{
			System.out.print((char) i2);

		}

		while ((s = bufferedReader.readLine()) != null)
		{
			System.out.println(s);

		}

		reader.close();
	}

}
