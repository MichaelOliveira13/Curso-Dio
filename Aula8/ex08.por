programa {
    
    inclua biblioteca Util //biblioteca para utilizar
    
	funcao inicio() {
		
		inteiro contador
	    
	    escreva("Informe o tempo do contador: ")
	    leia(contador)
	    
	    limpa()
	    
	    enquanto(contador >= 0){
	        
	        escreva("Tempo para a detonação: ", contador, " segundos")
	        contador = contador - 1 //contador-- //contador-=1
	        Util.aguarde(1000)  //função de delay
	        limpa()
	        
	    }
	    
	    
	    escreva("Kaboommm!!!!")
	}
}
