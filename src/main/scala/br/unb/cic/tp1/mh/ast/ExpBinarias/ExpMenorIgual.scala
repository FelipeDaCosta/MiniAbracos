package br.unb.cic.tp1.mh.ast.ExpBinarias

import br.unb.cic.tp1.mh.ast._
import br.unb.cic.tp1.mh.visitors.Visitor

case class ExpMenorIgual(rhs : Expressao, lhs : Expressao) extends ExpBinaria[ValorInteiro](rhs, lhs, TInt()) {

  override def aceitar(v: Visitor): Unit = {
  }

  override def operacao(v1: ValorInteiro, v2: ValorInteiro): Valor = {
    return ValorBooleano(v1.valor <= v2.valor)
  }
}