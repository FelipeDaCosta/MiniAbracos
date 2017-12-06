package br.unb.cic.tp1.mh.ast

import br.unb.cic.tp1.exceptions.ExpressaoInvalida
import br.unb.cic.tp1.mh.ast
import org.scalatest._

class TesteExpNot extends FlatSpec with Matchers  {

    "A boolean value of true" should "be evaluated to false" in {
        val valTrue  = ValorBooleano(true)

        val not = ExpNot(valTrue)
        not.avaliar() should be (ValorBooleano(false))
    }


    "A boolean value of false" should "be evaluated to true" in {
        val valFalse  = ValorBooleano(false)

        val not = ExpNot(valFalse)
        not.avaliar() should be (ValorBooleano(true))
    }

    "An Integer value of 5" should "throw an exception" in {
        val val5 = ValorInteiro(5)

        val not = ExpNot(val5)
        assertThrows[ExpressaoInvalida] {
            not.avaliar()
        }
    }
}