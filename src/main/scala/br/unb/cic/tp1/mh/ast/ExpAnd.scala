package br.unb.cic.tp1.mh.ast
import br.unb.cic.tp1.mh.visitors.Visitor

/**
  * Created by felipecosta on 12/6/17.
  */
case class ExpAnd(rhs : Expressao, lhs : Expressao) extends ExpBinaria[ValorBooleano](rhs, lhs, TBool()){
    override def operacao(v1: ValorBooleano, v2: ValorBooleano): Valor = {
        return ValorBooleano(v1.valor && v2.valor)
    }

    override def aceitar(v: Visitor): Unit = {

    }
}
