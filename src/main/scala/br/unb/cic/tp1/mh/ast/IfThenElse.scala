package br.unb.cic.tp1.mh.ast
import br.unb.cic.tp1.mh.visitors.Visitor

/**
  * Created by felipecosta on 12/6/17.
  */
case class IfThenElse(condicao: ValorBooleano, seTrue: Expressao, seFalse: Expressao) extends Expressao{
    override def avaliar(): Valor = {
        if(condicao.avaliar() == ValorBooleano(true)) {
            seTrue.avaliar()
        }
        else {
            seFalse.avaliar()
        }
    }

    override def verificaTipo: Tipo = TIf()

    override def aceitar(v: Visitor): Unit = {
        v.visitar(this)
    }
}
