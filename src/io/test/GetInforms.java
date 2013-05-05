package io.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.text.InternationalFormatter;

public class GetInforms
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		// FileReader reader = new FileReader("E:\\TestFile\\无题.txt");
		// int i;
		// try
		// {
		// while ((i = reader.read()) != -1)
		// {
		// System.out.print((char) i);
		//
		// }
		// }
		// catch (Exception e)
		// {
		// e.printStackTrace();
		// }
		// finally
		// {
		// reader.close();
		// }

		InputStream in = new FileInputStream("E:\\TestFile\\无题.txt");
		InputStreamReader reader = new InputStreamReader(in, "utf-8");
		int i;
		while ((i = reader.read()) != -1)
		{
			System.out.print((char) i);

		}
		reader.close();
	}

}
