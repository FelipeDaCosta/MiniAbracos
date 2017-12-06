package br.unb.cic.tp1.mh.ast
import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.visitors.Visitor

/**
  * Created by felipecosta on 12/6/17.
  */
case class ExpNot(exp: Expressao ) extends Expressao {
    override def avaliar(): Valor = {
        if(!exp.avaliar().isInstanceOf[ValorBooleano]) {
            throw ExpressaoInvalida()
        }
        val v1 = exp.avaliar().asInstanceOf[ValorBooleano]
        return ValorBooleano(!v1.valor)
    }

    override def verificaTipo: Tipo = {
        if(exp.verificaTipo == TBool()) {
            return TBool()
        }
        return TErro()
    }

    override def aceitar(v: Visitor): Unit = {

    }
}
