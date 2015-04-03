package darts_trie;

import java.util.Arrays;

public class DoubleArrayTrieStudy {
	int[] base;
	int[] check;
	
	public DoubleArrayTrieStudy()
	{
		base = new int[Integer.MAX_VALUE];
		check = new int[Integer.MAX_VALUE];
		
		base[0] = 1;
		check[0] = 0;
	}
	
	public void insert()
	{
		String input = "fdafaddfa";
		insert(input);
	}
	
	public void insert(String input)
	{
		char[] inputChar = input.toCharArray();
		byte[] inputByte = input.getBytes();
		int[] inputInt = new int[inputChar.length];
		
		for(int i=0;i<inputChar.length;++i)
		{
			inputInt[i] = (int)inputChar[i];
		}
		
		int pre = 0;
		int cur = 0;
		for(int i=0;i<inputChar.length;++i)
		{
			int temp = inputInt[i];
			cur = check[pre]+temp;
		}
		
		
		
		
		System.out.println(Arrays.toString(inputChar));
		System.out.println(Arrays.toString(inputInt));
		System.out.println(Arrays.toString(inputByte));
			
	}
	
	
	
	public static void main(String[] args)
	{
		DoubleArrayTrieStudy doubleArrayTrie = new DoubleArrayTrieStudy();
		doubleArrayTrie.insert();
	}
	

}
