package br.unb.cic.tp1.mh.ast

import org.scalatest._

/**
  * Created by felipecosta on 12/6/17.
  */
class TesteIfThenElse  extends FlatSpec with Matchers {
    "An if c then 5 else 10" should "be evaluated to 5 when c = true" in {
        val valTrue = IfThenElse(ValorBooleano(true), ValorInteiro(5), ValorInteiro(10))

        valTrue.avaliar() should be (ValorInteiro(5))
    }

    "An if c then 5 else -10" should "be evaluated to -10 when c = false" in {
        val valFalse = IfThenElse(ValorBooleano(false), ValorInteiro(5), ValorInteiro(-10))

        valFalse.avaliar() should be (ValorInteiro(-10))
    }
}
