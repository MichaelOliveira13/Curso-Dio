programa {
	funcao inicio() {
	    
	    inteiro idade
	    escreva("\nInforme sua idade por favor: ")
	    leia(idade)
	    
	    se(idade < 0 ){
	        escreva("\nIdade Inv�lida!")
	        
	    }senao se (idade < 18){
	        escreva("\nCrian�a n�o pode baladinha")
	    
	        
	    }senao se (idade >= 18 e idade < 65){
	        escreva("\nAdulto")
	        
	    }senao se (idade < 0){
	        escreva("\nIdade Inv�lida")
	    
	    }senao{
	        escreva("\nIdoso")
	    }  
	}
}
