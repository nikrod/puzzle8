package Puzzle;

import java.util.Scanner;
import java.util.ArrayList;

public class Puzzle8 
{
	static class Nodo
	{
		Nodo aux1;
		Nodo aux2;
		Nodo aux3;
		Nodo aux4;
		int M[][];

		public Nodo(int [][]value)
		{
			this.M = value;
		}
	}
	
	public static void copiar(int M[][],int aux [][])
	{
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				aux[i][j]=M[i][j];
			}
		}
		
	}
	
	public static void LlenarMatriz(int [][] M)
	{
		/*Scanner leer=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		System.out.println("ingrese valor "+(i+1)+","+(j+1));
        		M[i][j]=leer.nextInt();
        	}
        }
        leer.close();*/
		
		
		 M[0][0]=2;
    	 M[0][1]=1;
    	 M[0][2]=3;
    	 M[1][0]=5;
    	 M[1][1]=6;
    	 M[1][2]=8;
    	 M[2][0]=4;
    	 M[2][1]=7;
    	 M[2][2]=0;
		
		
	}
	
	public static void imprimir(int [][]M)
	{
		System.out.println("");
		System.out.println("\t \t matriz"); 
		System.out.println("");
		System.out.println("");
		for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		System.out.print("|\t"+M[i][j]+"\t");
	        	}
	        	System.out.println("|");
	        }

	}
	
	public static int Comparar(int [][] M)
	{
		
		 int [][] aux=new int [3][3];
    	 aux[0][0]=1;
    	 aux[0][1]=2;
    	 aux[0][2]=3;
    	 aux[1][0]=4;
    	 aux[1][1]=5;
    	 aux[1][2]=6;
    	 aux[2][0]=7;
    	 aux[2][1]=8;
    	 aux[2][2]=0;
    	 
    	 for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		if(aux[i][j]!=M[i][j])
	        		{
	        			return 0;//son distintas
	        		}
	        		
	        	}
	        	
	        }
    	 return 1;//son iguales
    	 
    	 
	 }
	
	public static void CrearArbol()
	{
		
	 int [][] X = new int[3][3]; 
   	 LlenarMatriz(X);
   	 Nodo aux=new Nodo(X);
   	 GenerarM(aux.M);
	 	
	}
	

	
	public static void GenerarM(int [][]M)
	{
		if(M[0][0]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[0][0]=aux1[1][0]; //opcion 1
			aux1[1][0]=0;
			
			/*Nodo aux=new Nodo(aux1);
			insertar(L,aux);*/
			
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[0][0]=aux2[0][1];
			aux2[0][1]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
		}
		
		else if(M[0][1]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			
			aux1[0][1]=aux1[0][0];
			aux1[0][0]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[0][1]=aux2[0][2];
			aux2[0][2]=0;
			
			int aux3[][]=new int[3][3]; //opcion 3
			copiar(M,aux3);
			aux3[0][1]=aux3[1][1];
			aux3[1][1]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
			imprimir(aux3);
			GenerarM(aux3);
			
		}
		
		else if(M[0][2]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[0][2]=aux1[1][0]; //opcion 1
			aux1[1][0]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[0][2]=aux2[1][2];
			aux2[1][2]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
		}
		
		else if(M[1][0]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[1][0]=aux1[0][0];
			aux1[0][0]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[1][0]=aux2[1][1];
			aux2[1][1]=0;
			
			int aux3[][]=new int[3][3]; //opcion 3
			copiar(M,aux3);
			aux3[1][0]=aux3[2][2];
			aux3[2][2]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
			imprimir(aux3);
			GenerarM(aux3);
		}
		
		else if(M[1][1]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[1][1]=aux1[0][1];
			aux1[0][1]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[1][1]=aux2[1][0];
			aux2[1][0]=0;
			
			int aux3[][]=new int[3][3]; //opcion 3
			copiar(M,aux3);
			aux3[1][1]=aux3[1][2];
			aux3[1][2]=0;
			
			int aux4[][]=new int[3][3]; //opcion 4
			copiar(M,aux4);
			aux4[1][1]=aux4[2][1];
			aux4[2][1]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
			imprimir(aux3);
			GenerarM(aux3);
			imprimir(aux4);
			GenerarM(aux4);
			
			
		}
		
		else if(M[1][2]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[1][2]=aux1[0][2];
			aux1[0][2]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[1][2]=aux2[1][1];
			aux2[1][1]=0;
			
			int aux3[][]=new int[3][3]; //opcion 3
			copiar(M,aux3);
			aux3[1][2]=aux3[2][2];
			aux3[2][2]=0;	
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
			imprimir(aux3);
			GenerarM(aux3);
		}
		
		else if(M[2][0]==0)
		{
			int aux1[][]=new int[3][3];
			copiar(M,aux1);
			aux1[2][0]=aux1[1][0]; //opcion 1
			aux1[1][0]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[2][0]=aux2[2][1];
			aux2[2][1]=0;	
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
		}
		
		else if(M[2][1]==0)
		{
			int aux1[][]=new int[3][3]; //opcion 2
			copiar(M,aux1);
			aux1[2][1]=aux1[2][0];
			aux1[2][0]=0;
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			
			aux2[2][1]=aux2[1][1];
			aux2[1][1]=0;
			
			int aux3[][]=new int[3][3]; //opcion 3
			copiar(M,aux3);
			aux3[2][1]=aux3[2][2];
			aux3[2][2]=0;	
			
			imprimir(aux1);
			GenerarM(aux1);
			imprimir(aux2);
			GenerarM(aux2);
			imprimir(aux3);
			GenerarM(aux3);
		}
		
		else if(M[2][2]==0)
		{
			int aux1[][]=new int[3][3];
			copiar(M,aux1);
			aux1[2][2]=aux1[2][1]; //opcion 1
			aux1[2][1]=0;
			
			imprimir(aux1);
			GenerarM(aux1);
			
			int aux2[][]=new int[3][3]; //opcion 2
			copiar(M,aux2);
			aux2[2][2]=aux2[1][2];
			aux2[1][2]=0;
			
			
			imprimir(aux2);
			GenerarM(aux2);

		}

	}
        
    public static void main(String[] args) 
     {    
    	ArrayList<Integer> matrix = new ArrayList();
    	CrearArbol();

     }


        
        
    

}
