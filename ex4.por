programa {
	funcao inicio() {
		
		inteiro numero, resultado, contador 
		
		escreva("\nInforme um número: ")
		leia(numero)
		
		para(contador = 0; contador <= 10; contador++){
		    resultado = numero * contador
		    escreva("\nNumero ", numero, " multiplicado por ", contador, " é igual a: ", resultado)
		}
	}
}
