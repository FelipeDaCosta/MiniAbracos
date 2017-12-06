package br.unb.cic.tp1.mh.ast
import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.visitors.Visitor

case class ExpSoma(rhs : Expressao, lhs : Expressao) extends ExpBinaria[ValorInteiro](rhs, lhs, TInt()) {


  override def aceitar(v: Visitor): Unit = {
    v.visitar(this)
  }

  override def operacao(v1: ValorInteiro, v2: ValorInteiro): Valor = {
    return ValorInteiro(v1.valor + v2.valor)
  }
}
