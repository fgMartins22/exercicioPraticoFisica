import kotlin.math.pow

class Fisica {
    //Força Peso
    fun calcularForcaPeso(massa: Float) = massa * 10
    //Força Centrípeta
    fun calcularForcaCentripeta(massa: Float, velocidade: Float, raio: Float) = massa * ((velocidade.pow(2)) / raio)
    //Impulso
    fun impulso(forca: Float, tempoInicial: Float, tempoFinal: Float) = forca * (tempoFinal - tempoInicial)
    //Força Elástica
    fun forcaElastica(constanteElastica: Float, deformacaoMola: Float) = constanteElastica * deformacaoMola
    //Velocidade Média
    fun velocidadeMedia(deslocamentoFinal: Float, deslocamentoInicial: Float, tempoFinal: Float, tempoInicial: Float) = (deslocamentoFinal - deslocamentoInicial) / (tempoFinal - tempoInicial)
    //Movimento Retilíneo Uniformemente (MRU)
    fun mru(deslocamentoInicial: Float, velocidade: Float, tempo: Float, aceleracao: Float) = deslocamentoInicial + velocidade * tempo + (aceleracao * tempo.pow(2)/2)
    //Movimento Retilíneo Uniformemente Variado (MRUV)
    fun mruv(deslocamentoInicial: Float, velocidade: Float, tempoFinal: Float, tempoInicial: Float) = deslocamentoInicial + velocidade * (tempoFinal - tempoInicial)
}