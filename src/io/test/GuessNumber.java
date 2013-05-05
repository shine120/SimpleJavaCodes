package io.test;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
	public static void main(String[] args)
	{
		GuessNumber guessNumber = new GuessNumber();
		guessNumber.game();

	}

	// 获取一次输入值
	private int scannerNumber()
	{
		Scanner in = new Scanner(System.in);
		return in.nextInt();

	}

	// 随机产生一个值
	private int randomNumber()
	{
		Random random = new Random();
		return random.nextInt(99) + 1;

	}

	// 比较大小
	private int compareNumber(int playerNumber, int randomNumber)
	{
		if (playerNumber > randomNumber)
		{
			System.out.println("你猜的数字太大了，加油！");
			return 1;
		}
		else if (playerNumber < randomNumber)
		{
			System.out.println("你猜的数字太小了，加油！");
			return -1;

		}
		else
		{
			System.out.println("恭喜你猜对了！！");
			return 0;
		}
	}

	// 游戏进行类
	private void game()
	{
		int randomNumber = randomNumber();
		System.out.println("数字已经确定！");
		int playerNumber;
		do
		{
			System.out.println("请输入数字");
			playerNumber = scannerNumber();
		}
		while (compareNumber(playerNumber, randomNumber) != 0);
		System.out.println("答案是：" + randomNumber);
	}

}
