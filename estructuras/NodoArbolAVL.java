package com.edd.estructuras;

import com.edd.objetos.Usuario;

public class NodoArbolAVL {
	
	
	Usuario usuario;
	int fe;
	NodoArbolAVL izq;
	NodoArbolAVL der;
	
	public NodoArbolAVL(Usuario usuario) 
	{
		this.usuario = usuario;
		this.fe=0;
		this.izq=null;
		this.der= null;
	}

}
