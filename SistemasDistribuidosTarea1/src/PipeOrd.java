import java.io.*;

import javax.swing.JOptionPane;


public class PipeOrd {
	 public static void main(String[] args) throws IOException{
		
		 try {
			 FileReader Numeros = new FileReader("Numeros.txt");			 
			 Reader NumerosOrdenados = Ordenar(Numeros);
			 BufferedReader br = new BufferedReader(NumerosOrdenados);
			 String input;
			 PrintWriter stdout = new PrintWriter(System.out, true);
			 while ((input = br.readLine()) != null)
			 {
				 stdout.println(input);
			 }
			 br.close();			 
		 } catch (Exception e) 
		 {
			 System.err.println("RhymingWords: " + e);
		 }		 
	}
			 public static Reader Ordenar(Reader source) {
				 PipedWriter pw = null;
				 PipedReader pr = null;
				 int opc;
				 try {
					 BufferedReader br = new BufferedReader(source);
					 pw = new PipedWriter();
					 pr = new PipedReader(pw);
					 PrintWriter output = new PrintWriter(pw);
					 
						 opc=Integer.parseInt(JOptionPane.showInputDialog(" 1. Ordenaciones \n 2. Datos de un objeto 3D \n 0. Salir"));
						 
						 switch (opc)
							{
								case 1:
								   new OrdThread(output, br).start();
								break;	
								case 2:								
									int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada X"));
									int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada Y"));
									int z=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada Z"));
									int tarea=Integer.parseInt(JOptionPane.showInputDialog(" 1. Traslación  \n 2. Rotación \n 3.Escalación "));
									
									Canal DD = new Canal(x,y,z);
										switch(tarea)
										{
											     case 1:
											    	 DD.Traslacion();				 
												 break;
												 case 2:					 
													 DD.Rotacion();
												 break;						
												 case 3:
													 DD.Escalacion();
											     break;
										}       
								break;
					        } 
					 
					 					 
				    } catch (Exception e) {
					 System.err.println("RhymingWords sort: " + e);
				 }
					 return pr;
			 }			 
}
