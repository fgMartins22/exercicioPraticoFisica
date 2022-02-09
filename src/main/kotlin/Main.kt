import kotlin.math.round

fun main() {
    val calcular = Fisica()
        do{
            println("****************************************************")
            println("********* Fórmulas Dinâmicas e Cinemáticas *********")
            println("****************************************************")
            println("")
            println("****************")
            print("1: Força Peso\n2: Força Centrípeta\n3: Impulso\n" +
                  "4: Força Elástica\n5: Velocidade Média\n6: MRU\n7: MRUV\n8: Sair\n")
            println("****************")
            println("")
            print("O que deseja calcular? \n")

            val choose = readLine()!!.toInt()

            when(choose) {
                1 -> {//Força Peso
                        println("Calcular Força Peso")
                        println("")
                        print("Digite o valor da Massa: \n")
                        val massa = readLine()!!.toFloat()

                        val forcaPeso = round(calcular.calcularForcaPeso(massa))
                        println("")
                        println("O resultado da Força Peso é $forcaPeso!")
                        println("")
                }
                2 -> {//Força Centrípeta
                        println("Calcular Força Centrípeta")
                        println("")
                        print("Digite o valor da Massa: \n")
                        print("")
                        val massa = readLine()!!.toFloat()
                        print("Digite o valor da Velocidade: \n")
                        println("")
                        val velocidade = readLine()!!.toFloat()
                        print("Digite o valor do Raio: \n")
                        println("")
                        val raio = readLine()!!.toFloat()

                        val forcaCentripeta = round(calcular.calcularForcaCentripeta(massa, velocidade, raio))
                        println("")
                        println("O resultado da Força Centrípeta é $forcaCentripeta!")
                        println("")
                }
                3 -> {//Impulso
                        println("Calcular Impulso")
                        println("")
                        print("Digite o valor da Força: \n")
                        println("")
                        val forca = readLine()!!.toFloat()
                        print("Digite o valor da Velocidade Inicial: \n")
                        println("")
                        val velocidadeInicial = readLine()!!.toFloat()
                        print("Digite o valor da Velocidade Final: \n")
                        println("")
                        val velocidadeFinal = readLine()!!.toFloat()

                        val impulso = round(calcular.impulso(forca, velocidadeInicial, velocidadeFinal))
                        println("")
                        println("O resultado do Impulso é $impulso!")
                        println("")

                }
                4 -> {//Força Elástica
                        println("Calcular Força Elástica")
                        println("")
                        print("Digite o valor da Constante Elástica (K): \n")
                        println("")
                        val k = readLine()!!.toFloat()
                        print("Digite o valor da Constante de Deformação (X): \n")
                        println("")
                        val x = readLine()!!.toFloat()

                        val forcaElastica = round(calcular.forcaElastica(k,x))
                        println("")
                        println("O resultado da Força Elástica é $forcaElastica!")
                        println("")

                }
                5 -> {//Velocidade Média
                        println("Calcular a Velocidade Média")
                        println("")
                        print("Digite o valor da Posição Inicial: \n")
                        println("")
                        val pI = readLine()!!.toFloat()
                        print("Digite o valor da Posição Final: \n")
                        println("")
                        val pF = readLine()!!.toFloat()
                        print("Digite o valor do Tempo Inicial: \n")
                        println("")
                        val tI = readLine()!!.toFloat()
                        print("Digite o valor do Tempo Final: \n")
                        println("")
                        val tF = readLine()!!.toFloat()

                        val velocidadeMedia = round(calcular.velocidadeMedia(pI, pF, tI, tF))
                        println("")
                        println("O resultado da Velocidade Média é $velocidadeMedia!")
                        println("")
                }
                6 -> {//Movimento Retilíneo Uniformemente (MRU)
                        println("Calcular MRU")
                        println("")
                        print("Digite o valor da Posição Inicial: \n")
                        println("")
                        val pI = readLine()!!.toFloat()
                        print("Digite o valor da Velocidade: \n")
                        println("")
                        val v = readLine()!!.toFloat()
                        print("Digite o valor do Tempo: \n")
                        println("")
                        val t = readLine()!!.toFloat()
                        print("Digite o valor da Aceleração: \n")
                        println("")
                        val a = readLine()!!.toFloat()

                        val mru = round(calcular.mru(pI, v, t, a))
                        println("")
                        println("O resultado do MRU é $mru!")
                        println("")
                }
                7 -> {//Movimento Retilíneo Uniformemente Variado (MRUV)
                        println("Calcular MRUV")
                        println("")
                        print("Digite o valor da Posição Inicial: \n")
                        println("")
                        val pI = readLine()!!.toFloat()
                        print("Digite o valor da Velocidade: \n")
                        println("")
                        val v = readLine()!!.toFloat()
                        print("Digite o valor do Tempo Inicial: \n")
                        println("")
                        val tI = readLine()!!.toFloat()
                        print("Digite o valor do Tempo Final: \n")
                        println("")
                        val tF = readLine()!!.toFloat()

                        val mruv = round(calcular.mruv(pI, v, tI, tF))
                        println("")
                        println("O resultado do MRUV é $mruv!")
                        println("")
                }
                8 -> {//Sair
                    println("Obrigado pela preferência, volte sempre!! :D ;)")
                }

            }
        } while(choose != 8)
}