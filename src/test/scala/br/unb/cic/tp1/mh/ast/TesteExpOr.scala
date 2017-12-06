package br.unb.cic.tp1.mh.ast

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast
import org.scalatest._

class TesteExpOr extends FlatSpec with Matchers  {

    "A boolean value of true and false" should "be evaluated to true" in {
        val valTrue  = ValorBooleano(true)
        val valFalse = ValorBooleano(false)
        val or = ExpOr(valTrue, valFalse)
        or.avaliar() should be (ValorBooleano(true))
    }


    "A boolean value of false and false" should "be evaluated to false" in {
        val valFalse  = ValorBooleano(false)

        val or = ExpOr(valFalse, valFalse)
        or.avaliar() should be (ValorBooleano(false))
    }

    "An Integer value of 5 and a boolean value of false" should "throw an exception" in {
        val val5 = ValorInteiro(5)
        val valFalse = ValorBooleano(false)

        val or = ExpOr(val5, valFalse)
        assertThrows[ExpressaoInvalida] {
            or.avaliar()
        }
    }
}
