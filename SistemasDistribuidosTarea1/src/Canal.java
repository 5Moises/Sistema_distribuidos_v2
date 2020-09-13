import java.io.*;

import javax.swing.JOptionPane;
public class Canal {			 
			int x,y,z;	
	
	 
      public Canal(int x, int y, int z) {
				super();
				this.x = x;
				this.y = y;
				this.z = z;
			}
	public void Traslacion()
	    {	
		  /* nX = x + Tx
		     nY = y + Ty
		     nZ = z + Tz */
    	 	
		try {
			File outputFile = new File("NuevasCoordenadas.TXT");
			FileWriter fw = new FileWriter(outputFile);
			int c;
			int Tx=Integer.parseInt(JOptionPane.showInputDialog("Distancia de X "+"Coordenada Actual: "+ this.x ));
			int Ty=Integer.parseInt(JOptionPane.showInputDialog("Distancia de Y "+"Coordenada Actual: "+ this.y ));
			int Tz=Integer.parseInt(JOptionPane.showInputDialog("Distancia de Z "+"Coordenada Actual: "+ this.z ));
			String cad="Nueva coordenada de X: "+(this.x+Tx)+"\n";
			String cad1="Nueva coordenada de Y: "+(this.y+Ty)+"\n";
			String cad2="Nueva coordenada de Z: "+(this.z+Tz)+"\n";
			StringReader X= new StringReader(cad);
			StringReader Y= new StringReader(cad1);
			StringReader Z= new StringReader(cad2);

			//-----------------------------------------
			while ((c = X.read()) != -1) {
			fw.write(c);
			}
			X.close();
			while ((c = Y.read()) != -1) {
			fw.write(c);
			}
			Y.close();
			while ((c = Z.read()) != -1) {
			fw.write(c);
			}
			Z.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("FileStreamsTest: " + e);
			} catch (IOException e) {
			System.err.println("FileStreamsTest: " + e);
			}
    	  	 
	    }
	 public void Rotacion()
	    { 
		 try {
				File outputFile = new File("NuevasCoordenadas.TXT");
				FileWriter fw = new FileWriter(outputFile);
		    int c;
		    int opc=Integer.parseInt(JOptionPane.showInputDialog("1. Cambiar Rotacion en torno de x \n"
		    		                                           + "2. Cambiar Rotacion en torno de y \n"
		    		                                           + "3. Cambiar Rotacion en torno de z"));  
		 
		switch(opc) {
		case 1:
			int Tx=Integer.parseInt(JOptionPane.showInputDialog("Angulo de X "));
			
			 /* nX = X 
		        nY = ycos()° - zsin()°
		        nZ = ysin()° + Zcos()°
		     */
			String x1="Nueva coordenada de X: "+(this.x)+"\n";
			String x2="Nueva coordenada de Y: "+(this.y*Math.cos(Tx)-this.z*Math.sin(Tx))+"\n";
			String x3="Nueva coordenada de Z: "+(this.y*Math.sin(Tx)+this.z*Math.cos(Tx))+"\n";
			StringReader X= new StringReader(x1);
			StringReader Y= new StringReader(x2);
			StringReader Z= new StringReader(x3);

			//-----------------------------------------
			while ((c = X.read()) != -1) {
			fw.write(c);
			}
			X.close();
			while ((c = Y.read()) != -1) {
			fw.write(c);
			}
			Y.close();
			while ((c = Z.read()) != -1) {
			fw.write(c);
			}
			Z.close();
			fw.close();
		break;
		 
		 
		 case 2:
			 int Ty=Integer.parseInt(JOptionPane.showInputDialog("Angulo de Y "));
		 /* nX = Zsin()° + xcos()° 
	        nY = Y
	        nZ = zcos()° - xsen()°
	     */
			 String y1="Nueva coordenada de X: "+(this.z*Math.sin(Ty) + this.x*Math.cos(Ty))+"\n";
				String y2="Nueva coordenada de Y: "+(this.y)+"\n";
				String y3="Nueva coordenada de Z: "+(this.z*Math.cos(Ty) - this.x*Math.sin(Ty))+"\n";
				StringReader XY= new StringReader(y1);
				StringReader YY= new StringReader(y2);
				StringReader ZY= new StringReader(y3);

				//-----------------------------------------
				while ((c = XY.read()) != -1) {
				fw.write(c);
				}
				XY.close();
				while ((c = YY.read()) != -1) {
				fw.write(c);
				}
				YY.close();
				while ((c = ZY.read()) != -1) {
				fw.write(c);
				}
				ZY.close();
				fw.close();
		 break;
		 case 3:
			int Tz=Integer.parseInt(JOptionPane.showInputDialog("Angulo de Z "));
		 /* nX = xcos()° - ysin()°  
	        nY = xsin()° + ycos()°
	        nZ = Z
	     */
			String cad="Nueva coordenada de X: "+(this.x*Math.cos(Tz) - this.y*Math.sin(Tz))+"\n";
			String cad1="Nueva coordenada de Y: "+(this.x*Math.sin(Tz) + this.y*Math.cos(Tz))+"\n";
			String cad2="Nueva coordenada de Z: "+(this.z)+"\n";
			StringReader XZ= new StringReader(cad);
			StringReader YZ= new StringReader(cad1);
			StringReader ZZ= new StringReader(cad2);

			//-----------------------------------------
			while ((c = XZ.read()) != -1) {
			fw.write(c);
			}
			XZ.close();
			while ((c = YZ.read()) != -1) {
			fw.write(c);
			}
			YZ.close();
			while ((c = ZZ.read()) != -1) {
			fw.write(c);
			}
			ZZ.close();
			fw.close();
	     break;
		 }
		 } catch (FileNotFoundException e) {
				System.err.println("FileStreamsTest: " + e);
				} catch (IOException e) {
				System.err.println("FileStreamsTest: " + e);
				}
	     
	    }
	 public void Escalacion()
	    {
		  /* nX = x * Tx
	         nY = y * Ty
	         nZ = z * Tz 
	      */		 	 
		  
		 try {
				File outputFile = new File("NuevasCoordenadas.TXT");
				FileWriter fw = new FileWriter(outputFile);
				int c;
				int Tx=Integer.parseInt(JOptionPane.showInputDialog("Escala de X "+"Coordenada Actual: "+ this.x ));
				int Ty=Integer.parseInt(JOptionPane.showInputDialog("Escala de Y "+"Coordenada Actual: "+ this.y ));
				int Tz=Integer.parseInt(JOptionPane.showInputDialog("Escala de Z "+"Coordenada Actual: "+ this.z ));
				String cad="Nueva coordenada de X: "+(this.x*Tx)+"\n";
				String cad1="Nueva coordenada de Y: "+(this.y*Ty)+"\n";
				String cad2="Nueva coordenada de Z: "+(this.z*Tz)+"\n";
				StringReader X= new StringReader(cad);
				StringReader Y= new StringReader(cad1);
				StringReader Z= new StringReader(cad2);

				//-----------------------------------------
				while ((c = X.read()) != -1) {
				fw.write(c);
				}
				X.close();
				while ((c = Y.read()) != -1) {
				fw.write(c);
				}
				Y.close();
				while ((c = Z.read()) != -1) {
				fw.write(c);
				}
				Z.close();
				fw.close();
				
			} catch (FileNotFoundException e) {
				System.err.println("FileStreamsTest: " + e);
				} catch (IOException e) {
				System.err.println("FileStreamsTest: " + e);
				}
	    	  	 
	    }
	 
	 
}
