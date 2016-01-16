import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking 
{
	public static void main(String[] args) 
	{
		for (int j = 0; j < 4; j++) 
		{
		String sentence = JOptionPane.showInputDialog("Please type a sentence.");
		speak(sentence);
		}
	}

static void speak(String words) 
{
   	 try 
   	 {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) 
   	 {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014
