programa
{

	cadeia nomes[3][3]
	inteiro linha, coluna
	
	funcao inicio()
	{
		para(linha = 0; linha < 3; linha++)
		{
			para(coluna = 0; coluna <3; coluna++)
			{
				escreva("Informe o nome do aluno ",linha,"|",coluna,": ")
				leia(nomes[linha][coluna])
				limpa()
			}	
		}

		limpa()

		para(linha = 0; linha < 3; linha++)
		{
			para(coluna = 0; coluna <3; coluna++)
			{
				escreva(nomes[linha][coluna]," | ")	
			}
			escreva("\n")	
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */