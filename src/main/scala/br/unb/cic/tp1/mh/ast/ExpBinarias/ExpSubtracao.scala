package br.unb.cic.tp1.mh.ast.ExpBinarias

import br.unb.cic.tp1.mh.ast.{Expressao, TInt, Valor, ValorInteiro}
import br.unb.cic.tp1.mh.visitors.Visitor

/**
  * Created by felipecosta on 12/6/17.
  */
case class ExpSubtracao(rhs: Expressao, lhs: Expressao) extends ExpBinaria[ValorInteiro](rhs, lhs, TInt()) {
    override def operacao(v1: ValorInteiro, v2: ValorInteiro): Valor = {
        return ValorInteiro(v1.valor - v2.valor)
    }

    override def aceitar(v: Visitor): Unit = {

    }
}
