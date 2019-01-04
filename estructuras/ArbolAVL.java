package com.edd.estructuras;


public class ArbolAVL {
	
	private NodoArbolAVL raiz;
	
	public ArbolAVL() 
	{
		raiz=null;
	}
	
	
	public NodoArbolAVL buscar(String id, NodoArbolAVL  r) 
	{
		if(raiz==null) 
		{
			return null;
		}else if(r.usuario.getId()==id) 
		{
			return r;
			
			//si  el id del nodo es menor al id ingresado
		}else if(r.usuario.getId().compareTo(id) < 0 ) 
		{
			return buscar(id,r.der);
		}else
		{
			return buscar(id,r.izq);	
		}
		
	}
	
	
	//obtner el factor de equilibrio 
	public  int  obtenerFE(NodoArbolAVL x) 
	{
		if(x==null) 
		{
			return -1;
			
		}else 
		{
			return x.fe;
		}
	}
	
	//Rotacion simple Izquierda
	public NodoArbolAVL rotacionIzq(NodoArbolAVL c) 
	{ 
		 NodoArbolAVL aux = c.izq;
		 c.izq = aux.der;
		 aux.der =c;
		 
		 c.fe= Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
		 aux.fe = Math.max(obtenerFE(aux.izq),obtenerFE(aux.der))+1;
	
		 return aux;
	}
	
	
	//rotacion 	simple Derecha
	public NodoArbolAVL rotacionDer(NodoArbolAVL c) 
	{ 
		 NodoArbolAVL aux = c.der;
		 c.der = aux.izq;
		 aux.izq =c;
		 
		 c.fe= Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
		 aux.fe = Math.max(obtenerFE(aux.izq),obtenerFE(aux.der))+1;
	
		 return aux;
	}
	
	//rotacion doble a la izquierda
	public NodoArbolAVL rotacionDobleIzq(NodoArbolAVL c) 
	{
		c.izq = rotacionDer(c.izq);
		return rotacionIzq(c);
	}
	
	//rotacion doble a la derecha
	public NodoArbolAVL rotacionDobleDer(NodoArbolAVL c) 
	{
		NodoArbolAVL temp;
		c.der = rotacionIzq(c.der);
		temp = rotacionDer(c);
		return temp;
	}
	
	
	//metodo insertar avl
/*public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr) 
	{
		NodoArbolAVL nuevoPadre = subAr;
		
			//si el id de nevo es menor que el id del subarbol
		if(nuevo.usuario.getId().compareTo(subAr.usuario.getId())<0) 
		{
			if(subAr.izq ==null) 
			{       	
				subAr.izq=nuevo;
			}else 
			{
				subAr.izq =insertarAVL(nuevo, subAr.izq);
				
				if (  ( obtenerFE(subAr.izq) - obtenerFE(subAr.der) ) == 2  )
				{
					
					
				}
			}
			
		}else 
		{
			
			
		}
	}*/
	

}
