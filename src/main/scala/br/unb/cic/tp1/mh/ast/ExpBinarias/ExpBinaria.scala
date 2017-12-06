package br.unb.cic.tp1.mh.ast.ExpBinarias

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast.{Expressao, TErro, Tipo, Valor}

/**
  * Created by felipecosta on 12/6/17.
  *
  * Todas as expressoes binarias tem os metodos avaliar e verificar tipos mt parecidos,
  * a unica diferenca eh sempre o tipo dos valores operados e a operacao usada.
  * Com essa classe abstrata, as expressoes binarias so precisam herdar dela e implementar
  * a funcao operacao nos valores v1 e v2. A classe faz todo o resto
  *
  * parameters:
  * lhs, rhs -> exp esquerda e direita da esxpressao binaria
  * tipo -> tipos dos valores lhs e rhs
  */
abstract class ExpBinaria[T](rhs: Expressao, lhs: Expressao, tipo: Tipo) extends Expressao{
    def operacao(v1: T,v2: T): Valor

    // Checa os tipos e joga exception ExpressaoInvalida se nao tiver correto
    // So faz isso quando a expressao for avaliada
    def checarTipos(): Unit = {
        if(verificaTipo == TErro()) {
            throw ExpressaoInvalida()
        }
    }

    // Faz a operacao que vai ser passada como parametro
    override def avaliar() = {
        checarTipos()
        val v1 = rhs.avaliar().asInstanceOf[T]
        val v2 = lhs.avaliar().asInstanceOf[T]
        operacao(v1, v2)
    }

    override def verificaTipo: Tipo = {
        val t1 = rhs.verificaTipo
        val t2 = lhs.verificaTipo

        if(t1 == tipo && t2 == tipo) {
            return tipo
        }
        else {
            return TErro()
        }
    }
}
