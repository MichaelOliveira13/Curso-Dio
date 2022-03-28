programa {
    
    inclua biblioteca Util
    
	funcao inicio() 
	{
		inteiro ini, fim, soma = 0
		
		escreva("Informe o número inicial do intervalo: ")
		leia(ini)
		limpa()
		
		escreva("Informe o número final do intervalo: ")
		leia(fim)
		limpa()
		
		enquanto(ini <= fim)
		{
		    escreva("Soma antes de somar: ", soma, "\n")
		    
		    //Atualiza a soma com o valor do contador
		    //0,1,3,6,10,15,21,28,36,45,55
		    soma = soma + ini
		    
		    //Incrementa em 1 o valor do contador
		    //1,2,3,4,5,6,7,8,9,10
		    ini = ini + 1
		    
		    //Apresenta o valor da soma
		    escreva("Soma depois de somar: ", soma)
		    
		    Util.aguarde(1000)
		    limpa()
		}
		
		escreva("A soma é: ", soma)
		
	}
}
