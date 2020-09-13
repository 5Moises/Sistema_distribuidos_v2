import java.io.*;

import javax.swing.JOptionPane;

public class OrdThread extends Thread {
	 private PrintWriter out = null;
	 private BufferedReader in = null;
	 
	 
	 public OrdThread(PrintWriter out, BufferedReader in) {
		 this.out = out;
		 this.in = in;
	 }
	 public void run() {
		 int MAXWORDS = 9;
		 if (out != null && in != null) {
		 try {
			 String[] listOfWords = new String[MAXWORDS];
			 int numwords = 0;
			 
			 while ((listOfWords[numwords] =in.readLine()) != null)
				 numwords++;
			 int tarea=Integer.parseInt(JOptionPane.showInputDialog(" 1. Ascendente  \n 2. Descendente \n"));
				switch(tarea)
				{
					     case 1:
						 burbuja1(listOfWords);					 
						 break;
						 case 2:					 
					     burbuja2(listOfWords);
						 break;						 
				}
			 for (int i = 0; i < numwords; i++)
				 out.println(listOfWords[i]);
			 out.close();
		 } catch (IOException e) {
		 System.err.println("SortThread run: " + e);
		 }
	 
	 
		 }
		 }
	 
	 public static String[]  burbuja1(String[] arreglo)
	    {
		 
	      int auxiliar;
	      String[] arregloOrdenado;
	      for(int i = 2; i < arreglo.length; i++)
	      {
	        for(int j = 0;j < arreglo.length-i;j++)
	        {
	          if(Integer.parseInt(arreglo[j]) > Integer.parseInt(arreglo[j+1]))
	          {
	            auxiliar = Integer.parseInt(arreglo[j]);
	            arreglo[j] = arreglo[j+1];
	            arreglo[j+1] = Integer.toString(auxiliar);
	          }   
	        }
	      }
	      arregloOrdenado = arreglo;
	      return arregloOrdenado;
	    }
	 
	 public static String[]  burbuja2(String[] arreglo)
	    {
		 
	      int auxiliar;
	      String[] arregloOrdenado;
	      for(int i = 2; i < arreglo.length; i++)
	      {
	        for(int j = 0;j < arreglo.length-i;j++)
	        {
	          if(Integer.parseInt(arreglo[j]) < Integer.parseInt(arreglo[j+1]))
	          {
	            auxiliar = Integer.parseInt(arreglo[j]);
	            arreglo[j] = arreglo[j+1];
	            arreglo[j+1] = Integer.toString(auxiliar);
	          }   
	        }
	      }
	      arregloOrdenado = arreglo;
	      return arregloOrdenado;
	    }
	 }


