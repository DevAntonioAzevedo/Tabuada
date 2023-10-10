// Estudo de lógica da programação - tema: Tabuada
// Solicita um número maior que 0 para calcular a tabuada até o limite escolhido pelo usuário
// Autor: Antônio Azevedo

programa
{
	
	funcao inicio()
	{
		inteiro num, limite, contador=1, resultado

		escreva("Digite um valor maior que zero que deseja consultar a tabuada:")
		leia(num)

		// Esse ciclo de repetição ficará em loop até que o usuário digite um número maior que 0 (zero)
		enquanto (num<=0) {
			escreva("Digite um valor maior que zero:")
			leia(num)
		}

		escreva("Digite um valor maior que zero para ser o limite da sua tabuada:")
		leia(limite)

		// Esse ciclo de repetição ficará em loop até que o usuário digite um número maior que 0 (zero)
		enquanto (limite<=0) {
			escreva("Digite um valor maior que zero:")
			leia(limite)
		}

		// Esse ciclo de repetição irá calcular o número para consulta da tabuada juntamente com o limite escolhido pelo usuário
		faca {
			resultado = num * contador
			escreva("Tabuada: " + num + " x " + contador + " = " + resultado + "\n")
			contador++
		} enquanto (contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 930; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */