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

	// ��ȡһ������ֵ
	private int scannerNumber()
	{
		Scanner in = new Scanner(System.in);
		return in.nextInt();

	}

	// �������һ��ֵ
	private int randomNumber()
	{
		Random random = new Random();
		return random.nextInt(99) + 1;

	}

	// �Ƚϴ�С
	private int compareNumber(int playerNumber, int randomNumber)
	{
		if (playerNumber > randomNumber)
		{
			System.out.println("��µ�����̫���ˣ����ͣ�");
			return 1;
		}
		else if (playerNumber < randomNumber)
		{
			System.out.println("��µ�����̫С�ˣ����ͣ�");
			return -1;

		}
		else
		{
			System.out.println("��ϲ��¶��ˣ���");
			return 0;
		}
	}

	// ��Ϸ������
	private void game()
	{
		int randomNumber = randomNumber();
		System.out.println("�����Ѿ�ȷ����");
		int playerNumber;
		do
		{
			System.out.println("����������");
			playerNumber = scannerNumber();
		}
		while (compareNumber(playerNumber, randomNumber) != 0);
		System.out.println("���ǣ�" + randomNumber);
	}

}
