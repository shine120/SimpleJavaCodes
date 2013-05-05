package io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IOTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		tryOutput();
		tryInput();

	}

	private static void tryOutput() throws IOException
	{
		OutputStream out = new FileOutputStream("E:\\TestFile\\Input");
		OutputStreamWriter writer = new OutputStreamWriter(out);
		for (int i = 0; i < 10; i++)
		{
			writer.write(i);
		}
		writer.close();
		out.close();
	}

	private static void tryInput() throws IOException
	{
		InputStream in = new FileInputStream("E:\\TestFile\\Input");
		int n;
		while ((n = in.read()) != -1)
		{
			System.out.println(n);

		}
		in.close();

	}

}
