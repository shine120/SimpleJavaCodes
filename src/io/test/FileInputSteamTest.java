package io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/***
 * 字节输出和输入测试
 * @author shine
 *
 */
public class FileInputSteamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("E:\\TestFile\\test.txt");
		
		
		for (int i = 0; i < 100; i++)
		{
			out.write(i);
		}
		
		out.close();
		
		
		
		OutputStreamWriter out2 = new OutputStreamWriter(out, "utf-8");
		
		for (int i = 0; i < 100; i++)
		{
			out2.write(i);
		}
		
		out2.close();
		
		
		InputStream in = new FileInputStream("E:\\TestFile\\newTest.txt");
		
		while (in.read() != -1)
		{
			System.out.println(in.read());
			
		}
		in.close();
		
	}

}
