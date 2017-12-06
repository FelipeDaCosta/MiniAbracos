package br.unb.cic.tp1.mh.ast.ExpBinarias

import br.unb.cic.tp1.mh.ast._
import br.unb.cic.tp1.mh.visitors.Visitor

/**
  * Created by felipecosta on 12/6/17.
  */
case class ExpOr(rhs: Expressao, lhs: Expressao) extends ExpBinaria[ValorBooleano](rhs, lhs, TBool()) {
    override def operacao(v1: ValorBooleano, v2: ValorBooleano): Valor = {
        return ValorBooleano(v1.valor || v2.valor)
    }

    override def aceitar(v: Visitor): Unit = {

    }
}
