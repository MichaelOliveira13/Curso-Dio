programa {
	funcao inicio() {
	    
	    inteiro idade
	    escreva("\nInforme sua idade por favor: ")
	    leia(idade)
	    
	    se(idade < 0 ){
	        escreva("\nIdade Inválida!")
	        
	    }senao se (idade < 18){
	        escreva("\nCriança não pode baladinha")
	    
	        
	    }senao se (idade >= 18 e idade < 65){
	        escreva("\nAdulto")
	        
	    }senao se (idade < 0){
	        escreva("\nIdade Inválida")
	    
	    }senao{
	        escreva("\nIdoso")
	    }  
	}
}
